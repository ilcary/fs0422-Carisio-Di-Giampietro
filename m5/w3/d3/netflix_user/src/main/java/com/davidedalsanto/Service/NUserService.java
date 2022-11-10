package com.davidedalsanto.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.davidedalsanto.DTO.VideoDTO;
import com.davidedalsanto.models.NUser;
import com.davidedalsanto.repositories.NUserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import reactor.core.publisher.Mono;

@Service
public class NUserService {

	WebClient webClient = WebClient.create();
	
	ObjectWriter objW = new ObjectMapper().writer();
	
	@Autowired
	private NUserRepository ur;
	
	public NUser save(NUser u) {
		return ur.save(u);
	}
	
	
	public List<VideoDTO> getFavourites(Long id) throws Exception {

		Optional<NUser> found = ur.findById(id);
		if (found.isPresent()) {

			List<Long> userFav = found.get().getFavouritesIDs();
			String favIDs = objW.writeValueAsString(userFav);
			// sintassi web client
			// .block() e' per rendere sincrona
			// rendo sincrona perche' ho bisogno della risposta
			List<VideoDTO> res = webClient.post()
					.uri("http://localhost:8080/api/catalog/favourites")
					.contentType(MediaType.APPLICATION_JSON)
					.bodyValue(favIDs)
					.retrieve()
					.bodyToMono(List.class)
					.block();

			return res;
		}

		throw new Exception("No user found with id: " + id);
	}
}
