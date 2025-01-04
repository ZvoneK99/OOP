package ZSR2ZAD3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("Unesite ime:");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime:");
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite studij ");
			String studij = ulaz.nextLine();
			
			System.out.println("Unesite godinu studija");
			int godinaStudija = ulaz.nextInt();
			ulaz.nextLine();
			System.out.println("Unesite broj indeksa. ");
			String indeks = ulaz.nextLine();
			
			Student student = new Student(ime, prezime, studij, godinaStudija, indeks);
			studenti.add(student);
		}
			studenti.sort(Comparator.comparingInt(Student::getGodinaStudija));
			
			System.out.println("Osobe sortirane po godini studija: ");
			for(Student s : studenti) {
				System.out.println(s);
			}
	}
}
