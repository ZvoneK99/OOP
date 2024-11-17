package zad1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Double> mapa = new HashMap<>();

        mapa.put("Jabuka", 1.5);
        mapa.put("Kruh", 1.2);
        mapa.put("Mlijeko", 1.8);

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite naziv proizvoda:");
        String proizvod = ulaz.nextLine();

        if (mapa.containsKey(proizvod)) {
            System.out.println("Cijena proizvoda \"" + proizvod + "\" je: " + mapa.get(proizvod));
        } else {
            System.out.println("Proizvod nije pronađen.");
        }
    }
}
