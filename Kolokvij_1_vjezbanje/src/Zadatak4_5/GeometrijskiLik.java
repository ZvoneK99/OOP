package Zadatak4_5;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometrijskiLik {
	private int BrojStranica;
	ArrayList<Double> Stranice;
	
	public GeometrijskiLik(int BrojStranica) {
		this.setBrojStranica(BrojStranica);
		this.Stranice = new ArrayList<>();
		UcitajStranice();
	
	}

	public void UcitajStranice() {
		Scanner ulaz = new Scanner(System.in);
		for(int i=0; i<BrojStranica; i++) {
			System.out.println("Unesite stranicu "+(i+1));
			double stranica = ulaz.nextDouble();
			Stranice.add(stranica);
		}
	}
	
	public double Opseg() {
		double opseg = 0;
		
		for(double stranica : Stranice) {
			opseg+=stranica;
		}
		return opseg;
	}
	
	public int getBrojStranica() {
		return BrojStranica;
	}

	public void setBrojStranica(int brojStranica) {
		BrojStranica = brojStranica;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Geometrijski lik ima ").append("<"+getBrojStranica()+"> stranica, duljina ");
		for(double str : Stranice) {
			sb.append("<"+str+">"+" ");
		}
		sb.append("i opseg ").append(Opseg());
		
		return sb.toString();
	}
}
