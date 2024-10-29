/*	3.dio definirati klasu trokut koja ima 3 stranice i nakon sto instancirate trokut treba ispisati radi li se o jednakostranicnom 
 	jednakokracnom ili raznostranicnom trokutu
 	
 	korisnik unosi datum u formatu dan/mjesec/godina
 	ispisuje se je li datum valjan na nacin da ispisemo uneseni datum; mjesec ispisemo rijecima, valjan je tako sto provjerimo za svaki mjesec je li
 	dobro unesen broj dana*/

package primjer_04;

public class Trokut {
    double stranicaA;
    double stranicaB;
    double stranicaC;

    public Trokut(double a, double b, double c) {
        this.stranicaA = a;
        this.stranicaB = b;
        this.stranicaC = c;
    }

    public boolean jeJednakostranican() {
        return stranicaA == stranicaB && stranicaB == stranicaC;
    }

    public boolean jeJednakokracan() {
        return (stranicaA == stranicaB && stranicaA != stranicaC) ||
               (stranicaA == stranicaC && stranicaA != stranicaB) ||
               (stranicaB == stranicaC && stranicaB != stranicaA);
    }

    public boolean jeRaznostranican() {
        return stranicaA != stranicaB && stranicaA != stranicaC && stranicaB != stranicaC;
    }

    public void ispisiTipTrokuta() {
        if (jeJednakostranican()) {
            System.out.println("Trokut je jednakostranican.");
        } else if (jeJednakokracan()) {
            System.out.println("Trokut je jednakokracan.");
        } else if (jeRaznostranican()) {
            System.out.println("Trokut je raznostranican.");
        } else {
            System.out.println("Nepoznati tip trokuta.");
        }
    }

    public static void main(String[] args) {

        double a = 5;
        double b = 2;
        double c = 8;

 
        Trokut trokut = new Trokut(a, b, c);

        trokut.ispisiTipTrokuta();
    }
}

