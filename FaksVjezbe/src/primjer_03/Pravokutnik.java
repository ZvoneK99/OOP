/* kreirati klasu pravokutnik koja ce imati (dvije stranice, konstruktor u koji proslijeđujemo stranice, konstruktor kopije
 	ta klasa ce imati 2 metode postaviA postaviB;
 	metode: ispisStranicuA ispisiStranicuB 
 	imati ce metode za racunanje opsega i povrsine, koje nece ispisivati nego vracati te vrijednosto
 	u glavnom programu instancirati objekt pravokutnik i ispisati vrijednosti
 	
 	3.dio definirati klasu trokut koja ima 3 stranice i nakon sto instancirate trokut treba ispisati radi li se o jednakostranicnom 
 	jednakokracnom ili raznostranicnom trokutu
 */

package primjer_03;

public class Pravokutnik {
	int stranicaA;
	int stranicaB;
	
	public Pravokutnik(int stranicaA, int stranicaB) {
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
	}
	public Pravokutnik(Pravokutnik drugiPravokutnik) {
		this.stranicaA = drugiPravokutnik.stranicaA;
		this.stranicaB = drugiPravokutnik.stranicaB;
	}
	
	public void postaviA(int stranicaA) {
		this.stranicaA = stranicaA;
	}
	public void postaviB(int stranicaB) {
		this.stranicaB = stranicaB;
	}
	public int ispisiStranicuA() {
		return this.stranicaA;
	}
	public int ispisiStranicuB() {
		return this.stranicaB;
	}
	public int racunajOpseg() {
        return 2 * (stranicaA + stranicaB);
    }
	  public int  racunajPovrsinu() {
	        return stranicaA * stranicaB;
	    }
	  
	  public static void main(String[]args) {
		  Pravokutnik pravokutnik1 = new Pravokutnik(5, 3);
		  System.out.println("Stranica A: " + pravokutnik1.ispisiStranicuA());
	        System.out.println("Stranica B: " + pravokutnik1.ispisiStranicuB());

	        // Ispis opsega i površine
	        System.out.println("Opseg: " + pravokutnik1.racunajOpseg());
	        System.out.println("Površina: " + pravokutnik1.racunajPovrsinu());
	        
	    }
	  }

