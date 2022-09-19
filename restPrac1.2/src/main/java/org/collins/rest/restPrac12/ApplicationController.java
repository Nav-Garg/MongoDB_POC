//package org.collins.rest.restPrac12;
//
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@CrossOrigin(origins = "http://localhost:8081")
//@RestController
//@RequestMapping("/api")
//public class ApplicationController {
//	@Autowired
//	RestRepo restRepo;
//	@GetMapping("/practice")
//	public ResponseEntity<List<Application>> getName(@RequestParam(required = false) String title)
//	{
//		try {
//		    List<Application> app = new ArrayList<>();
//		    if (title == null)
//		      restRepo.findAll().forEach(app::add);
//		    else
//		      restRepo.findByName(title).forEach(app::add);
//		    if (app.isEmpty()) {
//		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		    }
//		    return new ResponseEntity<>(app, HttpStatus.OK);
//		  } catch (Exception e) {
//		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		  }
//	}
//	
//	@GetMapping("/practice/{id}")
//	public ResponseEntity<Application> getID(@PathVariable("id") String id)
//	{
//		List<Application> tutorialData = restRepo.findById(id);
//		  if (!(tutorialData.isEmpty())) {
//		    return new ResponseEntity<>(tutorialData.get(0), HttpStatus.OK);
//		  } else {
//		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		  }
//	}
//	
////	@PostMapping("/practice")
////	public ResponseEntity<Application> createApplication(@RequestBody Application application)
////	{
////		try {
////		    Application _tutorial = restRepo.save(new Application(application.getId(), application.getName()));
////		    return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
////		  } catch (Exception e) {
////		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
////		  }
////	}
//	
////	@PutMapping("/practice/{id}")
////	  public ResponseEntity<Application> updateTutorial(@PathVariable("id") String id, @RequestBody Application tutorial) {
////	    
////	  }
//
//}
