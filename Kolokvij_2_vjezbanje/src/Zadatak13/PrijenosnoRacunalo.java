package Zadatak13;

public class PrijenosnoRacunalo implements Punjenje, WiFi {
    private int baterija;
    private String povezanMreza;

    public PrijenosnoRacunalo() {
        this.baterija = 80; // Inicijalno 80%
        this.povezanMreza = null; // Nije povezan na mrežu
    }

    @Override
    public void napuniBateriju(int postotak) {
        baterija = Math.min(baterija + postotak, 100); // Maksimalno do 100%
        System.out.println("Baterija napunjena na: " + baterija + "%");
    }

    @Override
    public int provjeriBateriju() {
        return baterija;
    }

    // Implementacija metoda iz WiFi
    @Override
    public void poveziNaWiFi(String mreza) {
        povezanMreza = mreza;
        System.out.println("Povezan na Wi-Fi mrežu: " + mreza);
    }

    @Override
    public boolean provjeriPovezanost() {
        return povezanMreza != null;
    }
}
