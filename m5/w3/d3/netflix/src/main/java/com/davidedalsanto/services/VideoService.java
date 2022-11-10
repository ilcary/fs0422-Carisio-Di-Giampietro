package com.davidedalsanto.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.davidedalsanto.entities.Category;
import com.davidedalsanto.entities.Film;
import com.davidedalsanto.entities.TvSerie;
import com.davidedalsanto.entities.Video;
import com.davidedalsanto.exceptions.VideoNotFoundException;
import com.davidedalsanto.repositories.VideoRepo;

@Service
public class VideoService {

	@Autowired
	VideoRepo vr;
	
	public Iterable<Video> searchAllVideos() {
		return vr.findAll();
	}
	
	public Page<Video> searchAllVideosPageable(Pageable p) {
		return vr.findAll(p);
	}

	public Video save(Video Video) {
		return vr.save(Video);
	}

	public Video findById(long id) throws VideoNotFoundException {
		Video found = vr.findById(id).get();
		if(found != null) {
			return found;
		}else {
			throw new VideoNotFoundException();
		}
	}

	public Video update(Long id, Video updatedVid) throws VideoNotFoundException {
		Optional<Video> vidOpt = vr.findById(id);

		if (vidOpt.isPresent()) {
			Video vid = vidOpt.get();
			vid.setCategory(updatedVid.getCategory());
			vid.setTitle(updatedVid.getTitle());
			// --- UNDER DEVELOPMENT ---
			vr.save(vid);
			return vid;
		} else {
			throw new VideoNotFoundException();
		}

	}
	
	public void delete(long id) {
		vr.deleteById(id);
	}
	
	
	// ----- MICRO SERVICES (???) -----
	
	public Iterable<Video> findFilms(Iterable<Video> videoPool) {

		List<Video> result = new ArrayList<>();

		videoPool.forEach(v -> {
			if (v instanceof Film) {
				result.add(v);
			}
		});

		return result;
	}
	
	public Iterable<Video> findSeries(Iterable<Video> videoPool) {

		List<Video> result = new ArrayList<>();

		videoPool.forEach(v -> {
			if (v instanceof TvSerie) {
				result.add(v);
			}
		});

		return result;
	}
	
	public Iterable<Video> findByCategory(Iterable<Video> videoPool, Category cat){
		
		List<Video> result = new ArrayList<>();
		
		videoPool.forEach(v -> {
			if(v.getCategory().equals(cat)) {
				result.add(v);
			}
		});
		
		return result;
	}
	
	public Iterable<Video> findByTitle(Iterable<Video> videoPool, String title){
		
		List<Video> result = new ArrayList<>();
		
		videoPool.forEach(v -> {
			if((v.getTitle().toLowerCase()).contains(title.toLowerCase())) {
				result.add(v);
			}
		});
		
		return result;
	}
	
	public Iterable<Video> findByTitleAndCategory(Iterable<Video> videoPool, String title, Category cat){
		
		Iterable<Video> matchByTitle = findByTitle(videoPool, title);
		List<Video> result = new ArrayList<>();
		
		matchByTitle.forEach(v -> {
			if(v.getCategory().equals(cat)) {
				result.add(v);
			}
		});
		
		return result;
	}

	public List<Video> getList(List<Long> favIDs) {
		List<Video> res = new ArrayList<Video>();
		for(Long id : favIDs) {
			Optional<Video> v = vr.findById(id);
			if(v.isPresent()) {
				res.add(v.get());
			}
		}
		return res;
	}
	
}








