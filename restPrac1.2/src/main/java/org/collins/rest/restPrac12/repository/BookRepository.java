package org.collins.rest.restPrac12.repository;

import org.collins.rest.restPrac12.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
