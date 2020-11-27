package pl.coderslab.workshop06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.coderslab.workshop06.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("Select b from Book b")
    List<Book> getBooks();

//    @Query("SELECT b from Book b WHERE id = :id")
//    Book getFirstById(@Param id);

//    private final BookRepository bookRepository;
//
//    public JpaBookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//
//    }
//
//
//    @Override
//    public List<Book> getBooks() {
//        return bookRepository.findAll();
//    }
}
