package MediaPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import ElemMultimediale.ElemMultimediale;
import typeOfMedia.Audio;
import typeOfMedia.Immagine;
import typeOfMedia.Video;



public class MediaPlayer {
	
	private static ArrayList<ElemMultimediale> repository = new ArrayList<ElemMultimediale>();
	public static void main(String[] args) {
		
//		Immagine panoramaVelino =  new Immagine("Monte Velino") ;
//		Audio listaSpesa = new Audio("whatsappAudio",1);
//		Video tutorialJava = new Video("Tutorial Java",12);
	//	int s = Integer.parseInt(popipopi.nextLine());

		
		//.size per la lunghezza .get[index] .add(item to push)
		

		Scanner displayer = new Scanner(System.in);
		
		System.out.println("Adesso creeremo 5 file multimediali, \n inserisci in ordine -nome -tipo file \n Se si trattera di un eseguibile ti chiederò la sua durata ");
		int i =0;
		do {
			i++;
			System.out.println("Inserisci il nome del file n°"+i);
			String n = displayer.nextLine();
			
			System.out.println("Inserisci il tipo del file n°" + i + " i tipi sono: \n 1 Immagine \n 2 Audio \n 3 Video ");
			int t = Integer.parseInt(displayer.nextLine());
			
			
			
			if(t==1) {
				
				Immagine  item  =  new Immagine(n);
				repository.add(item);
				
			}else if(t==2) {
				
				System.out.println("Inserisci la durata dell'audio");
				int d = Integer.parseInt(displayer.nextLine());
				Audio item = new Audio(n,d);
				repository.add(item);
				
			}else if(t==3) {
				
				System.out.println("Inserisci la durata del video");
				int d = Integer.parseInt(displayer.nextLine());
				Video item = new Video(n,d);
				repository.add(item);
				
			}else {
				
				System.out.println(t+" non è un'opzione valida hai rotto tutto...");
			}
			
			
			
			
		}while(i<5);
		
		
		    menuGenerale(displayer);
					
			

	}
	
	public static void menuGenerale(Scanner displayer){
		System.out.println("Nel nostro storage adesso abbiamo: \n"+
				"-1 "+repository.get(0).title+"\n"+
						"-2 "+repository.get(1).title+"\n"+
				"-3 "+repository.get(2).title+"\n"+
						"-4 "+repository.get(3).title+"\n"+
				"-5 "+repository.get(4).title+"\n"+
						" Seleziona un elemento da 1 a 5 altrimenti 0 per uscire ");
				
			int	firstInput = Integer.parseInt(displayer.nextLine());
				
			ElemMultimediale selectedItem = repository.get(firstInput-1);
			
			chooser(selectedItem,displayer);
				
	}
	
	
	public static void chooser(ElemMultimediale selectedItem,Scanner displayer) {
		
		switch(selectedItem.type) {
		case "img":
			menuItemImg(selectedItem,displayer);
			break;
		case "audio":
			menuItemAudio(selectedItem,displayer);
			break;
		case "video":
			menuItemVideo(selectedItem,displayer);
			break;
		}
		
	}
	
	
	public static void menuItemImg(ElemMultimediale selectedItem,Scanner displayer) {
	
		//IMMAGINE/////////////////////////////
		System.out.println("Inserisci 1 per modificare la luminosità, 2 per vedere l'immaggine 0 per tornare indietro \n");
		int o = Integer.parseInt(displayer.nextLine());
		
			if(o==1) {
		
					System.out.println("Inserisci 1 per aumentare o 2 per diminuire la luminosità e 0 per tornare indietro \n");
					int thirdInput = Integer.parseInt(displayer.nextLine());
					
					if(thirdInput==1) {
			    	((Immagine)selectedItem).brightnessUp();
			    	menuItemImg(selectedItem,displayer);
			    	
					}else if(thirdInput==2){
					((Immagine)selectedItem).brightnessDown();
					menuItemImg(selectedItem,displayer);
					
					}else if(thirdInput==0) {
						menuItemImg(selectedItem,displayer);
					}else {
						System.out.println(thirdInput+" is not a valid command");
						menuItemImg(selectedItem,displayer);
					}
		
		}else if(o==2) {
			((Immagine)selectedItem).show();
			menuItemImg(selectedItem,displayer);
			
		}else if(o==0) {
			menuItemImg(selectedItem,displayer);
			
		}else {
			System.out.println(o+" is not a valid command");
			
		}
				
	}
	
