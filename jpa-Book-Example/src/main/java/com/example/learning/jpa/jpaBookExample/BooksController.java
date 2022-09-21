package com.example.learning.jpa.jpaBookExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/books")
    private List<Books> getAllBooks(){

        return bookService.getAllBooks();
    }

    @GetMapping("/books/{bookid}")
    private void getBooks(@PathVariable("id") int bookid)
    {
        bookService.getBooksById(bookid);
    }

    @DeleteMapping("/books/{bookid}")
    private void  deleteBooks(@PathVariable int bookid){

        bookService.deleteBooksById(bookid);
    }

    @PostMapping("/books")
    private Books save(@RequestBody Books books){
        return bookService.save(books);

    }
    @PutMapping("/books/{bookid}")
    private Books  update(@RequestBody Books books,@PathVariable int bookid){
        return bookService.update(books,bookid);

    }


}

