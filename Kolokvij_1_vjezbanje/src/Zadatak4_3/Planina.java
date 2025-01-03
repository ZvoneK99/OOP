package Zadatak4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Planina {
	String naziv;
	int brojVrhova;
	ArrayList<Double> visineVrhova;
	
	public Planina(String naziv, int brojVrhova) {
		this.naziv = naziv;
		this.brojVrhova = brojVrhova;
		this.visineVrhova = new ArrayList<Double>();
		ucitajVisine();
	}
	public void ucitajVisine() {
		Scanner ulaz = new Scanner(System.in);
		for(int i=0;i< brojVrhova; i++) {
			System.out.println("Unesite visinu za vrh "+(i+1));
			double visina = ulaz.nextDouble();
			visineVrhova.add(visina);
		}
	}
	
	public double prosjecnaVisina() {
		double zbroj=0;
		for(double i : visineVrhova) {
			zbroj+=i;
		}
		return zbroj/visineVrhova.size();
	}
	public double najvisiVrh() {
		double najvisi=0;
		for(double v : visineVrhova) {
			if(v>najvisi) {
				najvisi=v;
			}
		}
		return najvisi;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Planina: <").append(naziv).append(">\n");
		sb.append("Broj vrhova: <").append(brojVrhova).append(">\n");
		sb.append("Visine vrhova: ");
		for (int i = 0; i < visineVrhova.size(); i++) {
		    sb.append("<").append(visineVrhova.get(i)).append(">");
		    if (i < visineVrhova.size() - 1) {
		        sb.append(", "); // Dodaj zarez osim za posljednji element
		    }
		}
		sb.append("\n");
		sb.append("Prosjecna visina: <").append(prosjecnaVisina()).append(">\n");
		sb.append("Najvisi vrh: <").append(najvisiVrh()).append(">\n");
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
