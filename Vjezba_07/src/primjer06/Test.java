package primjer06;

public class Test {
	public static void main(String[]args) {
		Zaposlenik z1 = new Zaposlenik("Zvone", "Kozul", 1743);
		Zaposlenik z2 = new Zaposlenik("Ante", "Kozul", 2000);
		Zaposlenik z3 = new Zaposlenik("Pero", "Peric", 5014);
		
		z1.dodajProjekt("krov");
		z1.dodajProjekt("zid");
		z2.dodajProjekt("zid");
		z3.dodajProjekt("podrum");
		
		Odjel odjel = new Odjel();
		odjel.dodajZaposlenika(z1);
		odjel.dodajZaposlenika(z2);
		
		  odjel.prikaziSveZaposlenike();
	        odjel.prikaziZaposlenikeNaProjektu("zid");
	}


}
