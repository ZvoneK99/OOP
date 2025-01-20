package Zadatak6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Kreiranje liste računa
        ArrayList<Racun> racuni = new ArrayList<>();

        // Dodavanje računa u listu
        racuni.add(new TekuciRacun("Zvone", 1500, 200));
        racuni.add(new TekuciRacun("Gabi", 2000, 300));
        racuni.add(new StedniRacun("Ante", 3000, 3.5));
        racuni.add(new StedniRacun("Pero", 3991, 4.0));
        racuni.add(new DevizniRacun("Ilija", 900, "Euro"));
        racuni.add(new DevizniRacun("Marija", 1500, "Dolar"));

        // Ispis početnih stanja računa
        System.out.println("Početna stanja računa:");
        for (Racun r : racuni) {
            System.out.println(r);
        }

        // Izvršavanje uplata i podizanja novca
        System.out.println("\nIzvršavanje uplata i podizanja novca:");
        racuni.get(0).UplatiNovac(500); // Zvone uplaćuje 500
        racuni.get(1).podigniNovac(1000); // Gabi podiže 1000
        racuni.get(2).UplatiNovac(100); // Ante uplaćuje 100
        racuni.get(3).podigniNovac(4000); // Pero pokušava podići 4000 (možda neće uspjeti)
        racuni.get(4).UplatiNovac(100); // Ilija uplaćuje 100
        racuni.get(5).podigniNovac(200); // Marija podiže 200

        // Ispis stanja nakon transakcija
        System.out.println("\nStanja računa nakon transakcija:");
        for (Racun r : racuni) {
            System.out.println(r);
        }

        // Primjena kamate na štedne račune
        System.out.println("\nPrimjena kamate na štedne račune:");
        for (Racun r : racuni) {
            if (r instanceof StedniRacun) {
                ((StedniRacun) r).primjeniKamatu();
            }
        }

        // Ispis stanja nakon primjene kamate
        System.out.println("\nStanja računa nakon primjene kamate:");
        for (Racun r : racuni) {
            System.out.println(r);
        }
    }
}
