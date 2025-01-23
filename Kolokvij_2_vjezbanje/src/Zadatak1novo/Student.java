package Zadatak1novo;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Osoba {
		private int godinaStudija;
		ArrayList<Integer> ocjeneIspita;
		
	public Student(int ID, String imePrezime, int godinaStudija) {
		super(ID, imePrezime);
		this.godinaStudija = godinaStudija;
		this.ocjeneIspita = new ArrayList<>();
		
		Scanner ulaz = new Scanner(System.in);
		while(true) {
			System.out.println("Unesite ocjenu ");
			int ocjena = ulaz.nextInt();
			
			if(ocjena==0) {
				break;
			}
			ocjeneIspita.add(ocjena);
		}
	}

	@Override
	public double dohvatiOcjenu() {
		int zbrojOcjena = 0;
		for(int ocjena : ocjeneIspita) {
			zbrojOcjena+=ocjena;
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
		
		return super.toString()+ "Godina studija "+getGodinaStudija()+" Ocjene:";
			
	}
	

}
