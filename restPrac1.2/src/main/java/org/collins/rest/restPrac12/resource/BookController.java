package org.collins.rest.restPrac12.resource;

import java.util.List;
import java.util.Optional;

import org.collins.rest.restPrac12.model.Book;
import org.collins.rest.restPrac12.repository.BookRepository;
import org.collins.rest.restPrac12.repository.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	// Injecting Repo
	@Autowired
	private BookService service;
	
	@PostMapping("/addBook")
	public String createBook(@RequestBody Book book)
	{
		service.save(book);
		return "Added new Book in the repository, id: " + book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		return service.findAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id)
	{
		return service.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		service.deleteById(id);
		return "Book deleted, ID: " + id;
	}
	

	@PutMapping("/update/{id}")
	public Optional<Object> updateBook(@RequestBody Book newBook, @PathVariable int id)
	{
		
		return service.findById(id)
		.map(book -> {
			book.setBookName(newBook.getBookName());
			book.setAuthorName(newBook.getAuthorName());
			service.save(book);
			return "Updated the book details at ID: " + id;
		});
	}
}
