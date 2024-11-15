package zadatak01;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<Automobil> automobili = new ArrayList<>();
		Automobil auto1 = new Automobil("Merc", "C-klasa", 2020, 5000);
		Automobil auto2 = new Automobil("BMW", "M5", 2021, 80000);
		Automobil auto3 = new Automobil("AUDI", "Q8", 2022, 95000);
		Automobil auto4 = new Automobil("RENAULT", "MEGANE", 2011, 10000);
		Automobil auto5 = new Automobil("VW", "GOLF 8", 2024, 70000);
		Automobil auto6 = new Automobil("VW", "GOLF 8", 2024, 70000);

		
		
		automobili.add(auto1);
		automobili.add(auto2);
		automobili.add(auto3);
		automobili.add(auto4);
		automobili.add(auto5);
		automobili.add(auto6);
		for(Automobil a : automobili) {
			a.ispisiDetalje();
		}


		Automobil najskupljiAuto = automobili.get(0);
		for(int i=0; i<automobili.size(); i++) {
			if(automobili.get(i).cijena>najskupljiAuto.cijena) {
				najskupljiAuto = automobili.get(i);
			}
		}
		System.out.println("Najskuplji automobil je: ");
		najskupljiAuto.ispisiDetalje();
	}
	public static boolean provjeriImaLiIstihAutomobila(ArrayList<Automobil> automobili) {
	    for (int i = 0; i < automobili.size(); i++) {
	        for (int j = i + 1; j < automobili.size(); j++) {
	            if (automobili.get(i).provjeriImaLiIstihAutomobila(automobili.get(j))) {
	                System.out.println("Duplikat pronađen: ");
	                automobili.get(i).ispisiDetalje();
	                return true;
	            }
	        }
	    }
	    return false;
	}

}
