package Zad2slicno;

import java.util.ArrayList;

public class Zadatak2 {
	public static void main(String[]args) {
		ArrayList<Uredjaj> uredjaji = new ArrayList<>();
		
		Televizor t1 = new Televizor("Tesla", false, 52, "UHD");
		Racunalo r1 = new Racunalo("Fujitsu", true, "Intel", 32);
		
		uredjaji.add(t1);
		uredjaji.add(r1);
		
		t1.iskljuciUredjaj();
		
		for(Uredjaj u : uredjaji) {
			System.out.println(u);
		}
	}
}
