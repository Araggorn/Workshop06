package pl.coderslab.workshop06.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.workshop06.entity.Book;
import pl.coderslab.workshop06.repository.BookRepository;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }
    @Override
    public Book get(Long id) {
        return bookRepository.getOne(id);
    }

  //  @Override
  //  public void add(Book book) {
  //      bookRepository.save(book);
  //  }
    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }
    @Override
    public Book findById(Long id) {
        return bookRepository.getOne(id);
    }
}