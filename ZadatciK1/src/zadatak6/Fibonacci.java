package zadatak6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        // Tražimo od korisnika unos broja elemenata
        System.out.println("Koliko brojeva Fibonacci niza želite?");
        int n = ulaz.nextInt();

        // Prva dva broja u nizu
        int prvi = 0;
        int drugi = 1;

        System.out.println("Fibonacci niz (" + n + " brojeva):");

        // Ispis prvog broja
        System.out.print(prvi);

        // Petlja za generiranje ostatka niza
        for (int i = 1; i < n; i++) {
            System.out.print(", " + drugi);

            // Sljedeći broj je zbroj prethodna dva
            int sljedeci = prvi + drugi;
            prvi = drugi;  // Ažuriraj prvi broj
            drugi = sljedeci;  // Ažuriraj drugi broj
        }
        ulaz.close();
    }
}
