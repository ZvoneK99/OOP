package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class NajveciZbrojZnamenki {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int broj;
        ArrayList<Integer> brojevi = new ArrayList<>();

        // Unos brojeva
        while (true) {
            System.out.println("Unesite broj.");
            broj = ulaz.nextInt();
            if (broj == 0) { // Prekida unos kad korisnik unese 0
                break;
            }
            brojevi.add(broj); // Dodaj broj u listu
        }

        int maxZbrojZnamenki = 0; // Za praćenje najvećeg zbroja znamenki
        int brojSaNajvecimZbrojem = 0; // Broj koji ima najveći zbroj znamenki

        // Petlja za pronalaženje broja s najvećim zbrojem znamenki
        for (int trenutniBroj : brojevi) {
            int zbrojZnamenki = 0;
            int tempBroj = Math.abs(trenutniBroj); // Podrška za negativne brojeve

            // Izračun zbroja znamenki trenutnog broja
            while (tempBroj > 0) {
                int znamenka = tempBroj % 10;
                tempBroj /= 10;
                zbrojZnamenki += znamenka;
                
            }

            // Ažuriraj najveći zbroj znamenki i broj s najvećim zbrojem
            if (zbrojZnamenki > maxZbrojZnamenki) {
                maxZbrojZnamenki = zbrojZnamenki;
                brojSaNajvecimZbrojem = trenutniBroj;
            }
        }

        // Ispis rezultata
        System.out.println("Uneseni brojevi: " + brojevi);
        System.out.println("Broj s najvećim zbrojem znamenki je: " + brojSaNajvecimZbrojem);
        System.out.println("Najveći zbroj znamenki je: " + maxZbrojZnamenki);
    }
}
