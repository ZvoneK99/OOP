package ZAD1;

public class LokalnaVoznja extends Voznja {
    private String drzava;

    public LokalnaVoznja(String polaziste, String odrediste, double cijenaKarte, int brojSjedalaAutobusa, String drzava) {
        super(polaziste, odrediste, cijenaKarte, brojSjedalaAutobusa);
        this.drzava = drzava;
    }

    @Override
    public String ispisiPopisPutnika() {
        return "Popis putnika za lokalnu vožnju unutar države: " + drzava;
    }

    @Override
    public String dajOsnovneInformacije() {
        return "Lokalna vožnja unutar države: " + drzava;
    }
}
