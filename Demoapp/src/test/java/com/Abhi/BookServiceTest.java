package com.Abhi;


import com.Abhi.Repositories.BookDtaSrc;
import com.Abhi.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceTest {

    @Mock
    private BookDtaSrc dataSource;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testGetBookTitle() {
        // Arrange
        Long id = 1L;
        when(dataSource.findBookTitleById(id)).thenReturn("Mocked Title");

        // Act
        String result = bookService.getTitle(id);

        // Assert
        assertEquals("Mocked Title", result);
    }
}
