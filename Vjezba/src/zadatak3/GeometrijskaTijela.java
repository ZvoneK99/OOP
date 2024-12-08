package zadatak3;

public class GeometrijskaTijela {
	private double volumen;
	private double opseg;
	static int brojacTijela;
	private int redniBroj;
	
	public GeometrijskaTijela(double volumen, double opseg) {
		brojacTijela++;
		this.volumen = volumen;
		this.opseg = opseg;
		this.redniBroj = brojacTijela;
	}
	
	public double getVolumen() {
		return this.volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	public double getOpseg() {
		return this.opseg;
	}
	public void setOpseg(double opseg) {
		this.opseg = opseg;
	}
	public double getRedniBroj() {
		return this.redniBroj;
	}
	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	public String toString() {
		return "("+volumen+" "+opseg+")"+" Redni broj: "+redniBroj+".";
	}
}
