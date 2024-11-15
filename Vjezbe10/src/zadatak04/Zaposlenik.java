package zadatak04;

public class Zaposlenik {
	String ime;
	String prezime;
	String pozicija;
	int godinaZaposlenja;
	double placa;
	
	public Zaposlenik(String ime, String prezime, String pozicija, int godinaZaposlenja, double placa) {
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.godinaZaposlenja = godinaZaposlenja;
		this.placa = placa;
	}
	public boolean godinaZaposlenja(int godinaProvjere) {
		if(godinaZaposlenja<godinaProvjere) {
			return true;
		}
		else {
			return false;
		}
	}
	public String ispisiImePrezime() {
		return "Ime i prezime: "+ime+" "+prezime;
	}
	
	@Override
	public String toString() {
		return"Ime i prezime: "+ime+" "+prezime+", Pozicija: "+pozicija+", Godina zaposlenja: "+godinaZaposlenja+", Placa: "+placa;
	}
	
}
