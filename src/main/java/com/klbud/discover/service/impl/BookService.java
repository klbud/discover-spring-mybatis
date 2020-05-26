package com.klbud.discover.service.impl;

import com.klbud.discover.dao.BookMapper;
import com.klbud.discover.entity.Question;
import com.klbud.discover.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kevin
 * 2020/5/25 - 16:47
 */
@Service
public class BookService implements IBookService {
    @Autowired
    BookMapper bookDao;

    public List<Question> getList() {
        return bookDao.getAllBooks();
    }
}
