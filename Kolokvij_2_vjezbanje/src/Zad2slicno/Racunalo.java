package Zad2slicno;

public class Racunalo extends OsnovniUredjaj {
	private String procesor;
	private int kolicinaRAM;
	
	public Racunalo(String nazivUredjaja, boolean stanjeUredjaja, String procesor, int kolicinaRAM) {
		super(nazivUredjaja, stanjeUredjaja);
		this.setProcesor(procesor);
		this.setKolicinaRAM(kolicinaRAM);
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
		return super.toString()+" Procesor: "+getProcesor()+" RAM: "+getKolicinaRAM();
	}

	
}
