package m5w2d1es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import m5w2d1es.services.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	@GetMapping("/{language}")
	public ResponseEntity<String> getInfoIT(@PathVariable String language) {
		String istruzioni = hs.getInfo(language);
		
		return new ResponseEntity<>(istruzioni, HttpStatus.OK);

	}
	
}
