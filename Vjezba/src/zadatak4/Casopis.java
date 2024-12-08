package zadatak4;

public class Casopis extends DokumentKnjiznice {
    private String kategorijaSadrzaja;
    private int izdanje;

    public Casopis(int ID, String nazivDokumenta, String kategorijaSadrzaja, int izdanje) {
        super(ID, nazivDokumenta);
        this.kategorijaSadrzaja = kategorijaSadrzaja;
        this.izdanje = izdanje;
    }

    @Override
    public int dajPeriodPosudbe() {
        return 7;
    }

    @Override
    public boolean jeLiPotrebanPolog() {
        return false;
    }

    @Override
    public double dajIznosPologa() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kategorija: " + kategorijaSadrzaja + ", Period posudbe: " + dajPeriodPosudbe();
    }
}
