package Zadatak4_2;

public class Pravokutnik {
	double sirina;
	double visina;
	
	public Pravokutnik(double sirina, double visina) {
		if(sirina<0) {
			sirina=0;
		}
		if(visina<0) {
			visina=0;
		}
		this.sirina = sirina;
		this.visina = visina;
	}
	public double povrsina() {
		return sirina*visina;
	}
	public double opseg() {
		return 2*(sirina+visina);
	}
	public boolean jeKvadrat() {
		if(sirina == visina) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pravokutnik [").append("Širina: ").append(sirina).append(", Visina: ").append(visina).append(", Površina: <").append(povrsina())
		.append("> ,Opseg: <").append(opseg()).append(">, Kvadrat: <").append(jeKvadrat()).append(">]");
		return sb.toString();
	}
	public static void main(String[]args) {
		Pravokutnik p1 = new Pravokutnik(4,4);
		
		System.out.println(p1);
	}
}
