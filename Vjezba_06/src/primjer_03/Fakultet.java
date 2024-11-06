package primjer_03;
import java.util.ArrayList;
public class Fakultet {
	private ArrayList<Student> studenti;
	
	public Fakultet() {
		this.studenti = new ArrayList<>();
	}
	public void dodajStudenta(Student s) {
		studenti.add(s);
	}
	public void prikaziSveStudente() {
		for(Student s : studenti) {
			s.ispisiDetalje();
		}
	}
	public void pronađiStudentaPoIndeksu(String brojIndeksa) {
		for(Student s : studenti) {
			if(s.getBrojIndeksa() == brojIndeksa) {
				s.ispisiDetalje();
				return;
			}
			}
			System.out.println("Student sa tim brojem indeksa nije pronađen");
	}
	public void ukloniStudentaPoIndeksu(String brojIndeksa) {
		for(Student s : studenti) {
			if(s.getBrojIndeksa() == brojIndeksa) {
				studenti.remove(s);
				return;
			}
			else {
				System.out.println("Student sa tim brojem indeksa nije pronađen.");
			}
		}
	}
	
}
