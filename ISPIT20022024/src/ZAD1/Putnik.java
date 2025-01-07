package ZAD1;

public class Putnik {
    private String imePrezime;
    private int brojOstvarenihVoznji;
    private String status; // "obicna", "zlatni", "platinasti"

    public Putnik(String imePrezime, int brojOstvarenihVoznji, String status) {
        this.imePrezime = imePrezime;
        this.brojOstvarenihVoznji = brojOstvarenihVoznji;
        this.status = status;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getBrojOstvarenihVoznji() {
        return brojOstvarenihVoznji;
    }

    public String getStatus() {
        return status;
    }

    public void povecajBrojVoznji() {
        brojOstvarenihVoznji++;
        if (brojOstvarenihVoznji >= 10 && brojOstvarenihVoznji < 20) {
            status = "zlatni";
        } else if (brojOstvarenihVoznji >= 20) {
            status = "platinasti";
        }
    }

    @Override
    public String toString() {
        return imePrezime + " (" + status + ", " + brojOstvarenihVoznji + " voznji)";
    }
}
