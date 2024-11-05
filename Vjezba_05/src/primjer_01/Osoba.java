package primjer_01;

public class Osoba {
	String ime;
	String prezime;
	int godinaRođenja;
	
	public Osoba(String ime, String prezime, int godinaRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRođenja = godinaRođenja;
	}
	
	public void ispisiDetalje() {
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Godina rođenja: "+godinaRođenja);
	}
}
