package zadatak13;

import java.util.Scanner;

public class TestPoligon {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj poligona:");
        int brojPoligona = ulaz.nextInt();

        for (int i = 1; i <= brojPoligona; i++) {
            System.out.println("Unos podataka za poligon " + i);
            System.out.print("Unesite broj stranica: ");
            int brojStranica = ulaz.nextInt();

            System.out.print("Unesite visinu poligona: ");
            double visina = ulaz.nextDouble();

            Poligon poligon = new Poligon(brojStranica, visina, ulaz);
            System.out.println(poligon);
            System.out.println("-------------");
        }

        ulaz.close();
    }
}

