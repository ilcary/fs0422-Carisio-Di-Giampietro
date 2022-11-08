package com.example.GestioneDispositivi.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestioneDispositivi.Entity.TypeFilm;
import com.example.GestioneDispositivi.Entity.Video;
import com.example.GestioneDispositivi.Repositories.VideoRepo;

@Service
public class NetfluxService {

	@Autowired
	private VideoRepo vr;

	public List<Video> getAllVideo() {
		return vr.findAll();
	}

	public Video saveVideo(Video v) {
		return vr.save(v);
	}

	public Optional<Video> getVideoById(long id) {
		return vr.findById(id);
	}

	public List<Video> findByType(TypeFilm t) {
		return vr.findAll().stream().filter(v -> v.getType().equals(t)).collect(Collectors.toList());
	}

	public String deleteVideoById(long id) {
		vr.deleteById(id);
		return "deleted!";
	}

}
