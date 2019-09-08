package hh.swd20.Bookstore.domain;

public class Book {
	private String title;
	private String author;
	private Integer year;
	private Integer isbn;
	private Integer price;
	
	public Book(String title, String author, int year, int isbn, int price) {
		this.title=title;
		this.author=author;
		this.year=year;
		this.isbn=isbn;
		this.price=price;
	}
	
	public Book() {
		this.title=null;
		this.author=null;
		this.year=0;
		this.isbn=0;
		this.price=0;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
				+ "]";
	}
	
	
}
