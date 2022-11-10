package com.davidedalsanto.controllers;

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

import com.davidedalsanto.entities.Category;
import com.davidedalsanto.entities.Video;
import com.davidedalsanto.services.VideoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
@RequestMapping("/api/catalog")
public class VideoController {
	
	ObjectMapper objW = new ObjectMapper();
		
	@Autowired
	VideoService vs;
	
	@GetMapping("")
	public ResponseEntity<Iterable<Video>> getCatalog(){
		return new ResponseEntity<>(vs.searchAllVideos(), HttpStatus.OK);
	}
	
	@GetMapping("/films")
	public ResponseEntity<Iterable<Video>> getFilms(){
		return new ResponseEntity<>(vs.findFilms(vs.searchAllVideos()), HttpStatus.OK);
	}
	
	@GetMapping("/series")
	public ResponseEntity<Iterable<Video>> getSeries(){
		return new ResponseEntity<>(vs.findSeries(vs.searchAllVideos()), HttpStatus.OK);
	}
	
	@GetMapping("/films/title/{title}")
	public ResponseEntity<Iterable<Video>> getFilmsByTitle(@PathVariable String title){
		return new ResponseEntity<>(
				vs.findByTitle(vs.findFilms(vs.searchAllVideos()), title), HttpStatus.OK);
	}
	
	@GetMapping("/films/category/{cat}")
	public ResponseEntity<Iterable<Video>> getFilmsByCategoria(@PathVariable Category cat){
		return new ResponseEntity<>(
				vs.findByCategory(vs.findFilms(vs.searchAllVideos()), cat), HttpStatus.OK);
	}
	
	@GetMapping("/title-category/{cat}/{title}")
	public ResponseEntity<Iterable<Video>> getFilmsByTitleAndCategoria(@PathVariable String title, @PathVariable Category cat){
		return new ResponseEntity<>(
				vs.findByTitleAndCategory(vs.searchAllVideos(), title, cat), HttpStatus.OK);
	}
	
	@PostMapping("/favourites")
	public ResponseEntity<List<Video>> getFavourites(@RequestBody String favIDs) throws JsonMappingException, JsonProcessingException{
		List<Long> convIDs = objW.readValue(favIDs, objW.getTypeFactory().constructCollectionLikeType(List.class, Long.class));
		return new ResponseEntity<>(vs.getList(convIDs), HttpStatus.OK);
		
	}
}
