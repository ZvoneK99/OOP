package primjer09;

public class Pravokutnik extends GeometrijskiLik {
	double sirina;
	double visina;
	
	public Pravokutnik(double sirina, double visina) {
		super(2*(sirina+visina), 2*(sirina+visina));
		this.visina = visina;
		this.sirina = sirina;
	}
}
