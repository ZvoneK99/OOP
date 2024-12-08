package zadatak3;

import java.util.ArrayList;

public class ZadatakMain {
	public static void main(String[]args) {
		ArrayList<GeometrijskaTijela> tijela = new ArrayList<>();
		
        tijela.add(new Kugla(3.0)); // Kugla s polumjerom 3
        tijela.add(new Kugla(5.5)); // Kugla s polumjerom 5.5

        tijela.add(new Kvadar(2.0, 4.0, 6.0)); // Kvadar s dimenzijama 2x4x6
        tijela.add(new Kvadar(1.5, 3.0, 2.5)); // Kvadar s dimenzijama 1.5x3x2.5

        tijela.add(new Kocka(3.0)); // Kocka s duljinom stranice 3
        tijela.add(new Kocka(7.0)); // Kocka s duljinom stranice 7
        
        for(GeometrijskaTijela tijelo: tijela) {
        	System.out.println(tijelo);
        }
	}
}
