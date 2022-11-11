package com.ilCary.PrevenzioneIncendi.Entities;

public class ObserverProbe implements Observer {

	private String id;

	private int smokeLevel;

	public ObserverProbe(String id) {
		this.id = id;
	}

	@Override
	public String update(Object smokeLevel, Double latitude, Double longitude) {
		
		if ((int) smokeLevel > 5) {
			return "(Probe-" + id + ") url: http://host/alarm?=idsonda=" + id + "&lat=" + latitude + "&lon="
			+ longitude + "&smokeyLevel=" + (int) smokeLevel;
		}
		this.smokeLevel = (int) smokeLevel;
		return "(Probe-" + id + ") smoke level: " + (int) smokeLevel;
	
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
