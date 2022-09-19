package org.collins.rest.restPrac12.repository;

import java.util.List;
import java.util.Optional;

import org.collins.rest.restPrac12.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	public BookRepository repository;
	
	private List<Book> listOfBook;
	public BookService() {
		System.out.println("Service Layer is created!");
	}
	
	public void save(Book book) {
		// listOfBook.add(book);
		repository.save(book);
	}

	public List<Book> findAll() {
		
		/*
		 * if (listOfBook.size() > 0) { return listOfBook; } return null;
		 */
		return repository.findAll();
	}

	public Optional<Book> findById(int id) {
		
		return null;
	}

	public void deleteById(int id) {
		
	}
	
	public void update(Book book)
	{
		repository.save(book);
	}
	
}
