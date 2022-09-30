package MediaPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import ElemMultimediale.ElemMultimediale;
import typeOfMedia.Audio;
import typeOfMedia.Immagine;
import typeOfMedia.Video;

//
//  
//  README README README README README README README README README README README README README README README README README 
// 
//
//             QUESTA è UNA 'PROVA' CON DEi DO WHILE MA LA CLASSE PRINCIPALE è IL  >> ---- MediaPlayer.java ---- <<
//
//
//	README README README README README README README README README README README README README README README README README 
//
//
//


public class SecondPlayer {
	
	private static int firstInput;
	private static int secondInput;
	private static int thirdInput;
	private static int fourthInput;
	private static int fifthInput;
	private static int sixthInput;
	private static int seventhInput;
	private static int eighthInput;
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
		
		
//			System.out.println("Nel nostro storage adesso abbiamo: \n"+  METODO INIZIALE
//					"1"+repository.get(0).title+"\n"+
//							"2"+repository.get(1).title+"\n"+
//					"3"+repository.get(2).title+"\n"+
//							"4"+repository.get(3).title+"\n"+
//					"5"+repository.get(4).title+"\n"+
//							" Seleziona un elemento da 1 a 5 altrimenti 0 per uscire ");
//					
//					firstInput = Integer.parseInt(displayer.nextLine());
		
		
		metodoIniziale(displayer);
		
					
					do {//first input
					
					ElemMultimediale selectedItem = repository.get(firstInput-1);
					
					System.out.println("Hai selezionato il file "+selectedItem.title);
					
					System.out.println(selectedItem.type+" questo è il type");
						
						if(selectedItem.type.equals("img")) {
							//IMMAGINE/////////////////////////////
							
//							System.out.println("Inserisci 1 per modificare la luminosità, 2 per vedere l'immaggine 0 per tornare indietro");
//							int o = Integer.parseInt(displayer.nextLine());
							metodoInizialeImg(displayer);
							
							do {//third input
								
								if(secondInput==1) {
									
								do {
										System.out.println("Inserisci 1 per aumentare o 2 per diminuire la luminosità e 0 per tornare indietro");
										thirdInput = Integer.parseInt(displayer.nextLine());
										
										if(thirdInput==1) {
								    	((Immagine)selectedItem).brightnessUp();
										}else if(thirdInput==2){
										((Immagine)selectedItem).brightnessDown();
										}else {
										break;
										}
								
									}while (!(thirdInput==0));
								metodoIniziale(displayer);
								
							}else if(secondInput==2) {
								((Immagine)selectedItem).show();
								break;
							}else {
								System.out.println(secondInput+" non è un'opzione valida hai rotto tutto...");
								break;
							}
								
							} while(!(secondInput==0));
							metodoInizialeImg(displayer);
							
							
						}else if (selectedItem.type.equals("audio")) {
							//AUDIO///////////////////////////////////
//							System.out.println("Inserisci 1 per modificare il volume, 2 per ascoltare l'audio o 0 per tornare indietro");
//							fourthInput = Integer.parseInt(displayer.nextLine());
							
							metodoInizialeAudio(displayer);
							
							do {//fourthInput
								
								if(fourthInput==1) {
									System.out.println("Inserisci 1 per aumentare o 2 per diminuire il volume e 0 per tornare indietro");
									fifthInput = Integer.parseInt(displayer.nextLine());
									
									do {//fifth input
										
										if(fifthInput==1) {
											((Audio)selectedItem).turnsVolUp();
										}else if(fifthInput==2){
											((Audio)selectedItem).turnsVolDown();
										}
										
									}while(!(fifthInput==0));
									metodoInizialeAudio(displayer);
									
								}else if(fourthInput==2) {
									((Audio)selectedItem).play();
									break;
								}else {
									break;
								}
								
							}while(!(fourthInput==0));
							
							metodoIniziale(displayer);
						}else if(selectedItem.type.equals("video")) {
							//VIDEO///////////////////////////////////////
							
//							System.out.println("Inserisci 1 per modificare il volume, 2 per modificare la luminosità O 3 per riprodurre il video"); METODO INIZIALE VIDEO
//							sixthInput = Integer.parseInt(displayer.nextLine());
							
							
							
							do {//sixth Input
								
								
								if(sixthInput==1) {
										do {//seventh Input
									System.out.println("Inserisci 1 per aumentare o 2 per diminuire il volume e 0 per tornare indietro");
								
									seventhInput = Integer.parseInt(displayer.nextLine());
									
									
										
										if(seventhInput==1) {
										((Video)selectedItem).turnsVolUp();
									}else if(seventhInput==2){
										((Video)selectedItem).turnsVolDown();
									}else {
										break;
									}
									}while(!(seventhInput==0));
										metodoIniziale(displayer);
									
									
									
								}else if(sixthInput==2) {
									
									System.out.println("Inserisci 1 per aumentare o 2 per diminuire la luminosità e 0 per tornare indietro");
									eighthInput = Integer.parseInt(displayer.nextLine());
									
									do {
										
									
									if(eighthInput==1) {
										((Video)selectedItem).brightnessUp();
									}else if(eighthInput==2){
										((Video)selectedItem).brightnessDown();
									}else {
										break;
									}
									
									}while(!(eighthInput==0));
									metodoInizialeVideo(displayer);
								}else if(sixthInput==3){
									((Video)selectedItem).play();
									break;
								}else {
									System.out.println(sixthInput+" non è un'opzione valida hai rotto tutto...");
									break;
								}
								
							} while(!(sixthInput==0));
							metodoInizialeVideo(displayer);
							
						}else {
							break;
						}
								
					
		} while (!(firstInput==0));
		
			displayer.close();

	}
	
	
	private static void metodoIniziale(Scanner displayer) {
		System.out.println("Nel nostro storage adesso abbiamo: \n"+
				"1"+repository.get(0).title+"\n"+
						"2"+repository.get(1).title+"\n"+
				"3"+repository.get(2).title+"\n"+
						"4"+repository.get(3).title+"\n"+
				"5"+repository.get(4).title+"\n"+
						" Seleziona un elemento da 1 a 5 altrimenti 0 per uscire ");
				
				firstInput = Integer.parseInt(displayer.nextLine());
	}
	
	private static void metodoInizialeVideo(Scanner displayer) {
		System.out.println("Inserisci 1 per modificare il volume, 2 per modificare la luminosità O 3 per riprodurre il video"); 
		sixthInput = Integer.parseInt(displayer.nextLine());
	}
	
	private static void metodoInizialeAudio(Scanner displayer){
		System.out.println("Inserisci 1 per modificare il volume, 2 per ascoltare l'audio o 0 per tornare indietro");
		fourthInput = Integer.parseInt(displayer.nextLine());
	}
	
	private static void metodoInizialeImg(Scanner displayer){
		System.out.println("Inserisci 1 per modificare la luminosità, 2 per vedere l'immaggine 0 per tornare indietro");
		secondInput = Integer.parseInt(displayer.nextLine());
	}
	
	

}
