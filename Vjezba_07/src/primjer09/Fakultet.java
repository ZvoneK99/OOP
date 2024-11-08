package primjer09;

import java.util.ArrayList;

public class Fakultet {
	ArrayList<Student> studenti;
	
	public Fakultet() {
		this.studenti = new ArrayList<>();
	}
	public void dodajStudenta(Student student) {
		studenti.add(student);
	}
	public void prikaziStudente() {
		System.out.println("-----------------------------");
		System.out.println("Detalji o studentima:");
		for(Student s : studenti) {
			s.ispisiDetalje();
		}
	}
	public void prikaziStudentePremaECTSBodovima(int minECTSBodovi) {
		boolean pronaden = false;
		System.out.println("Studenti sa većim brojem bodova od "+minECTSBodovi+" bodova su:");

		for(Student s : studenti) {
			if(s.ukupnoECTSBodova()>minECTSBodovi) {
				s.ispisiDetalje();
				pronaden = true;
			}
			if(!pronaden){
				System.out.println("Nema studenata sa vise od "+minECTSBodovi+" bodova.");
			}
		}
		
	}
}
