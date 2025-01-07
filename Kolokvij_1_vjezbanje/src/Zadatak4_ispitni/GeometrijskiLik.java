package Zadatak4_ispitni;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometrijskiLik {
	int BrojStranica;
	ArrayList<Double> Stranice;
	
	public GeometrijskiLik(int BrojStranica) {
		this.BrojStranica = BrojStranica;
		this.Stranice = new ArrayList<>();
		UcitajStranice();
	}
	
	public void UcitajStranice() {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unos duljina za geometrijski lik s " + BrojStranica + " stranica:");
		for(int i=0; i<BrojStranica; i++) {
			System.out.println("Unesite duljinu stranice "+(i+1)+": ");
			double duljina = ulaz.nextDouble();
			Stranice.add(duljina);
		}
	}
	public double Opseg() {
		double opseg = 0;
		for(double duljinaStranice : Stranice) {
			opseg+=duljinaStranice;
		}
		return opseg;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Geometrijski lik ima ").append(BrojStranica).append(" stranica, duljine: ");
		
		for(int i=0; i<Stranice.size(); i++) {
			sb.append("<").append(Stranice.get(i)).append(">");
			if(i<Stranice.size()-1) {
				sb.append(", ");
			}
		}
		sb.append(" i opseg: ").append(Opseg());
		return sb.toString();
	}
}
