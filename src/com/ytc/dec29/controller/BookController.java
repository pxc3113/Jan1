package com.ytc.dec29.controller;

import java.util.List;

import com.ytc.dec29.service.BookService;
import com.ytc.dec29.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired
    private BookService bookService;
    
    @RequestMapping("/getAll")
    public String getAll(Model model, Book book) {
        model.addAttribute("list", bookService.getAll(book));
        return "results";
    }
    @RequestMapping("/update")
    public String update(int id,int up) {
        bookService.update(id,up==1?0:1);
        return "results";
    }

}
