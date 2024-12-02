package zadatak4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		
		studenti.add(new Student("Zvone", "Kozul", 4));
		studenti.add(new Student("Ana", "Markovic", 5));
		studenti.add(new Student("Ivan", "Knezovic", 1));
		studenti.add(new Student("Petra", "Peric", 1));
		studenti.add(new Student("Marko", "Batarilo", 2));
		studenti.add(new Student("Maja", "Lovric", 1));
		studenti.add(new Student("Josip", "Kovac", 1));
		studenti.add(new Student("Iva", "Skoko", 1));
		studenti.add(new Student("Lucija", "Mandic", 1));
		studenti.add(new Student("Tomislav", "Bilic", 2));
		studenti.add(new Student("Mate", "Raspudic", 1));
		studenti.add(new Student("Ivana", "Tomic", 3));
		studenti.add(new Student("Ante", "Simic", 2));
		studenti.add(new Student("Dora", "Grbavac", 1));
		studenti.add(new Student("Toni", "Barisic", 5));
		
		
		int brojPolozili=0;
		
		for(int i=0; i<studenti.size(); i++) {
			if(studenti.get(i).ocjena>=2) {
				brojPolozili++;
			}
		}
		Student[] polozili = new Student[brojPolozili];
		
		int index = 0;
		for(Student s : studenti) {
			if(s.getOcjena() >=2) {
				polozili[index++] = s;
			}
		}
		 Comparator<Student> comparator = Comparator.comparing(s -> (s.ime + s.prezime));
	        Arrays.sort(polozili, comparator);
		
		System.out.println("Studenti koji su položili ispit:");
			for(Student imePrezime : polozili) {
				System.out.println(imePrezime);
			}
	}
}
