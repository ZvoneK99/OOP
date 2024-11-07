package projekt_05;
import java.util.ArrayList;
public class Videoteka {
	ArrayList<Film> filmovi;
	
	public Videoteka() {
		this.filmovi = new ArrayList<>();
	}
	public void dodajFilm(Film f) {
		filmovi.add(f);
	}
	public void prikaziSveFilmove() {
		for(Film f : filmovi) {
			f.ispisiDetalje();
		}
	}
	public void prikaziDostupneFilmove() {
		boolean imaDostupnih = false;
		for(Film f : filmovi) {
			if(f.getDostupan()) {
				f.ispisiDetalje();
				imaDostupnih = true;
			}
		}
		if(!imaDostupnih) {
			System.out.println("Nema dostupnih filmova.");
		}

	}
	public void pronađiFilmPoNaslovu(String naslov) {
		for(Film f : filmovi) {
			if(f.getNaslov().equals(naslov)) {
				f.ispisiDetalje();
			}
			System.out.println("Nema filmova sa naslovom: "+naslov);
		}

	}
	public void posudiFilm(String naslov) {
		for(Film f : filmovi) {
			if(f.getNaslov().equals(naslov)) {
				if(f.getDostupan()) {
					f.setDostupan(false);
					System.out.println("Film "+naslov+" je uspješno posuđen.");
					return;
				}
				else {
					System.out.println("Film "+naslov+" je vec posuđen");
					return;
				}
			}
		}
		 System.out.println("Film s naslovom '" + naslov + "' nije pronađen u videoteci.");
	}
	public void vratiFilm(String naslov) {
		for(Film f : filmovi) {
			if(!f.getDostupan()) {
				f.setDostupan(true);
				System.out.println("Film "+naslov+" je uspjesno vraćen.");
				}
			}
		}
	}