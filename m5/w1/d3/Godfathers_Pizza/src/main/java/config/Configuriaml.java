package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

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
	
	@Bean
	public Tavolo getTavolo() {
		return new Tavolo(StatoOrdine.FREE);
	}
	
	@Bean
	@Scope("prototype")
	public PizzaMargherita getPizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	public List<Item> getComanda() {
		return  new ArrayList<>();
	}

	
	@Bean
	public Ordine getOrdine() {
		return new Ordine(6, StatoOrdine.BUSY, 6 , getTavolo(), getComanda(), coperto);
	}

}
