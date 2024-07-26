package com.reating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reating.Entities.Reating;
import com.reating.servises.Servises;

@RestController
@RequestMapping("/reating")
public class Controller {
@Autowired
	private Servises rser;
@PostMapping("/reating")
	public ResponseEntity<Reating> add(@RequestBody Reating reating){
		return new ResponseEntity<Reating>(rser.addReating(reating),HttpStatus.OK);
	}
@GetMapping("/reating")
public ResponseEntity<List<Reating>> getall(){
	return new ResponseEntity<>(rser.allReatings(),HttpStatus.OK);
}

@GetMapping("/reating/{id}")
	public ResponseEntity<Reating> getReating(@PathVariable String id){
		return new ResponseEntity<Reating>(rser.ReatingById(id),HttpStatus.OK);
	

}

@GetMapping("/reating/user/{id}")
public ResponseEntity<List<Reating>> getalbyUserIdl(@PathVariable String id){
	return new ResponseEntity<>(rser.ReatingUserId(id),HttpStatus.OK);
}
@GetMapping("/reating/hotel/{id}")
public ResponseEntity<List<Reating>> getalbyhotleIdl(@PathVariable String id){
	return new ResponseEntity<>(rser.ReatingHotelId(id),HttpStatus.OK);
}
}
