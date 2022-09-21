package com.example.learning.jpa.jpaBookExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl  implements BookService{
    @Autowired
   private BookDao bookDao;

    @Override
    public List<Books> getAllBooks(){
    List<Books> books = new ArrayList<Books>();
        return (List<Books>) bookDao.findAll();
    }

    @Override
    public void getBooksById(int bookid)
    {
        bookDao.findById(bookid);
    }

    @Override
    public Books save(Books books)
    {

        return bookDao.save(books);
    }

    @Override
    public void deleteBooksById(int bookid)
    {
         bookDao.deleteById(bookid);

    }

    @Override
    public Books update(Books books ,int bookid) {

        Books books1 = bookDao.findById(bookid).get();

            if (Objects.nonNull(books.getBookname())
                    && !"".equalsIgnoreCase(
                    books.getBookname())) {
                books1.setBookname(
                        books.getBookname());
            }

            if (Objects.nonNull(books.getAuthor())
                    && !"".equalsIgnoreCase(
                    books.getAuthor())) {
                books1.setAuthor(
                        books.getAuthor());
            }

            if (Objects.nonNull(books.getPrice())
                    && !"".equalsIgnoreCase(
                    String.valueOf(books.getPrice()))) {
                books1.setPrice(
                        books1.getPrice());
            }

            return bookDao.save(books1);

    }


}


