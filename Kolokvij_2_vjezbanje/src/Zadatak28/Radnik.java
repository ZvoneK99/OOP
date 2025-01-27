package Zadatak28;

public class Radnik {
	int ID;
	String imePrezime;
	int godineIskustva;
	
	public Radnik(int ID, String imePrezime, int godineIskustva) {
		this.ID = ID;
		this.imePrezime = imePrezime;
		this.godineIskustva = godineIskustva;
	}
	public double izracunajPlacu() {
		return godineIskustva * 1000;
	}
	@Override
	public String toString() {
		return "ID "+ID+" ime prezime "+imePrezime+" Godine iskustva "+godineIskustva+" Placa "+izracunajPlacu(); 
	}
}
