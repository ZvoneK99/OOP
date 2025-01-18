package Zadatak1novo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Osoba {
	private int godinaStudija;
	private ArrayList<Integer> ocjeneIspita;
	
	public Student(int ID, String imePrezime, int godinaStudija) {
		super(ID, imePrezime);
		this.setGodinaStudija(godinaStudija);
		this.setOcjeneIspita(new ArrayList<>());
		
		Scanner ulaz = new Scanner(System.in);
		
		while(true) {
			System.out.println("Unesite ocjenu: ");
			int ocjena = ulaz.nextInt();
			
			if(ocjena == 0) {
				break;
			}
			ocjeneIspita.add(ocjena);
		}
		ulaz.close();
	}
	
	@Override
	public double dohvatiOcjenu() {
		int zbrojOcjena = 0;
		for(int ocjena : ocjeneIspita) {
			zbrojOcjena += ocjena;
		}
		return zbrojOcjena/ocjeneIspita.size();
	}


	public int getGodinaStudija() {
		return godinaStudija;
	}


	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}


	public ArrayList<Integer> getOcjeneIspita() {
		return ocjeneIspita;
	}


	public void setOcjeneIspita(ArrayList<Integer> ocjeneIspita) {
		this.ocjeneIspita = ocjeneIspita;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(super.toString()).append(", Godina studija: ").append(godinaStudija).append(", Ocjene ispita: ");
	    for (int ocjena : ocjeneIspita) {
	        sb.append("<").append(ocjena).append(">");
	    }
	    return sb.toString();
	}

}
