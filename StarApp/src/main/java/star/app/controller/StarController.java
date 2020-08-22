package star.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import star.app.entities.Star;
import star.app.service.StarService;

@RestController
@RequestMapping(value="/api/stars")
public class StarController {

	@Autowired
	private StarService starService;
	
	@CrossOrigin(origins = "http://localhost:8080")    
	@GetMapping(value="/star/{id}")
	public Star getStarById(@PathVariable("id") Integer id) {
		return starService.getStarById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:8080") 
	@GetMapping(value="/star/allstars")
	public Iterable<Star> getAllStars(){
		return starService.getAllStars();
	}
	
	
	
	
}
