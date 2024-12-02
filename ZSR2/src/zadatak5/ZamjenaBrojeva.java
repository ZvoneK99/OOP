package zadatak5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZamjenaBrojeva {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        // Lista brojeva
        List<Integer> brojevi = new ArrayList<>();
        List<Integer> neparniBrojevi = new ArrayList<>();

        // Unos brojeva
        System.out.println("Unesite 20 brojeva:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Broj " + (i + 1) + ": ");
            int broj = ulaz.nextInt();
            brojevi.add(broj);
            if (broj % 2 != 0) { // Ako je broj neparan, dodaj ga u neparne
                neparniBrojevi.add(broj);
            }
        }

        int maxNeparni = Integer.MIN_VALUE;
        for (int broj : neparniBrojevi) {
            if (broj > maxNeparni) {
                maxNeparni = broj;
            }
        }

        // Stvaranje novog niza s modifikacijama
        List<Integer> noviBrojevi = new ArrayList<>(brojevi);
        for (int i = 0; i < noviBrojevi.size(); i++) {
            if (i % 2 == 0 && noviBrojevi.get(i) % 2 != 0) { // Neparan broj na parnom indeksu
                noviBrojevi.set(i, maxNeparni);
            }
        }

        // Ispis rezultata
        System.out.println("\nOriginalni niz brojeva:");
        for (int broj : brojevi) {
            System.out.print(broj + " ");
        }

        System.out.println("\n\nNajveći neparni broj: " + maxNeparni);

        System.out.println("\nNovi niz brojeva:");
        for (int broj : noviBrojevi) {
            System.out.print(broj + " ");
        }

        ulaz.close();
    }
}
