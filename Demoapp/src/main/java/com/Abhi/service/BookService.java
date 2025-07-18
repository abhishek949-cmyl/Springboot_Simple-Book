package com.Abhi.service;

import com.Abhi.Repositories.BookDtaSrc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class BookService {

    private final BookDtaSrc dataSrc;

    @Autowired
    public BookService(BookDtaSrc dataSrc) {
        this.dataSrc = dataSrc;
    }

    public String getTitle(Long id) {
        return dataSrc.findBookTitleById(id);
    }
}
