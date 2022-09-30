package typeOfMedia;

import ElemMultimediale.ElemMultimediale;
import ElemMultimediale.adjustableVolume;
import ElemMultimediale.runnable;

public class Audio extends ElemMultimediale implements adjustableVolume, runnable{
	
	private static byte volume = 16;
	private int duration;
	static String type="audio";

	public Audio(String title,int duration) {
		super(title,type);
		this.duration = duration;
	}

	@Override
	public void turnsVolUp() {
		
		if(volume==16) {
			System.out.println("Il volume è già al massimo");
		}else {
			volume++;
			System.out.println("Il volume impostato a "+volume);
		}	
	}

	@Override
	public void turnsVolDown() {

		if(volume==0) {
			System.out.println("Il volume è già a 0");
		}else {
			volume--;
			System.out.println("Il volume impostato a "+volume);
		}
	}

	@Override
	public void play() {
		
		 System.out.println("Playing: " + title + "| Volume: " + volume);
	        for(int i = 0; i < duration ; i++) {
	            System.out.print(title);
	            for(int j = 0 ; j < volume; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	@Override
	public int getDuration() {
		return duration;
	}

}
