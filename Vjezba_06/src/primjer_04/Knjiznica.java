package primjer_04;
import java.util.ArrayList;
public class Knjiznica {
	ArrayList<Knjiga> knjige;
	
	public Knjiznica() {
		this.knjige = new ArrayList<>();
	}
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
	}
	public void prikaziSveKnjige() {
		for(Knjiga k : knjige) {
			k.ispisiDetalje();
		}
	}
	public void pronađiKnjiguPoNaslovu(String naslov) {
		for(Knjiga k : knjige) {
			if(k.getNaslov().equals(naslov)) {
				k.ispisiDetalje();
				return;
			}
		}
		System.out.println("Knjiga "+naslov+" nije u knjiznici");
	}
	public void posudiKnjigu(String naslov) {
		for(Knjiga k : knjige) {
			if(k.getNaslov().equals(naslov)) {
				if(k.getDostupna()) {
					k.setDostupna(false);
					System.out.println("Knjiga "+naslov+" je uspjesno posuđena.");
					return;
				}else {
					System.out.println("Knjiga "+naslov+" je već posuđena.");
					return;
				}
			}
		}
		System.out.println("Knjiga s naslovom '" + naslov + "' nije pronađena.");
	}
	
}
