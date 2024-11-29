package zadatak;

public class GeometrijskiLik {
	 double povrsina;
	double opseg;
	private static int brojacLikova = 0;
	private int redniBroj;
	
	 public GeometrijskiLik(double povrsina, double opseg) {
		 	brojacLikova++;
	        this.povrsina = povrsina;
	        this.opseg = opseg;
	        this.redniBroj = brojacLikova;
	    }
	 @Override 
	 public String toString() {
	     return "Geometrijski lik " + redniBroj;
	 }

	 public static int getBrojacLikova() {
		 return brojacLikova;
	 }
}	
