package Zadatak2novo;

import java.util.ArrayList;
import java.util.Random;


public class Zad2 {
	public static void main(String[]args) {
		ArrayList<Vozilo> vozila = new ArrayList<>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			int tip = random.nextInt(4);
			
			if(tip==0) {
				vozila.add(new OsobnoVozilo(" "+i, " "+i, "  "+i, 5, 500));
			}
			else if(tip==1) {
				vozila.add(new TeretnoVozilo(" "+i, " "+i, 4, 50));
			}
			else if(tip==2) {
				vozila.add(new PutnickiKombi(" " + i, " " + i, 2.5, 5.0, 15));
			}
			else {
				vozila.add(new TeretniKombi(" " + i, " " + i, 2.5, 5.0, 15000));
			}
		}
		System.out.println("Vozila pogodna za prijevoz putnika");
		for(Vozilo pp : vozila) {
			if(pp.dohvatiMaksimalanBrojPutnika()>0) {
				System.out.println(pp);
			}
		}
		System.out.println("Vozila pogodna za prijevoz tereta");
		for(Vozilo pt : vozila) {
			if(pt.dohvatiMaksimalnuNosivost()>0) {
				System.out.println(pt);
			}
		}
	}
}
