package ZSR4_2;

public abstract class DokumentKnjiznice implements Dokument {
    private int ID;
    private String nazivDokumenta;

    public DokumentKnjiznice(int ID, String nazivDokumenta) {
        this.ID = ID;
        this.nazivDokumenta = nazivDokumenta;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNazivDokumenta() {
        return nazivDokumenta;
    }
    public void setNazivDokumenta(String nazivDokumenta) {
        this.nazivDokumenta = nazivDokumenta;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Naziv dokumenta: " + nazivDokumenta;
    }
}

