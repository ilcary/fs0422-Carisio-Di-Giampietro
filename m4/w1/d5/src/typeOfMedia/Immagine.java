package typeOfMedia;

import ElemMultimediale.ElemMultimediale;
import ElemMultimediale.adjustableBrightness;

public class Immagine extends ElemMultimediale implements adjustableBrightness {
	
	private static byte brightness=10;
	static String type="img";
	
	public Immagine(String title ) {
		super(title,type);
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
	
	public void show() {
        System.out.println("Showing: " + title + "| Brightness: " + brightness);
        System.out.print(this.title + " ");
        for(int i = 0; i < brightness ; i++) {
            System.out.print("*");
        }
        System.out.println();
	}


}
