package primjer03;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
	String ime;
	String prezime;
	double prosjekOcjena;
	
public Student(String ime, String prezime, double prosjekOcjena) {
	this.ime = ime;
	this.prezime = prezime;
	this.prosjekOcjena = prosjekOcjena;
}
public static void unosStudenata(ArrayList<Student> studenti) {
	Scanner ulaz = new Scanner(System.in);
	for(int i=0; i<4; i++) {
		System.out.println("Unesite ime:");
		String ime = ulaz.nextLine();
		
		System.out.println("Unesite prezime:");
		String prezime = ulaz.nextLine();
		
		System.out.println("Unesite prosjek:");
		double prosjekOcjena = ulaz.nextDouble();
		ulaz.nextLine();
		studenti.add(new Student(ime,prezime, prosjekOcjena));
		}
	ulaz.close();
	}	
public static void poredajStudente(ArrayList<Student> studenti) {
	studenti.sort(Comparator.comparingDouble(a -> -a.prosjekOcjena));
	}
public static void main(String[]args) {
	ArrayList<Student> studenti = new ArrayList<>();
	unosStudenata(studenti);
	poredajStudente(studenti);
	
	System.out.println("Studenti sortirani po prosjeku su: ");
	for(Student s : studenti) {
		System.out.println(s.ime+" "+s.prezime+" "+s.prosjekOcjena);
	}
	
}
}
