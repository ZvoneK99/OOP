package ZAD1;

public class MedjunarodnaVoznja extends Voznja {
    private String kraj;

    public MedjunarodnaVoznja(String polaziste, String odrediste, double cijenaKarte, int brojSjedalaAutobusa, String kraj) {
        super(polaziste, odrediste, cijenaKarte, brojSjedalaAutobusa);
        this.kraj = kraj;
    }

    @Override
    public String ispisiPopisPutnika() {
        return "Popis putnika za međunarodnu vožnju prema državi: " + kraj;
    }

    @Override
    public String dajOsnovneInformacije() {
        return "Međunarodna vožnja prema državi: " + kraj;
    }
}
