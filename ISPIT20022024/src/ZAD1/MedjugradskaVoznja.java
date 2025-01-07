package ZAD1;

public class MedjugradskaVoznja extends Voznja {
    private String drzava;

    public MedjugradskaVoznja(String polaziste, String odrediste, double cijenaKarte, int brojSjedalaAutobusa, String drzava) {
        super(polaziste, odrediste, cijenaKarte, brojSjedalaAutobusa);
        this.drzava = drzava;
    }

    @Override
    public String ispisiPopisPutnika() {
        return "Popis putnika za međugradsku vožnju u državi: " + drzava;
    }

    @Override
    public String dajOsnovneInformacije() {
        return "Međugradska vožnja unutar države: " + drzava;
    }
}
