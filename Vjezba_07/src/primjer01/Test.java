package primjer01;

public class Test {
	public static void main(String[]args) {
		Fakultet fakultet = new Fakultet();
		Student s1 = new Student("Zvone", "Kozul", 1743);
		Student s2 = new Student("Ante", "Bubalo", 2415);
		Student s3 = new Student("Pero", "Bubalo", 1521);
		s1.dodajOcjenu(4);
		s1.dodajOcjenu(5);
		s1.dodajOcjenu(1);
		s1.dodajOcjenu(2);
		s2.dodajOcjenu(4);
		s2.dodajOcjenu(3);
		s2.dodajOcjenu(3);
		s2.dodajOcjenu(2);
		s3.dodajOcjenu(4);
		s3.dodajOcjenu(5);
		s3.dodajOcjenu(1);
		s3.dodajOcjenu(5);
		
		fakultet.dodajStudenta(s1);
		fakultet.dodajStudenta(s2);
		fakultet.dodajStudenta(s3);
		//fakultet.prikaziSveStudente();
		fakultet.prikaziStudenteSProsjekomIznad(1.5);
	}
}
