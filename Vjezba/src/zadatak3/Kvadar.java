package zadatak3;

public class Kvadar extends GeometrijskaTijela {
	private double duljina;
	private double sirina;
	private double visina;
	
	public Kvadar(double duljina, double sirina, double visina) {
		super(duljina*sirina*visina, 2*(duljina*sirina+duljina*visina+sirina*visina));
		this.duljina = duljina;
		this.sirina = sirina;
		this.visina = visina;
	}
	public double getDuljina() {
		return this.duljina;
	}
	public void setDuljina(double duljina) {
		this.duljina = duljina;
	}
	public double getSirina() {
		return this.sirina;
	}
	public void setSirina(double sirina) {
		this.sirina = sirina;
	}
	public double getVisina() {
		return this.visina;
	}
	public void setVisina(double visina) {
		this.visina = visina;
	}
	@Override
	public String toString() {
		return "Kvadar: ("+getVolumen()+" "+getOpseg()+")"+" Redni broj: "+getRedniBroj()+".";
	}
}
