package com.Abhi.component;

import com.Abhi.Repositories.BookDtaSrc;
import org.springframework.stereotype.Component;


@Component
public class InmemoryBookDatasrc implements BookDtaSrc {
    @Override
    public String findBookTitleById(Long id) {
        return "Spring boot in Action";
    }
}
