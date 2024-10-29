/*korisnik unosi datum u formatu dan/mjesec/godina
 	ispisuje se je li datum valjan na nacin da ispisemo uneseni datum;
 	 mjesec ispisemo rijecima, valjan je tako sto provjerimo za svaki mjesec je li
 	dobro unesen broj dana*/

package primjer_05;
	
	import java.util.Scanner;
public class Datum {
	
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite datum: dan/mjesec/godina");
		String datum = ulaz.nextLine();
		
		//Razdvajanje djelova datuma
		String[] djelovi = datum.split("\\.");
		if(djelovi.length!=3) {
			System.out.println("Pogrešan unos datuma.");
			ulaz.close();
			return;
		}
		
		//Parsiranje djelova datuma
		int dan = Integer.parseInt(djelovi[0]);
		int mjesec = Integer.parseInt(djelovi[1]);
		int godina = Integer.parseInt(djelovi[2]);
		
		//Provjera je li datum valjan
		if(jeDatumValjan(dan, mjesec, godina)) {
			System.out.println("Uneseni datum "+ dan+"."+nazivMjeseca(mjesec)+"."+godina+".");
			System.out.println("Datum je valjan.");
		}
		else {
			System.out.println("Uneseni datum nije valjan.");
		}
		ulaz.close();
	}
	
	//Metoda za provjeru valjanosti datuma
	public static boolean jeDatumValjan(int dan, int mjesec, int godina) {
		if(mjesec<1 || mjesec>12) {
			return false;
		}
		int[] daniUMjesecu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(mjesec == 2 && jePrijestupnaGodina(godina)) {
				daniUMjesecu[1] = 29;
			}
			return dan >=1 && dan <= daniUMjesecu[mjesec - 1];
	}
	
	//Metoda za provjeru prijestupne godine
	public static boolean jePrijestupnaGodina(int godina) {
		return(godina%4==0 && godina%100!=0) || (godina%400==0);
	}
	
	//Metoda za dobivanje naziva mjeseca
	public static String nazivMjeseca(int mjesec) {
		String[] mjeseci = {"siječanj", "veljača", "ožujak", "travanj", "svibanj", "lipanj",
	            "srpanj", "kolovoz", "rujan", "listopad", "studeni", "prosinac"};
		        return mjeseci[mjesec-1];
	}
}
