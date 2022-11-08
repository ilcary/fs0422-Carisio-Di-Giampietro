package com.example.GestioneDispositivi.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestioneDispositivi.Entity.Video;
import com.example.GestioneDispositivi.Service.NetfluxService;

@RestController
@RequestMapping("/api/netflux")
public class NetfluxController {

	@Autowired
	NetfluxService ns;
	
	@GetMapping("/video")
	public Iterable<Video> getAllVideo(){
		return ns.getAllVideo();
	}
	
}
