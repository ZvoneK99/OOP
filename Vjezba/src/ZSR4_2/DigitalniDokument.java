package ZSR4_2;

public class DigitalniDokument extends DokumentKnjiznice {
    private String tip;

    public DigitalniDokument(int ID, String nazivDokumenta, String tip) {
        super(ID, nazivDokumenta);
        this.tip = tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
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
    public int dajIznosPologa() {
        return 15;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip: " + tip;
    }
}
