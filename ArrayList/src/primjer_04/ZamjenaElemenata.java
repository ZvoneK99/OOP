/*Pronalaženje i zamjena elementa
Kreiraj ArrayList<String> i unesi nekoliko imena. Zatraži od korisnika da unese ime koje želi zamijeniti i novo ime. 
Ako se ime nalazi u listi, zamijeni ga novim imenom i ispiši listu.*/

package primjer_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ZamjenaElemenata {
	public static void main(String[]args) {
		ArrayList<String> imena = new ArrayList<String>();
		imena.add("Zvone");
		imena.add("Ante");
		imena.add("Gabi");
		imena.add("Mirko");
		imena.add("Niko");
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite ime koje želite zamjeniti: ");
		String staroIme = ulaz.nextLine();
		
		System.out.print("Unesite ime koje želite umjesto prethodnog: ");
		String novoIme = ulaz.nextLine();
		
		for(int i=0; i<imena.size(); i++) {
			if(staroIme.equals(imena.get(i))) {
				 imena.set(i, novoIme);
			}
		}
		 System.out.println("Zamjenili ste ime: "+staroIme+" za ime: "+novoIme+".");
		 System.out.println("Sada vaša lista izgleda ovako: "+imena);
			 ulaz.close();
		}
	}

