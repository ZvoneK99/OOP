package zad1_novo;

public class Zadatak1 {
	public static void main(String[]args) {
		StolnoRacunalo sr = new StolnoRacunalo("Apple", "Air", "iOS", 15, 40, 32);
		PrijenosnoRacunalo pr = new PrijenosnoRacunalo("Fujitsu", "LIFEBOOK", "Windows", 9000, 3.2);
		Netbook n = new Netbook("Lenovo", "Netbok", "windows", 4500, 1.4);
		
		System.out.println(sr.dohvatiTipRacunala());
		System.out.println(sr.izracunajPrenosivost());
		System.out.println(sr);
		System.out.println("-------------------------");
		System.out.println(pr.dohvatiTipRacunala());
		System.out.println(pr.izracunajPrenosivost());
		System.out.println(pr);
		System.out.println("-------------------------");
		System.out.println(n.dohvatiTipRacunala());
		System.out.println(n.izracunajPrenosivost());
		System.out.println(n);
		
		
	}
}
