package Zadatak30;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[]args) {
		Random random = new Random();
		ArrayList<Dokument> dokumenti = new ArrayList<Dokument>();
		
		
		for(int i=1; i<=50; i++) {
			int izbor = random.nextInt(5);
			if(izbor == 0) {
				dokumenti.add(new Knjiga(i, "Knjiga "+i, ""+i));
			}
			else if(izbor == 1) {
				dokumenti.add(new Casopis(i, "Casopis "+i+1, ""+i+1, i+1));
			}
			else if(izbor == 2) {
				dokumenti.add(new DigitalniDokument(i, "Digitalni dokument "+i+2, ""+i+2));
			}
			else if(izbor == 3) {
				dokumenti.add(new E_Dokument(i, "E_Dokument "+i+3, ""+i+3));
			}
			else if(izbor == 4) {
				dokumenti.add(new Udzbenik(i, "Udzbenik "+i+4, ""+i+4, ""+i+4));
			}
			else {
				dokumenti.add(new Rijecnik(i, "Rijecnik "+i+5, ""+i+5, ""+i+5, ""+i+5));
			}
		}
		for(Dokument d : dokumenti)  {
			System.out.println(d);
		}
	}
}
