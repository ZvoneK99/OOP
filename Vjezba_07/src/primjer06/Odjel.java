package primjer06;

import java.util.ArrayList;

public class Odjel {
	ArrayList<Zaposlenik> zaposlenici;
	
	public Odjel()  {
		this.zaposlenici = new ArrayList<>();
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
			if(z.projekti.contains(projekt)) {
				System.out.println(z.ime+" "+z.prezime+" "+z.brojZaposlenika);
			}
		}
	}

}
