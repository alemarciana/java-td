package com.alessandra.mvc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alessandra.mvc.models.Book;
import com.alessandra.mvc.repositories.BookRepository;
import com.alessandra.mvc.services.BookService;

@Controller
public class BooksController {
    private final BookService bookService;
    
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/views/index.jsp";
    }
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/views/new.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Validated @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/views/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    @RequestMapping("/books/{id}")
    public String showBook(Model model, @PathVariable("id") Long id) {
    	Book book = bookService.findBook(id);
    	model.addAttribute("book", book);
    	return "views/show.jsp";
    }
    @RequestMapping(value="/books/{id}", method=RequestMethod.POST)
    public String deleteBook(@PathVariable("id") Long id) {
    	bookService.deleteBook(id);
    	return "views/index.jsp";
    }
    @RequestMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id") Long id, Model model) {
    	
    	return "views/index.jsp";
    }
}