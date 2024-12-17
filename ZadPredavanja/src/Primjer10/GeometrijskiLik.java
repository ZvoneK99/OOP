package Primjer10;

public abstract class GeometrijskiLik {
	public Tocka srediste;
	
	public GeometrijskiLik(Tocka srediste) {
		this.srediste = srediste;
	}
	public abstract double povrsina();
	public abstract double opseg();
	
	public String toString() {
		return "Srediste "+srediste;
	}
}
