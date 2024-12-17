package Primjer10;

public class Pravokutnik extends GeometrijskiLik {
	int sirina;
	int visina;
	
	public Pravokutnik(Tocka srediste, int sirina, int visina) {
		super(srediste);
		this.sirina = sirina;
		this.visina = visina;
	}
	@Override
	public double povrsina() {
		return sirina*visina;
	}

	@Override
	public double opseg() {
		return 2*sirina+2*visina;
	}

}
