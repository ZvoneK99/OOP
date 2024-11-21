package zadatak1;

import java.util.ArrayList;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Oblik> oblici = new ArrayList<>();
		
		oblici.add(new Krug("Krug 1", 5));
		oblici.add(new Pravokutnik("Pravokutnik 1", 4, 6));
		
		for(Oblik oblik : oblici) {
			System.out.println("Naziv: "+oblik.getNaziv());
			System.out.println("Površina: "+oblik.izračunajPovršinu());
			System.out.println("Opseg: "+oblik.izračunajOpseg());
		}
	}
}
