package hh.swd20.Bookstore.domain;

import hh.swd20.Bookstore.domain.Book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long>{

	List<Book> findByAuthor(String author);

}
