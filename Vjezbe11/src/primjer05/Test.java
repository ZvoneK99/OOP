package primjer05;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<Vozilo> listaVozila = new ArrayList<>();
		
		 	listaVozila.add(new Vozilo("Ford", "Focus", 2018, 10000));
	        listaVozila.add(new Automobil("Audi", "A4", 2020, 20000, 4, "dizel"));
	        listaVozila.add(new Vozilo("Toyota", "Yaris", 2015, 8000));
	        listaVozila.add(new Automobil("Tesla", "Model S", 2022, 60000, 4, "električni"));
	        
	        for(Vozilo v : listaVozila) {
	        	v.ispisiDetalje();
	        	v.start();
	        }
	        
	        int brojAutomobila = 0;
	        
	        for(Vozilo v : listaVozila) {
	        	if(v instanceof Automobil) {
	        		brojAutomobila++;
	        	}
	        }
	        System.out.println("Broj automobila: "+brojAutomobila);
	}
}
