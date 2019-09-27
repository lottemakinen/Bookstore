package hh.swd20.Bookstore.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private Integer isbn;
	private Integer year;
	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;
	
	
	public Book(String title, String author,int isbn , int year ) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.year=year;
		
	}
	
	public Book() {
		this.title=null;
		this.author=null;
		this.isbn=0;
		this.year=0;
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public Integer getYear() {
		return year;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	

	public Category getCategory() {
		return category;
	}
	

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year
				+ ", category=" + category + "]";
	}

	

}
