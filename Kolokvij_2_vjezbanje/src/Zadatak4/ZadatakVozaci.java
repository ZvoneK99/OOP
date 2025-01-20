package Zadatak4;

import java.util.ArrayList;

public class ZadatakVozaci {
    public static void main(String[] args) {
        // Kreiranje vozila
        Automobil auto1 = new Automobil("Audi A4", "Sedan", 7.5);
        Automobil auto2 = new Automobil("BMW X5", "SUV", 10.0);
        Motocikl moto1 = new Motocikl("Yamaha R1", "Sport", 299);
        Motocikl moto2 = new Motocikl("Harley Davidson", "Cruiser", 180);
        Autobus bus1 = new Autobus("Mercedes Bus", 50, true);

        // Kreiranje vozača
        Vozac vozac1 = new Vozac("Marko", auto1);
        Vozac vozac2 = new Vozac("Ana", auto2);
        Vozac vozac3 = new Vozac("Ivan", moto1);
        Vozac vozac4 = new Vozac("Luka", moto2);
        Vozac vozac5 = new Vozac("Marta", bus1);

        // Dodavanje vozača u listu
        ArrayList<Vozac> vozaci = new ArrayList<>();
        vozaci.add(vozac1);
        vozaci.add(vozac2);
        vozaci.add(vozac3);
        vozaci.add(vozac4);
        vozaci.add(vozac5);

        // Pokretanje svih vozila i ispis stanja
        System.out.println("Pokrećemo sva vozila...\n");
        for (Vozac vozac : vozaci) {
            vozac.getVozilo().pokreniVozilo();
            vozac.ispisiPodatke();
        }

        // Zaustavljanje svih vozila i ispis stanja
        System.out.println("\nZaustavljamo sva vozila...\n");
        for (Vozac vozac : vozaci) {
            vozac.getVozilo().zaustaviVozilo();
            vozac.ispisiPodatke();
        }
    }
}
