package com.example.learning.jpa.jpaBookExample;

import java.util.List;

public interface BookService  {

    List<Books> getAllBooks();

    void  getBooksById(int bookid);

    Books save(Books books);

    void deleteBooksById(int bookid);

    Books  update( Books books,int bookid);
}
