package ZAD1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Recenice {
    public static void main(String[] args) {
        ArrayList<String> receniceSaTriRijeci = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unosite rečenice (unesite rečenicu s riječju 'kraj' za prekid):");

        // Neprekidni unos rečenica
        while (true) {
            String unos = ulaz.nextLine();

            // Prekida unos ako rečenica sadrži riječ 'kraj'
            if (unos.toLowerCase().contains("kraj")) {
                break;
            }

            // Provjera da li rečenica ima točno 3 riječi
            String[] rijeci = unos.split(" ");
            if (rijeci.length == 3) {
                receniceSaTriRijeci.add(unos);
            }
        }

        // Sortiranje rečenica s 3 riječi prema abecedi
        receniceSaTriRijeci.sort(new Comparator<String>() {
            @Override
            public int compare(String r1, String r2) {
                String srednjaRijec1 = dohvatiSrednjuRijec(r1);
                String srednjaRijec2 = dohvatiSrednjuRijec(r2);
                return srednjaRijec1.compareToIgnoreCase(srednjaRijec2);
            }
        });

        // Ispis sortiranja
        System.out.println("Sortirane rečenice sa 3 riječi prema abecednom redoslijedu srednje riječi:");
        for (String recenica : receniceSaTriRijeci) {
            System.out.println(recenica);
        }

        ulaz.close();
    }

    // Metoda za dohvaćanje srednje riječi iz rečenice
    public static String dohvatiSrednjuRijec(String recenica) {
        String[] rijeci = recenica.split(" ");
        return rijeci[1]; // Srednja riječ u rečenici s 3 riječi je uvijek druga riječ
    }
}
