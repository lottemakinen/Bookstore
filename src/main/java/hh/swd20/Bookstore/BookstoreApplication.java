package hh.swd20.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;


@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner carDemo(BookRepository bookRepository) { 
		return (args) -> {
			log.info("save a couple of books");
			bookRepository.save(new Book((long) 12334567,"Olipa kerran", "Maija Meikäläinen", 12345-21, 1999));	
			bookRepository.save(new Book((long)34566, "Harry Potter ja viisasten kivi", "J.K. Rowling", 3334-12, 1997));
			log.info("fetch all books");
			for (Book book : bookRepository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
