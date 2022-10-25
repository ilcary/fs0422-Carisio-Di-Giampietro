package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import models.Item;
import models.Ordine;
import models.PizzaMargherita;
import models.StatoOrdine;
import models.Tavolo;

@Configuration
@PropertySource("classpath:application.properties")
public class Configuriaml {
	
	@Value("${Ordine.costoPerCoperto}")
	private double coperto;
	
	Tavolo t = new Tavolo(StatoOrdine.FREE);
	
	List<Item> comanda = new ArrayList<>();
	
	@Bean
	public Ordine getOrdine() {
		comanda.add(new PizzaMargherita());
		return new Ordine(6, StatoOrdine.BUSY, 6 , t, comanda, coperto);
	}

}
