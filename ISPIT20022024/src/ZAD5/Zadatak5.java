package ZAD5;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<String> rijeci = new ArrayList<>();
        ArrayList<String> palindromi = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        int ukupnaDuzina = 0;

        System.out.println("Unosite stringove (unos se prekida kada ukupna duljina pređe 1001 znak):");

        // Neprekidni unos stringova
        while (ukupnaDuzina <= 10) {
            String unos = ulaz.nextLine(); // Učitaj unos
            ukupnaDuzina += unos.length(); // Dodaj duljinu unesenog stringa

            // Razdvajanje unosa na riječi
            String[] rijec = unos.split(" ");
            for (String r : rijec) {
                rijeci.add(r); // Dodaj riječ u listu
                if (jeLiPalindrom(r)) {
                    palindromi.add(r); // Dodaj u listu palindroma ako je riječ palindrom
                }
            }

            // Prekid unosa ako ukupna duljina prelazi 1001 znak
            if (ukupnaDuzina > 10) {
                System.out.println("Ukupna duljina unesenih stringova prelazi 1001 znak.");
                System.out.println("Palindromi su:");
                for (String palindrom : palindromi) {
                    System.out.println(palindrom);
                }
                return; // Prekini program
            }
        }
    }

    public static boolean jeLiPalindrom(String rijec) {
        String obrnutiString = "";

        for (int i = rijec.length() - 1; i >= 0; i--) {
            obrnutiString += rijec.charAt(i);
        }
        return rijec.equals(obrnutiString);
    }
}
