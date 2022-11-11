package com.ilCary.PrevenzioneIncendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ilCary.PrevenzioneIncendi.Entities.ObservableProbe;
import com.ilCary.PrevenzioneIncendi.Entities.Observer;
import com.ilCary.PrevenzioneIncendi.Entities.ObserverProbe;

@SpringBootApplication
public class PrevenzioneIncendiW3Application {

	public static void main(String[] args) {
		SpringApplication.run(PrevenzioneIncendiW3Application.class, args);

		ObservableProbe probe1 = new ObservableProbe(1654444444444444.44, 49684.9);
		Observer observer1 = new ObserverProbe("1");
		Observer observer2 = new ObserverProbe("2");

		probe1.addObserver(observer1);
		//probe1.addObserver(observer2);
		
		probe1.setSmokeLevel(3);
		probe1.setSmokeLevel(6);
		
		
		
		
	}

}
