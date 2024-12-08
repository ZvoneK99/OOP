package zadatak1;

import java.util.ArrayList;

public class ZadatakMain {
	public static void main(String[]args) {
		ArrayList<Racunalo> racunala = new ArrayList<>();
		
        // Objekti klase Racunalo
        racunala.add(new Racunalo("Basic PC", "GenericBrand", 300));
        racunala.add(new Racunalo("Office PC", "WorkTech", 450));

        // Objekti klase Laptop
        racunala.add(new Laptop("Dell XPS 13", "Dell", 1200, 10));
        racunala.add(new Laptop("MacBook Pro", "Apple", 2500, 12));

        // Objekti klase StolnoRacunalo
        racunala.add(new StolnoRacunalo("Gaming Rig", "Alienware", 2000, 750));
        racunala.add(new StolnoRacunalo("Workstation", "HP", 1500, 500));
        
        for(Racunalo r : racunala) {
        	r.prikaziDetalje();
        }
	}
}
