package zadatak5;

public class Student {
	private String ime;
	private String prezime;
	private String studij;
	private int godinaStudija;
	private String brojIndeksa;
	
	public Student(String ime, String prezime, String studij, int godinaStudija, String brojIndeksa) {
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setStudij(studij);
		this.setGodinaStudija(godinaStudija);
		this.setBrojIndeksa(brojIndeksa);
	}
	//Getteri i setteri
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getStudij() {
		return studij;
	}

	public void setStudij(String studij) {
		this.studij = studij;
	}

	public int getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String toString() {
		return "Ime i prezime: "+ime+" "+prezime+", Studij: "+studij+", Godina studija: "+godinaStudija+", Broj indeksa: "+brojIndeksa+".";
	}
}
