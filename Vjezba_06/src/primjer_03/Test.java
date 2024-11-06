package primjer_03;

public class Test {
	public static void main(String[]args) {
		Fakultet FSRE = new Fakultet();
		Student s1 = new Student("Zvone", "Kozul", "1743/rr", 2.5);
		Student s2 = new Student("Gabi", "Grbesic", "2222/rr", 4.0);
		Student s3 = new Student("Jozo", "Jozić", "1524/rr", 1.0);
		
		FSRE.dodajStudenta(s1);
		FSRE.dodajStudenta(s2);
		FSRE.dodajStudenta(s3);
		
		//FSRE.prikaziSveStudente();
		//FSRE.pronađiStudentaPoIndeksu("1743/rr");
		//FSRE.pronađiStudentaPoIndeksu("1733/rr");
		FSRE.ukloniStudentaPoIndeksu("1743/rr");
		FSRE.prikaziSveStudente();

	}
	
}
