package org.collins.rest.restPrac12.repository;

import java.util.concurrent.atomic.AtomicInteger;

import org.collins.rest.restPrac12.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String>{

}
