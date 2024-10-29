/* kreirati klasu pravokutnik koja ce imati (dvije stranice, konstruktor u koji proslijeđujemo stranice, konstruktor kopije,
 	ta klasa ce imati 2 metode postaviA postaviB;
 	metode: ispisiStranicuA ispisiStranicuB 
 	imati ce metode za racunanje opsega i povrsine, koje nece ispisivati nego vracati te vrijednosto
 	u glavnom programu instancirati objekt pravokutnik i ispisati vrijednosti*/


package primjer_03;

public class Pravokutnik {
	private double stranicaA;
	private double stranicaB;
	
	//Konstruktor
	public Pravokutnik(double stranicaA, double stranicaB) {
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	//Konstruktor kopije
	public Pravokutnik(Pravokutnik drugiPravokutnik) {
		this.stranicaA = drugiPravokutnik.stranicaA;
		this.stranicaB = drugiPravokutnik.stranicaB;
	}
	public void postaviA(double stranicaA) {
		this.stranicaA = stranicaA;
	}
	public void postaviB(double stranicaB) {
		this.stranicaB = stranicaB;
	}
	public double ispisiStranicuA() {
		return this.stranicaA;
	}
	public double ispisiStranicuB() {
		return this.stranicaB;
	}
	public double racunajOpseg() {
		return 2*(stranicaA + stranicaB);
	}
	public double racunajPovrsinu() {
		return stranicaA * stranicaB;
	}
	
	//Glavni program
	public static void main(String[]args) {
		Pravokutnik p1 = new Pravokutnik(3.4, 4);
		System.out.println("Stranica A = "+ p1.ispisiStranicuA());
		System.out.println("Stranica B = "+p1.ispisiStranicuB());
		
		System.out.println("Opseg = "+p1.racunajOpseg());
		System.out.println("Površina = "+p1.racunajPovrsinu());
		
		//Stvaranje kopije p1 u p2 pomoću konstruktora kopije
		Pravokutnik p2 = new Pravokutnik(p1);
		System.out.println("Pravokutnik p2 (kopij1 p1) - Stranica A = "+p2.ispisiStranicuA());
		System.out.println("Pravokutnik p2 (kopij1 p1) - Stranica B = "+p2.ispisiStranicuB());
		
		//Mjenjamo stranice p2 kako bismo vidjeli da p1 ostaje nepromjenjen
		p2.postaviA(5.0);
		System.out.println("Nakon promjene stranice A u p2 na 5.0:");
		System.out.println("Pravkoutnik p1 - Stranica A = "+p1.ispisiStranicuA());
		System.out.println("Pravkoutnik p2 - Stranica A = "+p2.ispisiStranicuA());
	}
}

