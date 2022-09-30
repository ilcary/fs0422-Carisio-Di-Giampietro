package ElemMultimediale;

public interface adjustableVolume {
	
	//interfaccia da implementare solo nei audio e nei video
	
	byte volume = 16;

	public void turnsVolUp();
	public void turnsVolDown();
	
}
