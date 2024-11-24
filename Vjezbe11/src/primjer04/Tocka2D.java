package primjer04;

public class Tocka2D {
	private String ime;
	private double xKoordinata;
	private double yKoordinata;
	
	//Konstruktor bez parametara
	public Tocka2D() {
		this.ime = "O";
		this.xKoordinata = this.yKoordinata = 0;
	}
	//Konstruktor sa parametrima
	public Tocka2D(String ime, double xKoordinata, double yKoordinata) {
		this.ime = ime;
		this.xKoordinata = xKoordinata;
		this.yKoordinata = yKoordinata;
	}
	//Konstruktor kopije
	public Tocka2D(Tocka2D T) {
		this.ime = T.ime + "C";
		this.xKoordinata = T.xKoordinata;
		this.yKoordinata = T.yKoordinata;
	}
	//Getteri i Setteri
	public double getXKoordinatu() {
		return this.xKoordinata;
	}
	public void setXKoordinatu(double xKoordinata) {
	    this.xKoordinata = xKoordinata;
	}
	public double getYKoordinatu() {
		return this.yKoordinata;
	}
	public void setYKoordinatu(double yKoordinata) {
	    this.yKoordinata = yKoordinata;
	}
	
	public double udaljenost(Tocka2D T) {
		return Math.sqrt(Math.pow(T.xKoordinata- this.xKoordinata, 2)+Math.pow(T.yKoordinata - this.yKoordinata, 2));
	}
	
	public static double udaljenost(Tocka2D T1, Tocka2D T2) {
		return Math.sqrt(Math.pow(T2.xKoordinata - T1.xKoordinata, 2) + 
				Math.pow(T2.yKoordinata - T1.yKoordinata, 2));
	}
	
	public static Tocka2D poloviste(Tocka2D T1, Tocka2D T2) {
		Tocka2D P = new Tocka2D(T1.ime + "p" + T2.ime, (T2.xKoordinata + T1.xKoordinata) / 2, 
				(T2.yKoordinata + T1.yKoordinata) / 2);
		return P;
	}
	@Override
	public String toString() {
		return ime+"("+getXKoordinatu()+", "+getYKoordinatu()+")";
	}
}
