package primjer01;

public class Test {
	public static void main(String[]args) {
		Osoba osoba = new Osoba("Zvone", 25);
		Student student = new Student("Pero", 20, "1743/RR");
		osoba.ispisiDetalje();
		student.ispisiDetalje();
	}
}
