package zad1;

public class Zadatak1 {
	public static void main(String[]args) {
		StolnoRacunalo sr1 = new StolnoRacunalo("HP", "Sto", "Windows", 50.0, 20.0, 40.0);
		PrijenosnoRacunalo p1 = new PrijenosnoRacunalo("Fujitsu", "Lifebook", "Windows", 5000, 1.4);
		Netbook n1 = new Netbook("Samsung", "s1", "Windows", 3500, 1.4);
		
		StolnoRacunalo racunalo = new StolnoRacunalo("ModelX", "HP", "Windows 10", 50.0, 30.0, 20.0);
		System.out.println("Prenosivost: " + racunalo.izracunajPrenosivost());

		System.out.println(sr1);
		System.out.println(sr1.dohvatiTipRacunala());
		System.out.println(sr1.izracunajPrenosivost());
		System.out.println("--------------------------");
		System.out.println(p1);
		System.out.println(p1.dohvatiTipRacunala());
		System.out.println(p1.izracunajPrenosivost());
		System.out.println("--------------------------");
		System.out.println(n1);
		System.out.println(n1.dohvatiTipRacunala());
		System.out.println(n1.izracunajPrenosivost());
	}
}
