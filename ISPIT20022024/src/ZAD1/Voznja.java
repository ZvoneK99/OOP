package ZAD1;

import java.util.ArrayList;

public abstract class Voznja {
    private String polaziste;
    private String odrediste;
    private double cijenaKarte;
    private static double ukupniPrihod;
    private int brojSjedalaAutobusa;
    private ArrayList<Putnik> popisPutnika;

    public Voznja(String polaziste, String odrediste, double cijenaKarte, int brojSjedalaAutobusa) {
        this.polaziste = polaziste;
        this.odrediste = odrediste;
        this.cijenaKarte = cijenaKarte;
        this.brojSjedalaAutobusa = brojSjedalaAutobusa;
        this.popisPutnika = new ArrayList<>();
    }

    public static double getUkupniPrihod() {
        return ukupniPrihod;
    }

    public static void dodajPrihod(double iznos) {
        ukupniPrihod += iznos;
    }

    public abstract String ispisiPopisPutnika();
    public abstract String dajOsnovneInformacije();

    public boolean prodajaKarata(Putnik putnik) {
        if (popisPutnika.size() < brojSjedalaAutobusa) {
            popisPutnika.add(putnik);
            dodajPrihod(cijenaKarte);
            return true;
        }
        return false;
    }

    public ArrayList<Putnik> getPopisPutnika() {
        return popisPutnika;
    }
}
