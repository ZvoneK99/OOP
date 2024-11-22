package zadatak3;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		
		 zaposlenici.add(new Menadžer("Ana", 8000, 2000));
	     zaposlenici.add(new Radnik("Marko", 0, 160, 50));
	     zaposlenici.add(new Radnik("Ivana", 0, 180, 45));
	     zaposlenici.add(new Menadžer("Petar", 9000, 3000));
	     
	     for(Zaposlenik z : zaposlenici) {
	    	 z.ispisiDetalje();
	    	 System.out.println("Plaća: " + z.izracunajPlacu());
	            System.out.println();
	     }
		
		}
}
