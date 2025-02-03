package Zadatak1;

public class Automobil extends Vozilo {
    private String tipMotora;

    public Automobil(int brojKotaca, String tipMotora) {
        super(brojKotaca);
        setTipMotora(tipMotora);
    }

    public String getTipMotora() {
    	return tipMotora;
    }
    public void setTipMotora(String tipMotora) {
    	this.tipMotora = tipMotora;
    }
    @Override
    public void ispisi() {
        System.out.println("Broj kotača: " + getBrojKotaca() + ", Motora: " + tipMotora + ", Brzina: " + getBrzina());
    }
}
