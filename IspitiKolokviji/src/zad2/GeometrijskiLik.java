package zad2;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometrijskiLik {
	private int brojStranica;
	ArrayList<Double> stranice;
	
	public GeometrijskiLik(int brojStranica) {
		this.brojStranica = brojStranica;
		this.stranice = new ArrayList<>();
		ucitajStranice();
	}
	
	public void ucitajStranice() {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice");
		for(int i=0; i<brojStranica; i++) {
			System.out.println("Unesite "+(i+1)+". stranicu");
			double stranica = ulaz.nextDouble();
			
			stranice.add(stranica);
		}
	}
	public double opseg() {
		double zbroj=0;
		for(Double stranica : stranice) {
			 zbroj+=stranica;
		}
		return zbroj;
	}
	@Override
	public String toString() {
	    StringBuilder straniceString = new StringBuilder();
	    for (Double stranica : stranice) {
	        straniceString.append(stranica).append(", ");
	    }
	    // Ukloni zadnji zarez i razmak
	    if (straniceString.length() > 0) {
	        straniceString.setLength(straniceString.length() - 2);
	    }

	    return "Geometrijski lik ima " + brojStranica + " stranica, duljine: [" +
	            straniceString + "], i opseg: " + opseg();
	}

}
