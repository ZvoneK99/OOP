package primjer06;

import java.util.ArrayList;

public class Odjel {
	ArrayList<Zaposlenik> zaposlenici;
	
	public Odjel(ArrayList<Zaposlenik> zaposlenici)  {
		this.zaposlenici = zaposlenici;
	}
	public void dodajZaposlenika(Zaposlenik zaposlenik) {
		zaposlenici.add(zaposlenik);
	}
	public void prikaziSveZaposlenike() {
		for(Zaposlenik z : zaposlenici) {
			z.ispisiDetalje();
		}
	}
	public void prikaziZaposlenikeNaProjektu(String projekt) {
		for(Zaposlenik z : zaposlenici) {
			if(z.projekti.equals(projekt)) {
				System.out.println(z.ime+" "+z.prezime+" "+z.brojZaposlenika);
			}
		}
	}

}
