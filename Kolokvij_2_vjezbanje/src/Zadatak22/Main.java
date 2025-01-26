package Zadatak22;

public class Main {
	public static void main(String[]args) {
	
		Avion a1 = new Avion("1743/rr", 300, 20000);
		Avion a2 = new Avion("ikaa", 450, 25000);
		Pilot p1 = new Pilot("Zvone", "Kozul", 300);
		Pilot p2 = new Pilot("Ante", "Antic", 250);
		Stjuardesa s1 = new Stjuardesa("Ana", "Anic", 5);
		Stjuardesa s2 = new Stjuardesa("Marija", "Maric", 6);
		
		KomercijalniLet kl1 = new KomercijalniLet(400, 50, a1);
		KomercijalniLet kl2 = new KomercijalniLet(350, 70, a2);
		
		ZracnaLuka zr = new ZracnaLuka();
		System.out.println("-------------Dodavanje letova u zracnu luku-----------");
		zr.dodajLet(kl1);
		zr.dodajLet(kl2);
		
		System.out.println("-------------------Ispis svih letova------------------");
		zr.ispisiLetove();
		
		System.out.println("-----------------Najskuplji let-------------------");
		zr.prikaziNajskupljiLet();
		
		System.out.println("---------------Simulacija letova-----------------");
		kl1.zapocniLet();
		kl2.zapocniLet();
		
	}
}
