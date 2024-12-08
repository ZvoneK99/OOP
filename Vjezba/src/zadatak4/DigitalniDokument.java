package zadatak4;

public class DigitalniDokument extends DokumentKnjiznice {
    private String tip;

    public DigitalniDokument(int ID, String nazivDokumenta, String tip) {
        super(ID, nazivDokumenta);
        this.tip = tip;
    }

    @Override
    public int dajPeriodPosudbe() {
        return 30;
    }

    @Override
    public boolean jeLiPotrebanPolog() {
        return true;
    }

    @Override
    public double dajIznosPologa() {
        return 50.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip: " + tip + ", Period posudbe: " + dajPeriodPosudbe();
    }
}