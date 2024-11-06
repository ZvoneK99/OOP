package primjer_02;

public class Test {
	public static void main (String[]args) {
		
		ZoloskiVrt zoo = new ZoloskiVrt();
		Lav lav1 = new Lav("Simba", "Lav", 5);
		Papiga papiga1 = new Papiga("Koko", "Papiga", 14);
		Zivotinja obicnaZivotinja = new Zivotinja ("Medo", "medvjed", 44);
		
		zoo.dodajZivotinju(lav1);
		zoo.dodajZivotinju(papiga1);
		zoo.dodajZivotinju(obicnaZivotinja);
		
		zoo.prikaziSveZivotinje();
	}
}