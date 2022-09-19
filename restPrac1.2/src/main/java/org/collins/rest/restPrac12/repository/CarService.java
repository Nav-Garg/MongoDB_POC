package org.collins.rest.restPrac12.repository;

import java.util.List;
import java.util.Optional;

import org.collins.rest.restPrac12.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	public CarRepository repository;
	
	public CarService() {
		System.out.println("Service Layer (Car Repository) is created!");
	}
	
	public void save(Car car) {
		// listOfCar.add(Car);
		repository.save(car);
	}

	public List<Car> findAll() {
		
		/*
		 * if (listOfCar.size() > 0) { return listOfCar; } return null;
		 */
		return repository.findAll();
	}

	public Optional<Car> findById(int id) {
		
		return repository.findById(String.valueOf(id));
	}

	public void deleteById(int id) {
		repository.deleteById(String.valueOf(id));
	}
	
	public void update(Car Car)
	{
		repository.save(Car);
	}
}
