package guru.springframework.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	
	@GetMapping("/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
		return new ResponseEntity<String>("hellow there, "+name, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/Hi/{name}")
    public ResponseEntity<String> hi(@PathVariable("name") String name) {
		return new ResponseEntity<String>("Hi there, "+name, new HttpHeaders(), HttpStatus.OK);
	}

}
