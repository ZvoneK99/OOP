package zadatak02;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main (String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		studenti.add(new Student("Ivan", "Ivić", "RI-01", 4.5));
		studenti.add(new Student("Ana", "Anić", "RI-02", 3.8));
		studenti.add(new Student("Marko", "Marić", "RI-03", 4.9));
		studenti.add(new Student("Lucija", "Lucić", "RI-04", 4.1));
		studenti.add(new Student("Petar", "Perić", "RI-05", 3.4));
		studenti.add(new Student("Mia", "Matić", "RI-06", 4.0));
		studenti.add(new Student("Sara", "Sarić", "RI-07", 5.0));
		studenti.add(new Student("Luka", "Lukić", "RI-08", 3.6));
		studenti.add(new Student("Tina", "Tinić", "RI-09", 4.3));
		studenti.add(new Student("Josip", "Josić", "RI-10", 3.9));
		
		//Student sa najvisim prosjekom ocjena
		Student najvisaOcjena = studenti.get(0);
		for(int i=0; i<studenti.size(); i++) {
			if(studenti.get(i).prosjekOcjena>najvisaOcjena.prosjekOcjena)
				najvisaOcjena=studenti.get(i);
		}
		System.out.println("Student sa najvisim prosjekom ocjena je:");
		najvisaOcjena.ispisiImePrezime();
	
	System.out.println("Studenti sa prosjekom ocjena većim od 4 su:");
	for(int i=0; i<studenti.size(); i++) {
		if(studenti.get(i).prosjekOcjena>4) {
			studenti.get(i).ispisiImePrezime();
		}
	}
	Collections.sort(studenti);
	System.out.println("Studenti sortirani prema prosjeku ocjena: ");
	for(Student s : studenti) {
		System.out.println(s.toString());
	}
	}
}
