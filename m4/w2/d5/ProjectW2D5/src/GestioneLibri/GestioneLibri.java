package GestioneLibri;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import AbstractBook.Browsable;
import Libro.Libro;
import Rivista.Rivista;

public class GestioneLibri {
	
	static String enc="UTF-8";
	static File inventarioLocal = new File("docs/inventory.txt");
	
//	 private static List<Browsable> getAllBrowsable() {
//		    return List.of(
//		        new Libro("L'assassinio di Roger Ackroyd", 2019, 200, "Agatha Christie", Type.CRIME),
//		        new Libro("Pride and Prejudice", 2019, 200, "Jane Austen", Type.CLASSIC),
//		        new Libro("Don Quixote", 2019, 200, "Miguel de Cervantes", Type.ADVENTURE),
//		        new Libro("Jonathan Strange & il signor Norrell", 2005, 200, "Susanna Clarke", Type.FANTASY),
//		        new Rivista("Medioevo Dossier", 2020, 50, Periodicita.SEMESTRALE),
//		        new Rivista("Quattroruote", 2020, 20, Periodicita.MENSILE),
//		        new Rivista("I Classici Disney", 2009, 300, Periodicita.SETTIMANALE)
//		    );
//		  }
	 
	 private static List<Browsable> Inventory = new ArrayList<>();

	public static void main(String[] args) {
		
		print(Inventory.toString());
		
		sep();
		
		//creazione di libri e riviste >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >> >>
		addLibro(new Libro("Shining", "1977", 800, "Stephen King", Type.HORROR));
		addLibro(new Libro("Frankenstein", "1818", 800, "Mary Shelley", Type.HORROR));
		addLibro(new Libro("L'incubo di Hill House", "1959", 500, "Shirley Jackson", Type.HORROR));
		addLibro(new Libro("Odio Volare", "2018", 500, "Stephen King", Type.HORROR));
		addLibro(new Libro("L'assassinio di Roger Ackroyd", "2019", 200, "Agatha Christie", Type.CRIME));
		addLibro( new Libro("Pride and Prejudice", "2019", 200, "Jane Austen", Type.CLASSIC));
		addLibro( new Libro("Don Quixote", "2019", 200, "Miguel de Cervantes", Type.ADVENTURE));
		addLibro( new Libro("Jonathan Strange & il signor Norrell", "2005", 200, "Susanna Clarke", Type.FANTASY));
		addRivista( new Rivista("Medioevo Dossier", "2020", 50, Periodicita.SEMESTRALE));
		addRivista( new Rivista("Quattroruote", "2020", 20, Periodicita.MENSILE));
		addRivista( new Rivista("I Classici Disney", "2009", 300, Periodicita.SETTIMANALE));
		
		
		print("This is the actual inventory " + Inventory.toString());
		
		sep();
		
		print("This are all the book of the 2020: " + bookByYear("2020").toString());
		
		sep();
		
		print("This are all the book of Stephen King: " + bookByAuthor("Stephen King").toString());
		
		sep();
		
		print("The Browsable with ISBN '6' is:" + bookByISBN("6").toString());
		
		deleteBook(bookByISBN("2"));
		
		sep();
		
		// salvataggio dell'inventario nel folder '/docs/'
		saveInventoryLocal();
		
		// lettura dell'inventario nel folder '/docs/'
		readInventoryLocal();
		
		sep();
		
		// that's it =)

	}
	
	
	// metodo per fare stampe in console e tenere pulito il codice
	public static void print(String s){
		System.out.println(s);
	}
	public static void sep() {
		print("\u001B[96m"+">> >> >> >> >> << << << << <<"+"\u001B[0m"+"\u001B[40m");
		print("");
	}
	
	//metodo per aggiungere libri all'Inventory
	public static void addLibro(Libro b) {
		Inventory.add(b);
	}
	
	//metodo per aggiungere riviste all'Inventory
	public static void addRivista(Rivista b) {
		Inventory.add(b);
	}
	
	//metodo per trovare l'indice di un qualsiasi elemento presente nell'inventario
	public static int getIndexBrowsable(Browsable b) {
		return Inventory.indexOf(b);	
	}
	
	//metodo per l'eliminazione di un qualsiasi elemento presente nell'inventario
	public static void deleteBook(Browsable b) {
		Inventory.remove(getIndexBrowsable(b));
	}
	
	//metodo per cercare un qualsiasi elemento nell'Inventory tramite ISBN
	public static Browsable bookByISBN(String i) {
		return Inventory.stream()
		.filter(b-> b.getISBN().equals(i))
		.collect(Collectors.toList()).get(0);
	}
	
	//metodo che ci restituisce una lista di libri usciti nell'anno che gli passiamo come parametro
	public static List<Browsable> bookByYear(String i) {
		return Inventory.stream()
				.filter(b-> b.getYearPublished()==(i))
				.collect(Collectors.toList());
	}
	
