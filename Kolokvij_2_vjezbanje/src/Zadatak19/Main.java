package Zadatak19;

public class Main {
	public static void main(String[]args) {
		Muzej muzej = new Muzej();
		
		Slika s1 = new Slika("Mona Lisa", 550, "Leonardo Da Vinci");
		Slika s2 = new Slika("Satovi", 300, "Salvador Dali");
		Skulptura sk1 = new Skulptura("Grci", 600, "mramor");
		Skulptura sk2 = new Skulptura("Djevica Marija", 400, "glina");
		Antikvitet a1 = new Antikvitet("Mali sat", 400, 4);
		Antikvitet a2 = new Antikvitet("Ogrlica", 300, 5);
		
		muzej.dodajEksponat(s1);
		muzej.dodajEksponat(s2);
		muzej.dodajEksponat(sk1);
		muzej.dodajEksponat(sk2);
		muzej.dodajEksponat(a1);
		muzej.dodajEksponat(a2);
		
		muzej.ispisiEksponate();
		System.out.println("---------------------------");
		System.out.println("SLIKE");
		muzej.fultrirajEksponate("slika");
		System.out.println("---------------------------");
		System.out.println("SKULPTURE");
		muzej.fultrirajEksponate("skulptura");
		System.out.println("---------------------------");
		System.out.println("ANTIKVITETI");
		muzej.fultrirajEksponate("antikvitet");
		System.out.println("---------------------------");
		System.out.println("Najskuplji eskponat:");
		muzej.najskupljiEksponat();
	}
}
