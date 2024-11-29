package zadFaks;

public class GeometrijskiLik {
	double povrsina;
	double opseg;
	private static int brojacLika=0;
	private int redniBroj;
	public GeometrijskiLik(double povrsina, double opseg) {
		brojacLika++;
		this.povrsina = povrsina;
		this.opseg = opseg;
		this.redniBroj = brojacLika;
	}
	@Override
	public String toString() {
		return "("+povrsina+" "+opseg+") "+redniBroj+".";
	}
	public static int getBrojacLikova() {
		return brojacLika;
	}
}
