package primjer01;

public class KlimaUredaj implements Uredaj, Podesivi {
    private boolean ukljucen;
    private int temperatura; // Temperatura u °C
    private String modRada;  // Mod rada (npr. hlađenje, grijanje)

    // Konstruktor
    public KlimaUredaj() {
        this.ukljucen = false;
        this.temperatura = 22; // Početna temperatura
        this.modRada = "hlađenje"; // Početni mod rada
    }

    // Implementacija metoda iz sučelja Uredaj
    @Override
    public void ukljuci() {
        ukljucen = true;
        System.out.println("Klima uređaj je uključen. Mod rada: " + modRada + ", temperatura: " + temperatura + "°C.");
    }

    @Override
    public void iskljuci() {
        ukljucen = false;
        System.out.println("Klima uređaj je isključen.");
    }

    @Override
    public boolean jeUkljucen() {
        return ukljucen;
    }

    // Implementacija metoda iz sučelja Podesivi
    @Override
    public void povecajPostavku() {
        temperatura++;
        System.out.println("Temperatura je povećana na: " + temperatura + "°C.");
    }

    @Override
    public void smanjiPostavku() {
        temperatura--;
        System.out.println("Temperatura je smanjena na: " + temperatura + "°C.");
    }

    // Dodatna metoda za promjenu moda rada
    public void promijeniMod(String noviMod) {
        this.modRada = noviMod;
        System.out.println("Mod rada je promijenjen na: " + modRada + ".");
    }
}

