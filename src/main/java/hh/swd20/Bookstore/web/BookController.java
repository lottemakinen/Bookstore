package hh.swd20.Bookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getBooks(Model model) {
			List<Book> books =  (List<Book>) bookRepository.findAll(); 
			model.addAttribute("books", books); 
			return "bookList.html"; 
								
	}
	
	@RequestMapping( value="/savebook", method = RequestMethod.GET)
	public String getBook(Model model) {
		model.addAttribute("book", new Book()); 
		return "bookForm.html";
	}

	@RequestMapping(value = "/savebook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute Book book) {
		bookRepository.save(book);
		return "redirect:/books";
	}
	
	@RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long bookId) {
		bookRepository.deleteById(bookId);
		return "redirect:../books";
	}
	
	
}
