package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ICICI_Entity;
import com.repository.ICICIRepository;

@RestController
public class ICICI_New_Account_Controller {

	@Autowired
	private ICICIRepository iCICIRepository;
		
	@PostMapping("/addNewToICICI")
	public ResponseEntity<String>  addNewAccout(@RequestBody ICICI_Entity entity){
		ICICI_Entity save = iCICIRepository.save(entity);
		System.out.println(save);
		return new ResponseEntity<>("Account Open succesfully",HttpStatus.OK);
	}
	
}
