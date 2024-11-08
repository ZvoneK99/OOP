package primjer07;

public class Kalkulator {
		double a; 
		double b;
	
	public Kalkulator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double zbrojiBrojeve() {
		double zbroj = 0;
		zbroj =a+b;
		return zbroj;
	}
	public double razlikaBrojeva() {
		double razlika=0;
		razlika = a-b;

		return razlika;
	}
	public static void main(String[]args) {
		Kalkulator k1 = new Kalkulator(3,5);
		Kalkulator k2 = new Kalkulator(20,9);
		
		System.out.println(k1.zbrojiBrojeve());
		System.out.println(k2.razlikaBrojeva());
	}
	
}
