package zadatak10;

import java.util.ArrayList;
import java.util.Scanner;

public class Studenti {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj studenata");
		int n = ulaz.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Unesite ime i prezime studenta");
			String ime_prezime = ulaz.nextLine();
			
			System.out.println("Unesi broj ocjena: ");
			int brojOcjena =ulaz.nextInt();
			ulaz.nextLine();
			
			System.out.println("Unesite ocjene odvojene razmakom: ");
			String nizOcjena = ulaz.nextLine();
			
			String[] uneseneOcjene = nizOcjena.split(" ");
			ArrayList<Integer> ocjene = new ArrayList<>();
			
			for(String ocjena : uneseneOcjene) {
				ocjene.add(Integer.parseInt(ocjena));
			}
			for(Student s : studenti) {
				studenti.add(s);
			}
			
			for(int j=0; j<studenti.size(); j++) {
				Student najveciProsjek = studenti.get(j);
				studenti.get(j).izracunajProsjek();
				if(studenti.get(j)>najveciProsjek) {
					najveciProsjek
				}
			}
		}
	}
}
