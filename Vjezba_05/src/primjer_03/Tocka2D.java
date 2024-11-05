//6.zadatak sa predavanja

package primjer_03;

public class Tocka2D {
	private String ime;
	private double xKoordinata;
	private double yKoordinata;
	
public Tocka2D () {
	this.ime = "O";
	this.xKoordinata = this.yKoordinata = 0;
}
public Tocka2D(String ime, double xKoordinata, double yKoordinata) {
	this.ime = ime;
	this.xKoordinata = xKoordinata;
	this.yKoordinata = yKoordinata;
}
public Tocka2D(Tocka2D T) {
	this.ime = T.ime = "C";
	this.xKoordinata = T.xKoordinata;
	this.yKoordinata = T.yKoordinata;
}
public double dohvatixKoordinatu() {
	return this.xKoordinata;
}
public double dohvatiyKoordinatu() {
	return this.yKoordinata;
}
public void postavixKoordinatu(double xKoordinata) {
	this.xKoordinata = xKoordinata;
}
public void postaviyKoordinatu(double yKoordinata) {
	this.yKoordinata = yKoordinata;
}

public double udaljenost(Tocka2D T) {
	return Math.sqrt(Math.pow(T.xKoordinata - this.xKoordinata,2)+
			Math.pow(T.yKoordinata - this.yKoordinata, 2));
}
public static void main(String[]args) {
	Tocka2D tocka = new Tocka2D();
	tocka.postavixKoordinatu(4.1);
	tocka.postaviyKoordinatu(11.5);
	
	System.out.println("Koordinata točke x: "+tocka.dohvatixKoordinatu());
	System.out.println("Koordinata točke y: "+tocka.dohvatiyKoordinatu());
	
}
}
