/* Brojanje elemenata u listi
Kreiraj ArrayList koji prima stringove. Dodaj nekoliko imena u listu. Ispiši ukupan broj imena u listi.*/

package primjer_02;
	
	import java.util.ArrayList;

public class Klasa {
	public static void main(String[]args) {
		ArrayList<String> imena = new ArrayList<String>();
		
		imena.add("Zvone");
		imena.add("Gabi");
		
		System.out.println("Ukupan broj imena u listi je: "+imena.size());
	}
}
