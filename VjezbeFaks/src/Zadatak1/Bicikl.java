package Zadatak1;

public class Bicikl extends Vozilo {
    private String tipBicikla;

    public Bicikl(int brojKotaca, String tipBicikla) {
        super(brojKotaca);
        setTipBicikla(tipBicikla);
    }

    public String getTipBicikla() {
    	return tipBicikla;
    }
    public void setTipBicikla(String tipBicikla) {
    	this.tipBicikla = tipBicikla;
    }
    @Override
    public void ispisi() {
        System.out.println("Broj kotača: " + getBrojKotaca() + ", Tip bicikla: " + tipBicikla + ", Brzina: " + getBrzina());
    }
}

