package primjer09;

public class Test {
	public static void main(String[]args ) {
		Predmet p1 = new Predmet("Matematika", 7);
		Predmet p2 = new Predmet("Programiranje", 6);
		Predmet p3 = new Predmet("Fizika", 5);
		
		Student s1 = new Student("Zvone", "Kozul", 1743);
		Student s2 = new Student("Gabi", "Grbesic", 2210);
		Student s3 = new Student("Ante", "Antic", 3021);
		
		s1.dodajPredmet(p1);
		s1.dodajPredmet(p2);
		s2.dodajPredmet(p3);
		s3.dodajPredmet(p1);
		
		Fakultet FSRE = new Fakultet();
		
		FSRE.dodajStudenta(s1);
		FSRE.dodajStudenta(s3);
		
		FSRE.prikaziStudente();
	}
}
