package Zadatak3;

public class Laptop extends OsnovniUredaj {
	private String procesor;
	private int kolicinaRAM;
	
	public Laptop(String naziv, String procesor, int kolicinaRAM) {
		super(naziv);
		this.procesor = procesor;
		this.kolicinaRAM = kolicinaRAM;
	}
	
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getKolicinaRAM() {
		return kolicinaRAM;
	}
	public void setKolicinaRAM(int kolicinaRAM) {
		this.kolicinaRAM = kolicinaRAM;
	}
	@Override
	public String toString() {
		return super.toString()+" Procesor "+getProcesor()+" Kolicina RAM-a "+getKolicinaRAM();
	}
}
