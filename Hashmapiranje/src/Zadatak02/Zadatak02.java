package Zadatak02;

import java.util.HashMap;
import java.util.Scanner;

public class Zadatak02 {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite niz riječi razdvojenih razmakom:");
        String input = ulaz.nextLine();

        // Razdvajanje riječi
        String[] rijeci = input.split(" ");

        // HashMap za brojanje pojava riječi
        HashMap<String, Integer> brojPojava = new HashMap<>();

        // Popunjavanje mape
        for (String rijec : rijeci) {
            if (brojPojava.containsKey(rijec)) {
                brojPojava.put(rijec, brojPojava.get(rijec) + 1); // Povećaj vrijednost
            } else {
                brojPojava.put(rijec, 1); // Dodaj novu riječ
            }
        }

        // Ispis rezultata
        System.out.println("Pojave riječi:");
        for (String rijec : brojPojava.keySet()) {
            System.out.println(rijec + ": " + brojPojava.get(rijec));
        }
    }
}
