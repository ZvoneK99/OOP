package VJEZBEFAKSREDO;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		ObjavljeneUtrke utrke = new ObjavljeneUtrke();
		ArrayList<Natjecatelj> natjecatelji = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<100; i++) {
			String ime = "Natjecatelj "+i+1;
			int duzina = 100+ random.nextInt(9900);
			
			int kategorija = random.nextInt(3);
			if(kategorija == 0) {
				natjecatelji.add(new Maratonac(ime, duzina));
			}
			else if(kategorija == 1) {
				natjecatelji.add(new Polumaratonac(ime, duzina));
			}
			else {
				natjecatelji.add(new Gradanin(ime, duzina));
			}
		}
		ObjavljeneUtrke.objaviUtrku1();
		
	}
}
