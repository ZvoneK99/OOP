package Zadatak11;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Proizvod> proizvodi = new ArrayList<>();

        // Generiranje 10 proizvoda
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean()) {
                double tezina = random.nextDouble() * 10 + 1; // Težina od 1 do 10 kg
                double cijenaPoKilogramu = random.nextDouble() * 50 + 10; // Cijena od 10 do 60 po kg
                proizvodi.add(new Hrana(i, "Hrana_" + i, tezina, cijenaPoKilogramu));
            } else {
                double osnovnaCijena = random.nextDouble() * 1000 + 500; // Osnovna cijena od 500 do 1500
                int garancijaGodine = random.nextInt(5) + 1; // Garancija od 1 do 5 godina
                proizvodi.add(new Elektronika(i, "Elektronika_" + i, osnovnaCijena, garancijaGodine));
            }
        }

        // Ispis proizvoda skupljih od 500
        System.out.println("Proizvodi skuplji od 500:");
        for (Proizvod p : proizvodi) {
            if (p.izracunajCijenu() > 500) {
                System.out.println(p);
            }
        }

        // Računanje prosječne cijene proizvoda tipa Hrana
        double ukupnaCijenaHrane = 0;
        int brojHrane = 0;
        for (Proizvod p : proizvodi) {
            if (p instanceof Hrana) {
                ukupnaCijenaHrane += p.izracunajCijenu();
                brojHrane++;
            }
        }
        if (brojHrane > 0) {
            System.out.println("Prosječna cijena hrane: " + ukupnaCijenaHrane / brojHrane);
        } else {
            System.out.println("Nema proizvoda tipa Hrana.");
        }

        // Računanje ukupne cijene proizvoda tipa Elektronika
        double ukupnaCijenaElektronike = 0;
        for (Proizvod p : proizvodi) {
            if (p instanceof Elektronika) {
                ukupnaCijenaElektronike += p.izracunajCijenu();
            }
        }
        System.out.println("Ukupna cijena elektronike: " + ukupnaCijenaElektronike);

        // Pronalaženje najskupljeg proizvoda
        Proizvod najskupljiProizvod = null;
        for (Proizvod p : proizvodi) {
            if (najskupljiProizvod == null || p.izracunajCijenu() > najskupljiProizvod.izracunajCijenu()) {
                najskupljiProizvod = p;
            }
        }
        if (najskupljiProizvod != null) {
            System.out.println("Najskuplji proizvod: ");
            System.out.println(najskupljiProizvod);
        }
    }
}
