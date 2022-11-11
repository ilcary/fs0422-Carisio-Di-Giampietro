package com.ilCary.PrevenzioneIncendi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ilCary.PrevenzioneIncendi.Entities.ObservableProbe;
import com.ilCary.PrevenzioneIncendi.Entities.Observer;
import com.ilCary.PrevenzioneIncendi.Entities.ObserverProbe;

public class JUnitPackage {
	
	

	@Test
	public void testPorbeCorrectSub() {

		ObservableProbe probe1 = new ObservableProbe(16567051.89, 7451824.9);
		Observer observer1 = new ObserverProbe("1");
		
		probe1.addObserver(observer1);
		//verifico se l'observer sia correttamente sottoscritto alla sonda(probe) 
		assertTrue(probe1.getObservers().contains(observer1));
		
	}
	
	
	@Test
	public void testPorbeCorrectDeSub() {
		
		ObservableProbe probe1 = new ObservableProbe(16567051.89, 7451824.9);
		Observer observer1 = new ObserverProbe("1");
		
		probe1.addObserver(observer1);
		//verifico se l'observer sia correttamente sottoscritto alla sonda(probe) 
		assertTrue(probe1.getObservers().contains(observer1));
		
		
		probe1.removeObserver(observer1);
		//verifico se l'observer sia correttamente desottoscritto alla sonda(probe) 
		assertTrue(!probe1.getObservers().contains(observer1));
		
	}
	
	
	@Test
	public void testPorbeThresholds() {
		
		ObservableProbe probe1 = new ObservableProbe(16567051.89, 7451824.9);
		Observer observer1 = new ObserverProbe("1");
		
		probe1.addObserver(observer1);
		probe1.setSmokeLevel(8);
		
		//verifico se l'observer lancia una fake "chiamata http" e quindi la stringa retituita dall'update contenga il basic Url http://host/alarm?
		assertTrue(observer1.update((Object)probe1.getSmokeLevel(), probe1.getLatitude(), probe1.getLongitude()).contains("http://host/alarm?"));
		
	}
	
	
	
	
	
	
	
	

}
