package com.davidedalsanto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidedalsanto.DTO.VideoDTO;
import com.davidedalsanto.Service.NUserService;
import com.davidedalsanto.models.NUser;
import com.davidedalsanto.repositories.NUserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class NUserController {

	@Autowired
	NUserService us;
	
	@Autowired
	NUserRepository ur;
	
	@GetMapping("")
	public ResponseEntity<List<NUser>> getUsers(){
		return new ResponseEntity<>(ur.findAll(), HttpStatus.OK);
	}

	
	@GetMapping("/{id}/favourites")
	public ResponseEntity<List<VideoDTO>> getFavourites(@PathVariable Long id){
		
		try {
			return new ResponseEntity<List<VideoDTO>>(us.getFavourites(id), HttpStatus.OK);
		}catch(Exception e) {
			log.error("Non funziono");
			log.error(e.getMessage());
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
}
