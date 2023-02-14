package tyler.bookcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import tyler.bookcrud.models.Book;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
    
}
