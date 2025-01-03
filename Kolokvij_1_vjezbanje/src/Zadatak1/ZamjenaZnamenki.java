package Zadatak1;

import java.util.Scanner;

public class ZamjenaZnamenki {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = ulaz.nextInt();

        // Čuvaj originalni broj za manipulaciju
        int originalniBroj = broj;

        // Odredi prvu i zadnju znamenku
        int zadnjaZnamenka = broj % 10; // Zadnja znamenka
        int prvaZnamenka = broj;

        while (prvaZnamenka >= 10) {
            prvaZnamenka /= 10; // Prva znamenka
        }

        // Makni zadnju znamenku
        broj /= 10;

        // Makni prvu znamenku
        int potencija = (int) Math.pow(10, Integer.toString(broj).length());
        int sredina = originalniBroj % potencija / 10;

        // Rekonstruiraj broj s novim redoslijedom
        int noviBroj = zadnjaZnamenka * potencija + sredina * 10 + prvaZnamenka;

        // Ispis rezultata
        System.out.println("Novi broj s zamijenjenim znamenkama: " + noviBroj);

        ulaz.close();
    }
}
