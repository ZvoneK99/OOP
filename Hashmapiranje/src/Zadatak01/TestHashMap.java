package Zadatak01;

import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {
	public static void main(String[]args) {
		HashMap<String, Double> mapa = new HashMap<>();
		
		mapa.put("Jabuka", 1.5);
		mapa.put("Kruh", 1.2);
		mapa.put("Mlijeko", 1.8);
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite naziv proizvoda: ");
		String naziv = ulaz.nextLine();
		
		if(mapa.containsKey(naziv)) {
			System.out.println("Cijena proizvoda "+naziv+" iznosi "+mapa.get(naziv)+" KM");
		}
		else {
			System.out.println("Proizvod nije pronađen.");
		}
	ulaz.close();
	}
	
}
