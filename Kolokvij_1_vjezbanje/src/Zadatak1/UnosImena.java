package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class UnosImena {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ArrayList<String> imena = new ArrayList<>();
        ArrayList<String> imenaSaA = new ArrayList<>();
        
        // Unos imena
        while (true) {
            System.out.println("Unesite ime (za kraj unesite 'kraj'):");
            String ime = ulaz.nextLine();
            if (ime.equalsIgnoreCase("kraj")) {
                break;
            }
            imena.add(ime);
        }
        
        // Inicijalizacija za analizu
        String najkraceIme = imena.get(0);
        String najduzeIme = imena.get(0);
        int brojacZnakova = 0;
        String obrnutoIme = "";
        
        for (String rijec : imena) {
            // Pronađi najkraće i najduže ime
            if (rijec.length() < najkraceIme.length()) {
                najkraceIme = rijec;
            }
            if (rijec.length() > najduzeIme.length()) {
                najduzeIme = rijec;
            }

            // Brojanje znakova
            brojacZnakova += rijec.length();

            // Imena s početnim slovom 'A'
            if (rijec.toLowerCase().charAt(0) == 'a') {
                imenaSaA.add(rijec);
            }
        }
        
        // Obrnuti redoslijed imena
        for (int j = imena.size() - 1; j >= 0; j--) {
            obrnutoIme += imena.get(j) + " ";
        }

        // Ispis rezultata
        System.out.println("Najduže ime: " + najduzeIme);
        System.out.println("Najkraće ime: " + najkraceIme);
        System.out.println("Imena s početnim slovom 'A': " + imenaSaA);
        System.out.println("Ukupan broj znakova: " + brojacZnakova);
        System.out.println("Imena obrnutim redoslijedom: " + obrnutoIme.trim());
    }
}
