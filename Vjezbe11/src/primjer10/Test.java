package primjer10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Kreiraj vozila
        Vozilo obicnoVozilo = new Vozilo(150);
        Automobil automobil = new Automobil(200, 5);
        Kamion kamion1 = new Kamion(120, 15); // Nosivost > 10
        Kamion kamion2 = new Kamion(120, 8);  // Nosivost <= 10s

        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(obicnoVozilo);
        vozila.add(automobil);
        vozila.add(kamion1);
        vozila.add(kamion2);

        System.out.println("Podaci o svim vozilima:");
        for (Vozilo vozilo : vozila) {
            System.out.println(vozilo);
        }
        
        System.out.println("\nTestiranje ubrzanja:");
        obicnoVozilo.ubrzaj(50);
        automobil.ubrzaj(80);
        kamion1.ubrzaj(70); // Ne smije prijeći maksimalnu brzinu
        kamion2.ubrzaj(60);

        System.out.println(obicnoVozilo);
        System.out.println(automobil);
        System.out.println(kamion1);
        System.out.println(kamion2);
    }
}

