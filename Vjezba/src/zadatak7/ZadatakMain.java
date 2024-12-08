package zadatak7;

import java.util.ArrayList;

public class ZadatakMain {
	public static void main(String[]args) {
		ArrayList<NebeskoTijelo> tijela = new ArrayList<>();
		
		tijela.add(new Planet("Zemlja", 1500, 4000));
		tijela.add(new Satelit("Mjesec", 900, 2410));
		
		for(NebeskoTijelo t : tijela) {
			System.out.println(t.opis());
		}
	}
}
