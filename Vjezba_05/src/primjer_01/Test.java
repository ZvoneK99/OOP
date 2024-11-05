package primjer_01;

public class Test {
	public static void main(String[]args) {

		Osoba osoba1 = new Osoba("Ante", "Antic", 2000);
		Student student1 = new Student("Zvone", "Kozul", 1999,1743, 1.5);
		Profesor profesor1 = new Profesor("Petar", "Peric", 1975, "Dipl.ing");
		profesor1.predmeti.add("Zemljopis");
		profesor1.predmeti.add("Povijest");
		
		//osoba1.ispisiDetalje();
		student1.ispisiDetalje();
		//profesor1.ispisiDetalje();
	}
}