	//metodo che ci restituisce una lista di libri dell'autore inserito come parametro
	public static List<Libro> bookByAuthor(String a) {
		return Inventory
		// mi prendo tutti i libri
		.stream().filter(e -> e instanceof Libro).collect(Collectors.toList()) 
		// li converto in Libro cosi da poter accedere al getAuthor
		.stream().map(e-> (Libro)e).collect(Collectors.toList()) 
		// mi prendo tutti quelli con l'autore che ho designato come paremetro del metodo
		.stream().filter(e->e.getAuthor().equals(a)).collect(Collectors.toList());
		// :)
	}
	
	//metodo che salva l'inventory in locale
	public static void saveInventoryLocal() {
		
		String InventarioPars = Inventory.toString();
		
		try {
			FileUtils.writeStringToFile(inventarioLocal, InventarioPars,enc);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// metodo per leggere il file salvato in locale
	public static void readInventoryLocal() {
		
		String inventoryFromLocal ="";
		try {
			inventoryFromLocal = FileUtils.readFileToString(inventarioLocal, enc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//piccolo check per controllare lo stato del file
		if(!inventoryFromLocal.equals(""))
		print("Questo è l'inventario salvato nel local \n"+inventoryFromLocal);
		else {
			print("The file you are tring to read is empty :(");
		}
		
	}
	
	// =)
	
	
}
















































// why r u here?


/***
 *               ii.                                         ;9ABH,          
 *              SA391,                                    .r9GG35&G          
 *              &#ii13Gh;                               i3X31i;:,rB1         
 *              iMs,:,i5895,                         .5G91:,:;:s1:8A         
 *               33::::,,;5G5,                     ,58Si,,:::,sHX;iH1        
 *                Sr.,:;rs13BBX35hh11511h5Shhh5S3GAXS:.,,::,,1AG3i,GG        
 *                .G51S511sr;;iiiishS8G89Shsrrsh59S;.,,,,,..5A85Si,h8        
 *               :SB9s:,............................,,,.,,,SASh53h,1G.       
 *            .r18S;..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,....,,.1H315199,rX,       
 *          ;S89s,..,,,,,,,,,,,,,,,,,,,,,,,....,,.......,,,;r1ShS8,;Xi       
 *        i55s:.........,,,,,,,,,,,,,,,,.,,,......,.....,,....r9&5.:X1       
 *       59;.....,.     .,,,,,,,,,,,...        .............,..:1;.:&s       
 *      s8,..;53S5S3s.   .,,,,,,,.,..      i15S5h1:.........,,,..,,:99       
 *      93.:39s:rSGB@A;  ..,,,,.....    .SG3hhh9G&BGi..,,,,,,,,,,,,.,83      
 *      G5.G8  9#@@@@@X. .,,,,,,.....  iA9,.S&B###@@Mr...,,,,,,,,..,.;Xh     
 *      Gs.X8 S@@@@@@@B:..,,,,,,,,,,. rA1 ,A@@@@@@@@@H:........,,,,,,.iX:    
 *     ;9. ,8A#@@@@@@#5,.,,,,,,,,,... 9A. 8@@@@@@@@@@M;    ....,,,,,,,,S8    
 *     X3    iS8XAHH8s.,,,,,,,,,,...,..58hH@@@@@@@@@Hs       ...,,,,,,,:Gs   
 *    r8,        ,,,...,,,,,,,,,,.....  ,h8XABMMHX3r.          .,,,,,,,.rX:  
 *   :9, .    .:,..,:;;;::,.,,,,,..          .,,.               ..,,,,,,.59  
 *  .Si      ,:.i8HBMMMMMB&5,....                    .            .,,,,,.sMr
 *  SS       :: h@@@@@@@@@@#; .                     ...  .         ..,,,,iM5
 *  91  .    ;:.,1&@@@@@@MXs.                            .          .,,:,:&S
 *  hS ....  .:;,,,i3MMS1;..,..... .  .     ...                     ..,:,.99
 *  ,8; ..... .,:,..,8Ms:;,,,...                                     .,::.83
 *   s&: ....  .sS553B@@HX3s;,.    .,;13h.                            .:::&1
 *    SXr  .  ...;s3G99XA&X88Shss11155hi.                             ,;:h&,
 *     iH8:  . ..   ,;iiii;,::,,,,,.                                 .;irHA  
 *      ,8X5;   .     .......                                       ,;iihS8Gi
 *         1831,                                                 .,;irrrrrs&@
 *           ;5A8r.                                            .:;iiiiirrss1H
 *             :X@H3s.......                                .,:;iii;iiiiirsrh
 *              r#h:;,...,,.. .,,:;;;;;:::,...              .:;;;;;;iiiirrss1
 *             ,M8 ..,....,.....,,::::::,,...         .     .,;;;iiiiiirss11h
 *             8B;.,,,,,,,.,.....          .           ..   .:;;;;iirrsss111h
 *            i@5,:::,,,,,,,,.... .                   . .:::;;;;;irrrss111111
 *            9Bi,:,,,,......                        ..r91;;;;;iirrsss1ss1111
 */
