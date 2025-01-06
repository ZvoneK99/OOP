package Zadatak2;

import java.util.Scanner;

public class BrojeviPalindromi {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite brojeve odvojene razmakom:");
        String unos = ulaz.nextLine();
        
        String[] brojevi = unos.split(" ");
        boolean imaPalindrom = false;

        for (String broj : brojevi) {
            String obrnutBroj = new StringBuilder(broj).reverse().toString();
            if (broj.equals(obrnutBroj)) {
                System.out.println("Broj " + broj + " je palindrom.");
                imaPalindrom = true;
            }
        }
        
        if (!imaPalindrom) {
            System.out.println("Nema palindromskih brojeva.");
        }
    }
}
