package primjer01;

import java.util.ArrayList;

public class Fakultet {
	ArrayList<Student> studenti;
	
	public Fakultet() {
		this.studenti = new ArrayList<>();
	}
	public void dodajStudenta(Student student) {
		studenti.add(student);
	}
	public void prikaziSveStudente() {
		for(Student s : studenti) {
			s.ispisiDetalje();
		}
	}
	public void prikaziStudenteSProsjekomIznad(double granica) {
		System.out.println("Provjera studenata s prosjekom većim od " + granica);
		for(Student s : studenti) {
			if(s.izracunajProsjek()>granica) {
			    System.out.println(s.getIme() + " " + s.getPrezime() + " s prosjekom " + s.izracunajProsjek());
			}

		}

	}
}
