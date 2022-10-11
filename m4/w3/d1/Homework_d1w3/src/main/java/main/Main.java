package main;

import models.Evento;
import models.tipoEvento;

public class Main {

	public static void main(String[] args) {
		
		Evento raceWarsItaly = new Evento("Race Wars Italy","Campionato italiano accellerazione round 2", 180, tipoEvento.PUBLICO,"2022-10-23");
		EventDAO.save(raceWarsItaly);
		
		Evento emotionalDrift = new Evento("Emotional Drift","Giornata aperta al publico per driftare", 35, tipoEvento.PUBLICO,"2022-11-03");
		EventDAO.save(emotionalDrift);

	}

}
