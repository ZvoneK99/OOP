package zadatak9;

import java.util.Scanner;

public class Brojanje {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite neku rečenicu:");
        String unesenaRecenica = ulaz.nextLine().trim();

        // Provjera je li rečenica prazna
        if (unesenaRecenica.isEmpty()) {
            System.out.println("Morate unijeti rečenicu!");
            return;
        }

        String recenica = unesenaRecenica.toLowerCase();
        int brojRijeci = 0;
        int brojSamoglasnika = 0;
        int brojSuglasnika = 0;
        int brojZnakovaInterpunkcije = 0;
        int brojRazmaka = 0;

        String[] rijeci = recenica.split("\\s+"); // Razdvajanje riječi (ignorira višestruke razmake)
        brojRijeci = rijeci.length;

        String samoglasnici = "aeiou";
        String interpunkcija = ".,!?;:-";

        for (int i = 0; i < recenica.length(); i++) {
            char znak = recenica.charAt(i);

            if (Character.isLetter(znak)) {
                if (samoglasnici.indexOf(znak) != -1) {
                    brojSamoglasnika++;
                } else {
                    brojSuglasnika++;
                }
            } else if (interpunkcija.indexOf(znak) != -1) {
                brojZnakovaInterpunkcije++;
            } else if (znak == ' ') {
                brojRazmaka++;
            }
        }

        System.out.println("Broj riječi: " + brojRijeci);
        System.out.println("Broj samoglasnika: " + brojSamoglasnika);
        System.out.println("Broj suglasnika: " + brojSuglasnika);
        System.out.println("Broj znakova interpunkcije: " + brojZnakovaInterpunkcije);
        System.out.println("Broj razmaka: " + brojRazmaka);
    }
}
