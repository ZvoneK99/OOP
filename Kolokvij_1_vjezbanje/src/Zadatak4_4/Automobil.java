package Zadatak4_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Automobil {
	private String marka;
	private String model;
	private int brojPutnika;
	ArrayList<Double> potrosnjaPoKilometru;
	
	public Automobil(String marka, String model, int brojPutnika) {
		this.marka = marka;
		this.model = model;
		this.brojPutnika = brojPutnika;
		this.potrosnjaPoKilometru = new ArrayList<>();
		ucitajPotrosnje();
	}

	public void ucitajPotrosnje() {
		Scanner ulaz = new Scanner(System.in);
		for(int i =0; i<brojPutnika; i++) {
			System.out.println("Unesite potrosnju goriva za putnika "+(i+1));
			double potrosnja = ulaz.nextInt();
			potrosnjaPoKilometru.add(potrosnja);
		}
	}
	public double prosjecnaPotrosnja() {
		double zbroj=0;
		for(Double broj : potrosnjaPoKilometru) {
			zbroj+=broj;
		}
		return zbroj/potrosnjaPoKilometru.size();
	}
	public double ukupnaPotrosnja() {
	    double zbroj = 0;
	    for (double potrosnja : potrosnjaPoKilometru) {
	        zbroj += potrosnja; // Zbroji sve vrijednosti iz liste
	    }
	    return zbroj; // Vrati ukupnu potrošnju
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Automobil: ").append("<"+marka+">").append("<"+model+">\n");
		sb.append("Broj putnika: ").append("<"+brojPutnika+">\n");
		sb.append("Potrosnja po kilometru: ");
		for(Double p : potrosnjaPoKilometru) {
			sb.append("<"+p+">");
		}
		sb.append("\n");
		sb.append("Ukupna potrosnja: ").append("<"+ukupnaPotrosnja()+">\n");
		sb.append("Prosjecna potrosnja: ").append("<"+prosjecnaPotrosnja()+">");
	
		return sb.toString();
	}
	
}
