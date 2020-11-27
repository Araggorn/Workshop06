package pl.coderslab.workshop06.service;

import pl.coderslab.workshop06.entity.Book;

import java.util.List;


public interface BookService {

    List<Book> getBooks();

    void add(Book book);

    Book get(Long id);

    void delete(Long id);

    void update(Book book);

    Book findById(Long id);
}
