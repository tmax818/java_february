package tyler.bookcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.bookcrud.repositories.BookRepository;
import java.util.List;
import java.util.Optional;

import tyler.bookcrud.models.Book;;
@Service // this makes this file a service in Spring

// Service contains business logic
public class BookService {
    // connection to the repo
    @Autowired BookRepository bookRepository;
    //! CREATE

    public void createBook(Book book){
        bookRepository.save(book);
    }

    //! READ ALL
    public List<Book> allBooks(){
        return bookRepository.findAll();
    }

    //! READ ONE
    public Book getOneBook(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }

    //! UPDATE
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    //!DELETE
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
    
}
