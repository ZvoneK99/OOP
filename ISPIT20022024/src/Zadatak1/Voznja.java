package Zadatak1;

import java.util.ArrayList;

public abstract class Voznja {
    private String polaziste;
    private String odrediste;
    private double cijenaKarte;
    private double ukupanPrihod;
    private String modelAutobusa;
    private int brojSjedalaAutobusa;
    private ArrayList<Putnik> putnici = new ArrayList<>();
    private ArrayList<Integer> rezerviranaSjedala = new ArrayList<>(); // Dodano za praćenje rezerviranih sjedala

    public Voznja(String polaziste, String odrediste, double cijenaKarte, String modelAutobusa) {
    	this.polaziste = polaziste;
    	this.odrediste = odrediste;
    	this.cijenaKarte = cijenaKarte;
    	this.modelAutobusa = modelAutobusa;
    }
    abstract void ispisiPopisPutnika();
    abstract String dajOsnovneInformacije();

    // Metoda za rezervaciju sjedala
    public boolean rezervirajSjedalo(Putnik putnik, Integer brojSjedala) {
        if (brojSjedala != null) { // Ako je specificirano određeno sjedalo
            if (rezerviranaSjedala.contains(brojSjedala)) {
                System.out.println("Sjedalo " + brojSjedala + " je već rezervirano.");
                return false; // Rezervacija nije uspjela
            } else if (brojSjedala > brojSjedalaAutobusa || brojSjedala < 1) {
                System.out.println("Neispravan broj sjedala.");
                return false;
            } else {
                rezerviranaSjedala.add(brojSjedala);
                putnici.add(putnik);
                ukupanPrihod += cijenaKarte * 1.3; // 30% skuplje
                System.out.println("Sjedalo " + brojSjedala + " uspješno rezervirano.");
                return true; // Rezervacija uspjela
            }
        } else { // Ako nije specificirano sjedalo
            for (int i = 1; i <= brojSjedalaAutobusa; i++) {
                if (!rezerviranaSjedala.contains(i)) {
                    rezerviranaSjedala.add(i);
                    putnici.add(putnik);
                    ukupanPrihod += cijenaKarte;
                    System.out.println("Dodijeljeno prvo slobodno sjedalo: " + i);
                    return true; // Rezervacija uspjela
                }
            }
            System.out.println("Nema slobodnih sjedala.");
            return false; // Nema slobodnih sjedala
        }
    }

    public String getPolaziste() {
        return polaziste;
    }

    public void setPolaziste(String polaziste) {
        this.polaziste = polaziste;
    }

    public String getOdrediste() {
        return odrediste;
    }

    public void setOdrediste(String odrediste) {
        this.odrediste = odrediste;
    }

    public double getCijenaKarte() {
        return cijenaKarte;
    }

    public void setCijenaKarte(double cijenaKarte) {
        this.cijenaKarte = cijenaKarte;
    }

    public double getUkupanPrihod() {
        return ukupanPrihod;
    }

    public void setUkupanPrihod(double ukupanPrihod) {
        this.ukupanPrihod = ukupanPrihod;
    }

    public String getModelAutobusa() {
        return modelAutobusa;
    }

    public void setModelAutobusa(String modelAutobusa) {
        this.modelAutobusa = modelAutobusa;
    }

    public int getBrojSjedalaAutobusa() {
        return brojSjedalaAutobusa;
    }

    public void setBrojSjedalaAutobusa(int brojSjedalaAutobusa) {
        this.brojSjedalaAutobusa = brojSjedalaAutobusa;
    }

    public ArrayList<Putnik> getPutnici() {
        return putnici;
    }

    public void setPutnici(ArrayList<Putnik> putnici) {
        this.putnici = putnici;
    }

    public ArrayList<Integer> getRezerviranaSjedala() {
        return rezerviranaSjedala;
    }
}
