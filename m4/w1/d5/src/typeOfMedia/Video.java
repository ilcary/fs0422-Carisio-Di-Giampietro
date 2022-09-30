package typeOfMedia;

import ElemMultimediale.ElemMultimediale;
import ElemMultimediale.adjustableBrightness;
import ElemMultimediale.adjustableVolume;
import ElemMultimediale.runnable;

public class Video extends ElemMultimediale implements adjustableVolume, adjustableBrightness , runnable {
	
	private static byte brightness=10;
	private static byte volume = 16;
	static String type= "video";
	private int duration;
	
	public Video(String title,int duration) {
		super(title, type );
		this.duration = duration;
	}

	@Override
	public int getDuration() {
		return duration;
	}

	@Override
	public void brightnessUp() {
		if(brightness==10) {
			System.out.println("La luminosità è già al massimo");
		}else {
			brightness++;
			System.out.println("La luminosità impostata a "+ brightness);
		}
	}

	@Override
	public void brightnessDown() {
		if(brightness==0) {
			System.out.println("La luminosità è già a 0");
		}else {
			brightness--;
			System.out.println("La luminosità impostata a "+ brightness);
		}
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
        System.out.println("Playing: " + title + "| Volume: " + volume + "| Brightness: " + brightness);
        for(int d = 0; d < duration ; d++) {
            System.out.print(title);
            for(int b = 0 ; b < volume; b++) {
                System.out.print("*");
            }
            for(int v = 0 ; v < volume; v++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
		

}
