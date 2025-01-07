package ZAD2;

import java.util.Arrays;

public abstract class PoreznaStopa {
	private String[] stope = new String[] {"A", "E", "J", "K", "M"};
	private double[] visineStope = new double[] {0.0, 17.0, 10.0, 20.0, 5.0};
	private final double[] pocetneVisineStope;
	
	public PoreznaStopa(String naziv, double[] visineStope) {
	    this.stope = new String[] {naziv}; // Postavlja naziv specifičan za izvedenu klasu
	    this.visineStope = visineStope.clone(); // Postavlja visine stopa
	    this.pocetneVisineStope = visineStope.clone(); // Pohranjuje početne vrijednosti
	}

	public abstract double promjeniVisinuStope(int indeks, double novaVisinaStope);
	public void resetirajVisineStope() {
		for(int i=0; i<visineStope.length; i++) {
			visineStope[i] = pocetneVisineStope[i];
		}
	}
	
	
	//Getteri i setteri
	public String[] getStope() {
		return stope;
	}
	
	public double[] getVisineStope() {
		return this.visineStope;
	}
	
	@Override
	public String toString() {
		return "Stope "+Arrays.toString(stope)+", Visine stopa "+Arrays.toString(visineStope); 
	}
	
	public static void main(String[]args) {
	}
}
