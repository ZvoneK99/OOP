package zadatak_06;

public class Liječnik extends Osoba {
	String specijalizacija;
	int godineIskustva;
	
public Liječnik(String ime, String prezime, int godinaRođenja, String specijalizacija, int godineIskustva) {
	super(ime, prezime, godinaRođenja);
	this.specijalizacija = specijalizacija;
	this.godineIskustva = godineIskustva;
}
public void ispisiDetalje() {
	System.out.println("----Podatci o liječniku----");
	System.out.println("Ime i prezime "+ime+" " +prezime);
	System.out.println("Godina rođenja "+godinaRođenja);
	System.out.println("Specijalizacija "+specijalizacija);
	System.out.println("Godine iskustva "+godineIskustva);
}
}
