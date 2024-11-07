package primjer01;
import java.util.ArrayList;
public class Student {
	private String ime;
	private String prezime;
	private int brojIndeksa;
	private ArrayList<Integer> ocjene;
	
	public Student(String ime, String prezime, int brojIndeksa) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.ocjene = new ArrayList<>();
	}
	//Getteri i Setteri
	public String getIme() {
		return this.ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojIndeksa() {
		return this.brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public ArrayList<Integer> getOcjene() {
		return this.ocjene;
	}
	public void setOcjene(ArrayList<Integer> ocjene) {
		this.ocjene = ocjene;
	}
	
	public void dodajOcjenu(int ocjena) {
		ocjene.add(ocjena);
	}
	public double izracunajProsjek() {
		if(ocjene.isEmpty()) {
			System.out.println("Niste unijeli ocjene, ne mozemo izracunati prosjek.");
		}
			int zbroj = 0;
			for(int ocjena : ocjene) {
				zbroj+=ocjena;
		}
			return (double) zbroj/ocjene.size();
	}
	public void ispisiDetalje() {
		System.out.println("--Detalji o Studentu--");
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Broj indeksa: "+brojIndeksa);
		System.out.println("Ocjene: "+ocjene);
	}
}
