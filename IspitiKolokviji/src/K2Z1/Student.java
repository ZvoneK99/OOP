package K2Z1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Osoba {
	private int godinaStudija;
	ArrayList<Integer>ocjeneIspita;
	
	public Student(int ID, String imePrezime, int godinaStudija) {
		super(ID, imePrezime);
		this.setGodinaStudija(godinaStudija);
		this.ocjeneIspita = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ocjene za ucenika: "+getImePrezime()+" (0) za kraj unosa");
		
		while(true) {
			int ocjena = ulaz.nextInt();
			if(ocjena==0) {
				break;
			}
			if(ocjena>0) {
				ocjeneIspita.add(ocjena);
			}
		}
	}	
	
	//Getter i setter
	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	@Override
	public double dohvatiOcjenu() {
		int zbrojOcjena=0;
		for(Integer ocjena : ocjeneIspita) {
			zbrojOcjena+=ocjena;
		}
		return zbrojOcjena/ocjeneIspita.size();
	}
	@Override
	public String toString() {
		return super.toString()+" Godina studija: "+godinaStudija+" Prosjek ocjena: "+dohvatiOcjenu();
	}
}