	public static void menuItemAudio(ElemMultimediale selectedItem,Scanner displayer) {
		
		//IMMAGINE/////////////////////////////
		System.out.println("Inserisci 1 per modificare il volume, 2 per ascoltare l'audio o 0 per tornare indietro \n");
		int fourthInput = Integer.parseInt(displayer.nextLine());
		
	
			
			if(fourthInput==1) {
				System.out.println("Inserisci 1 per aumentare o 2 per diminuire il volume e 0 per tornare indietro \n");
				int fifthInput = Integer.parseInt(displayer.nextLine());
				
			
					
					if(fifthInput==1) {
						((Audio)selectedItem).turnsVolUp();
						menuItemAudio(selectedItem,displayer);
						
					}else if(fifthInput==2){
						((Audio)selectedItem).turnsVolDown();
						menuItemAudio(selectedItem,displayer);
						
					}else if(fifthInput==0) {
						menuItemAudio(selectedItem,displayer);
					}else {
						System.out.println(fifthInput+" is not a valid command");
						menuItemAudio(selectedItem,displayer);
					}
					
				
				
			}else if(fourthInput==2) {
				((Audio)selectedItem).play();
				menuItemAudio(selectedItem,displayer);
				
				
			}else {
				System.out.println(fourthInput+" is not a valid command");
				menuGenerale(displayer);
			}
			
	
		
	}
	
	public static void menuItemVideo(ElemMultimediale selectedItem,Scanner displayer) {
		
		//VIDEO///////////////////////////////////////
		System.out.println("Inserisci 1 per modificare il volume, 2 per modificare la luminosità O 3 per riprodurre il video \n");
		int sixthInput = Integer.parseInt(displayer.nextLine());
		
		
			
			
			if(sixthInput==1) {
				
				System.out.println("Inserisci 1 per aumentare o 2 per diminuire il volume e 0 per tornare indietro \n");
			
				int seventhInput = Integer.parseInt(displayer.nextLine());
				
				
					
					if(seventhInput==1) {
					((Video)selectedItem).turnsVolUp();
					menuItemVideo(selectedItem,displayer);
					
					}else if(seventhInput==2){
					((Video)selectedItem).turnsVolDown();
					menuItemVideo(selectedItem,displayer);
					
					}else if(seventhInput==0) {
					menuItemVideo(selectedItem,displayer);
					
					}else {
					System.out.println(seventhInput+" is not a valid command");
					menuItemVideo(selectedItem,displayer);
					}
				
				
				
				
				
			}else if(sixthInput==2) {
				
				System.out.println("Inserisci 1 per aumentare o 2 per diminuire la luminosità e 0 per tornare indietro \n");
				int eighthInput = Integer.parseInt(displayer.nextLine());
				
			
				
				if(eighthInput==1) {
					((Video)selectedItem).brightnessUp();
					menuItemVideo(selectedItem,displayer);
					
				}else if(eighthInput==2){
					((Video)selectedItem).brightnessDown();
					menuItemVideo(selectedItem,displayer);
					
				}if(eighthInput==0) {
					menuItemVideo(selectedItem,displayer);
					
				}else {
					System.out.println(eighthInput+" is not a valid command");
					menuItemVideo(selectedItem,displayer);
				}
				
		
				
			}else if(sixthInput==3){
				((Video)selectedItem).play();
				menuItemVideo(selectedItem,displayer);
				
			}else {
				System.out.println(sixthInput+" non è un'opzione valida hai rotto tutto...");
				menuGenerale(displayer);
			}
			
	}
	

}
