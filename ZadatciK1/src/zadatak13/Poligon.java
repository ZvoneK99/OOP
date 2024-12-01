package zadatak13;

import java.util.Scanner;
import java.util.ArrayList;

public class Poligon {
	int brojStranica;
	ArrayList<Double> stranice;
	double visina;
	
	public Poligon(int brojStranica, double visina, Scanner ulaz) {
		this.brojStranica = brojStranica;
		this.visina = visina;
		this.stranice = new ArrayList<>();
		ucitajStranicu(ulaz);
	}
	public void ucitajStranicu(Scanner ulaz) {
		
		for(int i=0; i<brojStranica; i++) {
			System.out.println("Unesite stranicu "+(i+1));
			double stranica = ulaz.nextDouble();
			
			stranice.add(stranica);
		}
		
	}
	public double Opseg() {
		double opseg=0;
		for(int i=0; i<stranice.size(); i++) {
			opseg+=stranice.get(i);
		}
		return opseg;
	}
	public double Povrsina() {
		return (Opseg()*visina)/2;
	}
	
	@Override
	public String toString() {
		StringBuilder ispisStranica = new StringBuilder();
		
		for(int i=0; i<stranice.size(); i++) {
			ispisStranica.append("<").append(stranice.get(i)).append(">");
			if(i<stranice.size()-1) {
				ispisStranica.append(", ");
			}
		}
		
		return "Broj stranica <"+brojStranica+">, duljina "+ispisStranica+", Visina: "+visina+", Opseg: "+Opseg()+", Povrsina: "+Povrsina()+":";
	}
	
}
