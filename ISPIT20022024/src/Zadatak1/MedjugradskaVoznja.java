package Zadatak1;

import java.util.ArrayList;

public class MedjugradskaVoznja extends Voznja {
    private ArrayList<String> drzaveKojimaProlazi;

    public MedjugradskaVoznja(String polaziste, String odrediste, double cijenaKarte, String modelAutobusa) {
    	super(polaziste, odrediste, cijenaKarte, modelAutobusa);
    	drzaveKojimaProlazi = new ArrayList<>();
        popuniPopisDrzava();
    }

    public void popuniPopisDrzava() {
        drzaveKojimaProlazi.add("Hrvatska"); // Međugradska vožnja, prolazi kroz jednu državu
    }

    @Override
    void ispisiPopisPutnika() {
        for (Putnik putnik : getPutnici()) {
            System.out.println(putnik);
        }
    }

    @Override
    String dajOsnovneInformacije() {
        return "Međugradska vožnja: " + getPolaziste() + " -> " + getOdrediste() +
               ", Cijena karte: " + getCijenaKarte() + ", Model autobusa: " + getModelAutobusa();
    }
}
