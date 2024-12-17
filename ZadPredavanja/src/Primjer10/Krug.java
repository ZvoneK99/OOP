package Primjer10;

public class Krug extends GeometrijskiLik {
	double polumjer;
	
	public Krug(Tocka srediste, double polumjer) {
		super(srediste);
		this.polumjer = polumjer;
	}
	
	@Override
	public double povrsina() {
		return polumjer*polumjer*Math.PI;
	}

	@Override
	public double opseg() {
		return 2*polumjer*Math.PI;
	}
	@Override
	public String toString() {
		return"Krug "+ super.toString()+ "Polumjer "+polumjer;
	}
}
