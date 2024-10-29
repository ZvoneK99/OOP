/*napisati program koji ce zatraziti unos 2 broja nakon toga ispisati izbornik koji ce simulirati kalkulator
korisnik odabire zeljenu operaciju po odabranoj operaciji ispisuje se rezultat broj operacij broj rezultat*/

package primjer_01;

import java.util.Scanner;

public class primjer_01 {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int broj1 = ulaz.nextInt();

        System.out.print("Unesite drugi broj: ");
        int broj2 = ulaz.nextInt();

        System.out.println("\nOdaberite operaciju:");
        System.out.println("1. Zbrajanje");
        System.out.println("2. Oduzimanje");
        System.out.println("3. Množenje");
        System.out.println("4. Dijeljenje");

        System.out.print("Unesite broj operacije: ");
        int izbor = ulaz.nextInt();

        int rezultat = 0;
        String operacija = "";

        if (izbor == 1) {
            rezultat = broj1 + broj2;
            operacija = "+";
        } else if (izbor == 2) {
            rezultat = broj1 - broj2;
            operacija = "-";
        } else if (izbor == 3) {
            rezultat = broj1 * broj2;
            operacija = "*";
        } else if (izbor == 4) {
            if (broj2 != 0) {
                rezultat = broj1 / broj2;
                operacija = "/";
            } else {
                System.out.println("Dijeljenje s nulom nije dozvoljeno.");
                ulaz.close();
                return;
            }
        } else {
            System.out.println("Nepoznata operacija.");
            ulaz.close();
            return;
        }
        System.out.println("Rezultat: " + broj1 + " " + operacija + " " + broj2 + " = " + rezultat);
        ulaz.close();
    }
}
