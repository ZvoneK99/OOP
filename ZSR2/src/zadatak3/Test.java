package zadatak3;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	public static void main(String[]args) {
		ArrayList<Student> studenti = new ArrayList<>();
		
		Studij racunarstvo = new Studij("Racunarstvo");
		Studij strojarstvo = new Studij("Strojarstvo");
		Studij elektrotehnika = new Studij("Elektrotehnika");
		
		Student s1 = new Student("Zvone", "Kozul", racunarstvo, 3, "1743/RR");
		Student s2 = new Student("Ana", "Markovic", strojarstvo, 2, "1821/SS");
		Student s3 = new Student("Ivan", "Knezovic", elektrotehnika, 1, "2001/EE");
		Student s4 = new Student("Petra", "Peric", racunarstvo, 2, "1932/RR");
		Student s5 = new Student("Marko", "Batar", strojarstvo, 3, "1783/SS");
		Student s6 = new Student("Maja", "Lovric", elektrotehnika, 4, "2012/EE");
		Student s7 = new Student("Josip", "Kovac", racunarstvo, 1, "1909/RR");
		Student s8 = new Student("Iva", "Skoko", strojarstvo, 4, "1756/SS");
		Student s9 = new Student("Lucija", "Mandic", elektrotehnika, 2, "1894/EE");
		Student s10 = new Student("Tomo", "Bilic", racunarstvo, 3, "1725/RR");
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		studenti.add(s4);
		studenti.add(s5);
		studenti.add(s6);
		studenti.add(s7);
		studenti.add(s8);
		studenti.add(s9);
		studenti.add(s10);
		
		studenti.sort(Comparator.comparing(Student::getGodinaStudija));
		
		System.out.println("Osobe na racunarstvu:");
		for(Student s : studenti) {
			if(s.studij.equals(racunarstvo)) {
				System.out.println(s.toString());
			}
		}
		System.out.println("Osobe na strojarstvu:");
		for(Student s : studenti) {
			if(s.studij.equals(strojarstvo)) {
				System.out.println(s.toString());
			}
	}
		System.out.println("Osobe na elektrotehnika:");
		for(Student s : studenti) {
			if(s.studij.equals(elektrotehnika)) {
				System.out.println(s.toString());
			}
		}
	}
}
