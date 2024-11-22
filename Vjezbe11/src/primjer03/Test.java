package primjer03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Student> studenti = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("Unesite ime studenta "+(i+1)+".");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime studenta "+(i+1)+".");
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite prosjek ocjena studenta "+(i+1)+".");
			double prosjek= ulaz.nextDouble();
			ulaz.nextLine();
			
			Student student = new Student(ime, prezime, prosjek);
			
			studenti.add(student);
		}
		
		//Ispis studenta s najboljim prosjekom
		
		studenti.sort(Comparator.comparing(Student::getProsjekOcjena).reversed());
		System.out.println("Studenti sortirani po prosjeku su:");
		for(Student s : studenti) {
			s.ispisiDetalje();
		}
		
		System.out.println("Studenti sa prosjekom vecim od  3 su:");
		for(Student stud : studenti) {
			if(stud.većiOdProsjeka(3)) {
				stud.ispisiDetalje();
			}
		}
	}
}
