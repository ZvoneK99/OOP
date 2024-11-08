package primjer03;

import java.util.ArrayList;
import java.util.Scanner;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("Unesite ime za: "+(i+1)+" osobu");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime za: "+(i+1)+" osobu");
			String prezime = ulaz.nextLine();
			
			ArrayList<Integer> ocjene = new ArrayList<>();
			for(int j=0; j<3; j++) {
				System.out.println("Unesite "+(j+1)+" ocjenu:");
				int ocjena = ulaz.nextInt();
				ocjene.add(ocjena);
			}
			ulaz.nextLine();
			studenti.add(new Student(ime, prezime, ocjene));
		}
		System.out.println("Prosjek ocjena za svakog studenta:");
		for(Student s : studenti) {
			s.prosjekOcjena();
		}
		ulaz.close();
	}
}
