package primjer09;

public class GeometrijskiLik {
	double povrsina;
	double opseg;
	static int brojacLikova=1;
	private int redniBroj ;
	
	public GeometrijskiLik(double povrsina, double opseg) {
		this.povrsina = povrsina;
		this.redniBroj = brojacLikova;
		this.opseg = opseg;
		brojacLikova++;
	}
	@Override
	public String toString() {
	    return "Površina: " + povrsina + ", Opseg: " + opseg + ", Redni broj: " + redniBroj;
	}

	
	public double getPovrsina() {
		return this.povrsina;
	}
	public double getOpseg() {
		return this.opseg;
	}
	
	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	public void setOpseg(double opseg) {
		this.opseg = opseg;
	}
}
