package m5w2d1es.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import m5w2d1es.ExceptionControl.BookingException;

@Service
public class HomeService {

	@Value("${gestioneprenotazioni.infoEN}")
	private String infoEN;

	@Value("${gestioneprenotazioni.infoIT}")
	private String infoIT;

	public String getInfo(String language) {

		switch (language.toUpperCase())
		{
		case "IT": {
			return infoIT;
		}
		case "EN": {
			return infoEN;
		}

		default:
			throw new BookingException("404 language not found");
		}
		
	}
}
