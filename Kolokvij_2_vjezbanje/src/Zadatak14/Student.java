package Zadatak14;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Osoba{
	private int godinaStudija;
	private ArrayList<Integer> ocjene;
	
	public Student(int ID, String imePrezime, int godinaStudija) {
		super(ID, imePrezime);
		this.setGodinaStudija(godinaStudija);
		this.ocjene = new ArrayList<Integer>();
		
		Scanner ulaz = new Scanner(System.in);
		while(true) {
			System.out.println("Unesite ocjenu ");
			int ocjena = ulaz.nextInt();
			if(ocjena == 0) {
				break;
			}
			ocjene.add(ocjena);
		}
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public ArrayList<Integer> getOcjene() {
		return ocjene;
	}

	public void setOcjene(ArrayList<Integer> ocjene) {
		this.ocjene = ocjene;
	}
	@Override
	public double izracunajRezultat() {
		double zbrojOcjena=0;
		for(int ocjena : ocjene) {
			zbrojOcjena+=ocjena;
		}
		return zbrojOcjena / ocjene.size();
	}

	@Override
	public String IspisiIzvjestaj() {
		 StringBuilder sb = new StringBuilder();
		    
		    sb.append(super.toString())
		      .append(", Godina studija: ").append(getGodinaStudija())
		      .append(", Ocjene: ");
		    for (int ocjena : ocjene) {
		        sb.append(ocjena).append(" ");
		    }
		    return sb.toString();
	}

}
