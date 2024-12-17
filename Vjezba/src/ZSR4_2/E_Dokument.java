package ZSR4_2;

public class E_Dokument extends DokumentKnjiznice {
    private String sadrzaj;

    public E_Dokument(int ID, String nazivDokumenta, String sadrzaj) {
        super(ID, nazivDokumenta);
        this.sadrzaj = sadrzaj;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    @Override
    public int dajPeriodPosudbe() {
        return 30;
    }

    @Override
    public boolean jeLiPotrebanPolog() {
        return false;
    }

    @Override
    public int dajIznosPologa() {
        return 12;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sadržaj: " + sadrzaj;
    }
}

