package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class MedjunarodnaVoznja extends Voznja {
    private ArrayList<String> drzaveKojimaProlazi;

    public MedjunarodnaVoznja(String polaziste, String odrediste, double cijenaKarte, String modelAutobusa) {
    	super(polaziste, odrediste, cijenaKarte, modelAutobusa);
    	drzaveKojimaProlazi = new ArrayList<>();
        popuniPopisDrzava();
    }

    public void popuniPopisDrzava() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite države kroz koje vožnja prolazi (unesite 'kraj' za završetak):");

        while (true) {
            String drzava = scanner.nextLine();
            if (drzava.equalsIgnoreCase("kraj")) {
                break;
            }
            drzaveKojimaProlazi.add(drzava);
        }
    }

    @Override
    void ispisiPopisPutnika() {
        for (Putnik putnik : getPutnici()) {
            System.out.println(putnik);
        }
    }

    @Override
    String dajOsnovneInformacije() {
        return "Međunarodna vožnja: " + getPolaziste() + " -> " + getOdrediste() +
               ", Cijena karte: " + getCijenaKarte() + ", Model autobusa: " + getModelAutobusa();
    }
}
