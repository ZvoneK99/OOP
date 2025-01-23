package Zadatak13;

public class Main {
    public static void main(String[] args) {
        // Kreiranje uređaja
        PametniTelefon telefon = new PametniTelefon();
        PrijenosnoRacunalo laptop = new PrijenosnoRacunalo();

        // Testiranje funkcionalnosti za pametni telefon
        System.out.println("Pametni telefon:");
        telefon.napuniBateriju(13);
        System.out.println("Trenutna baterija: " + telefon.provjeriBateriju() + "%");
        telefon.poveziNaWiFi("KucnaMreza");
        System.out.println("Povezan na Wi-Fi: " + telefon.provjeriPovezanost());

        // Testiranje funkcionalnosti za prijenosno računalo
        System.out.println("\nPrijenosno računalo:");
        laptop.napuniBateriju(10);
        System.out.println("Trenutna baterija: " + laptop.provjeriBateriju() + "%");
        laptop.poveziNaWiFi("PoslovnaMreza");
        System.out.println("Povezan na Wi-Fi: " + laptop.provjeriPovezanost());
    }
}

