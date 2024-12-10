package zad1;

import java.time.LocalDate;

public class Transakcija {
	private int id;
	private String opis;
	private double iznos;
	private LocalDate datum;
	
	public Transakcija(int id, String opis, double iznos, LocalDate datum) {
		this.setId(id);
		this.setOpis(opis);
		this.setIznos(iznos);
		this.setDatum(datum);
	}
//Getteri i setteri
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public String toString() {
		return "Id: "+id+", Opis: "+opis+", Iznos: "+iznos+", Datum: "+datum+".";
	}
}
