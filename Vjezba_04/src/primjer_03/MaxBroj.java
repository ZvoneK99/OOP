/*Traženje maksimalnog broja
Napravi ArrayList<Integer> i unesi deset brojeva. Pronađi i ispiši najveći broj u listi*/

package primjer_03;

	import java.util.ArrayList;
	
public class MaxBroj {
	public static void main(String[]args) {
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		brojevi.add(4);
		brojevi.add(64);
		brojevi.add(163);
		brojevi.add(974);
		brojevi.add(6321);
		int najveći = brojevi.get(0);
		for(int i=0; i<brojevi.size(); i++) {
			if(brojevi.get(i)>najveći) {
				najveći=brojevi.get(i);
			}
		}
		System.out.println("Najveći broj u nizu je: "+najveći);
	}
}
