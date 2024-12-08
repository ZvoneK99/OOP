package zadatak3;

public class Kocka extends Kvadar {
	private double duljinaStranice;
	
	public Kocka(double duljinaStranice) {
		super(duljinaStranice, duljinaStranice, duljinaStranice);
	}
	
	public double getDuljinaStranice() {
		return this.duljinaStranice;
	}
	public void setDuljinaStranice(double duljinaStranice) {
		this.duljinaStranice = duljinaStranice;
	}
	@Override
	public String toString() {
		return "Kocka: ("+getVolumen()+" "+getOpseg()+")"+" Redni broj: "+getRedniBroj()+".";
	}
}
