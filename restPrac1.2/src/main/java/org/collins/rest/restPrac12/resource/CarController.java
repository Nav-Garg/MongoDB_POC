//package org.collins.rest.restPrac12.resource;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.collins.rest.restPrac12.model.Car;
//import org.collins.rest.restPrac12.repository.CarService;
//import org.collins.rest.restPrac12.repository.SequenceGeneratorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CarController {
//
//	// Injecting Repository
//	@Autowired
//	private CarService service;
//	
//	@Autowired 
//	CarService serviceCar;
//	@Autowired
//	SequenceGeneratorService seq;
//	
//	
//	@PostMapping("/addCars")
//	public String createCar(@RequestBody Car car)
//	{
//		car.setId(seq.generateSequence(Car.SEQUENCE_NAME));
//		serviceCar.save(car);
//		return "Added new Car in the repository, id: " + car.getId();
//	}
//	
//	@GetMapping("/findAllCars")
//	public List<Car> getCars()
//	{
//		return serviceCar.findAll();
//	}
//	
//	@GetMapping("/findAllCars/{id}")
//	public Optional<Car> getCar(@PathVariable int id)
//	{
//		return service.findById(id);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deleteCar(@PathVariable int id)
//	{
//		service.deleteById(id);
//		return "Car deleted, ID: " + id;
//	}
//	
//
//	@PutMapping("/update/{id}")
//	public Optional<Object> updateCar(@RequestBody Car newCar, @PathVariable int id)
//	{
//		
//		return service.findById(id)
//		.map(Car -> {
//			Car.setName(newCar.getName());
//			Car.setManufacturer(newCar.getManufacturer());
//			service.save(Car);
//			return "Updated the Car details at ID: " + id;
//		});
//	}
//}
//
