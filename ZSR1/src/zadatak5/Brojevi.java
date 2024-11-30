package zadatak5;


import java.util.ArrayList;
import java.util.Scanner;

public class Brojevi {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ArrayList<Integer> cijeliDijelovi = new ArrayList<>();

        // Neprekidni unos brojeva
        while (true) {
            System.out.println("Unesite decimalni broj:");
            double broj = ulaz.nextDouble();

            int cijeliDio = (int) broj; // Dobijamo cijeli dio broja
            double decimalniDio = broj - cijeliDio; // Dobijamo decimalni dio broja

            cijeliDijelovi.add(cijeliDio); // Spremamo cijeli dio

            // Provjeravamo uvjet za prekid unosa
            if (cijeliDio >= decimalniDio * 100) {
                break;
            }
        }

        // Brojanje znamenki
        int[] brojacZnamenki = new int[10]; // Indeks 0 za znamenku '0', indeks 1 za '1', itd.

        // Prolaz kroz sve cijele dijelove
        for (int broj : cijeliDijelovi) {
            // Razdvajanje znamenki
            String brojKaoString = String.valueOf(broj);
            for (char znamenka : brojKaoString.toCharArray()) {
                int znamenkaBroj = Character.getNumericValue(znamenka);
                brojacZnamenki[znamenkaBroj]++; // Povećavamo broj pojavljivanja znamenke
            }
        }

        // Pronalazak najčešće znamenke
        int najcescaZnamenka = 0;
        int maxPonavljanja = 0;
        for (int i = 0; i < brojacZnamenki.length; i++) {
            if (brojacZnamenki[i] > maxPonavljanja) {
                maxPonavljanja = brojacZnamenki[i];
                najcescaZnamenka = i;
            }
        }

        // Ispis rezultata
        System.out.println("Najčešća znamenka: " + najcescaZnamenka);
        System.out.println("Ponavlja se: " + maxPonavljanja + " puta");

        ulaz.close();
    }
}
