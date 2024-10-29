/*korisnik unosi datum u formatu dan/mjesec/godina
 	ispisuje se je li datum valjan na nacin da ispisemo uneseni datum; mjesec ispisemo rijecima, valjan je tako sto provjerimo za svaki mjesec je li
 	dobro unesen broj dana
 	
 ZADACA:	napisati program koji sadrzi klasu osoba a ima sljedeca polja ime prezime  i datum rođenja
 	datum rođenja je posebna klasa koja ima polja dan mjesec godina
 	u glavnom programu napraviti niz od 10 osoba zatraziti od korisnika unos imena prezimena i datuma rođenja
 	nakon toga ispisati ime prezime i datum rođenja sortirane od najstarijeg do najmlađeg uz to cemo ispisati je li osoba punoljetna
 	ograničiti da korisnik ne unosi gluposti npr da je osoba rođena 2030
 	*/

package primjer_05;
	import java.util.Scanner;
public class Datum {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
	
	System.out.println("Unesite datum:");
	String unos =ulaz.nextLine();
	
	 String[] dijelovi = unos.split("/");
     int dan = Integer.parseInt(dijelovi[0]);
     int mjesec = Integer.parseInt(dijelovi[1]);
     int godina = Integer.parseInt(dijelovi[2]);
     
     if (jeDatumValjan(dan, mjesec, godina)) {
         System.out.println("Uneseni datum: " + dan + ". " + nazivMjeseca(mjesec) + " " + godina + ".");
         System.out.println("Datum je valjan.");
     } else {
         System.out.println("Uneseni datum nije valjan.");
     }

     ulaz.close();
 }
	public static boolean jeDatumValjan(int dan, int mjesec, int godina) {
        if (mjesec < 1 || mjesec > 12) {
            return false;
        }
        int[] daniUMjesecu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mjesec == 2 && jePrijestupnaGodina(godina)) {
            daniUMjesecu[1] = 29; 
        }
        return dan >= 1 && dan <= daniUMjesecu[mjesec - 1];
	}
	
	public static boolean jePrijestupnaGodina(int godina) {
        return (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
    }
	
	 public static String nazivMjeseca(int mjesec) {
	        String[] mjeseci = {
	            "siječanj", "veljača", "ožujak", "travanj", "svibanj", "lipanj",
	            "srpanj", "kolovoz", "rujan", "listopad", "studeni", "prosinac"
	        };

	        return mjeseci[mjesec - 1];
	    }
	}
