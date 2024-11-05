package zadatak_06;

public class Pacijent extends Osoba {
	int brojKartona;
	String tegobe;
	
public Pacijent(String ime, String prezime, int godinaRođenja, int brojKartona, String tegobe) {
	super(ime, prezime, godinaRođenja);
	this.brojKartona = brojKartona;
	this.tegobe = tegobe;
}
public void ispisiDetalje() {
	System.out.println("----Detalji o pacijentu----");
	System.out.println("Ime i prezime: "+ime+" " +prezime);
	System.out.println("Godina rođenja "+godinaRođenja);
	System.out.println("Broj kartona: "+brojKartona);
	System.out.println("Tegobe "+tegobe);
}
}
