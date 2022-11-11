package com.ilCary.PrevenzioneIncendi.Entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObservableProbe {


	private long id;

	private List<Observer> observers = new ArrayList<>();

	private Double latitude;
	private Double longitude;

	private int smokeLevel;

	public ObservableProbe(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = 0;
	}

	// notifico il risultato iniziale non appena un observer si sottoscrive
	public void addObserver(Observer observer) {
		System.out.println(observer.update(this.smokeLevel, this.latitude, this.longitude ));
		
		this.observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	public void setSmokeLevel(int newSmokeLevel) {
		this.smokeLevel = newSmokeLevel;
		for (Observer observer : this.observers) {
			System.out.println(observer.update(this.smokeLevel, this.latitude, this.longitude ));
		}
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
