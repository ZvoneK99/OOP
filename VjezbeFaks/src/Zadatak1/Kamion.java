package Zadatak1;

public class Kamion extends Vozilo {
    private double nosivost;

    public Kamion(int brojKotaca, double nosivost) {
        super(brojKotaca);
        setNosivost(nosivost);
    }

    public double getNosivost() {
    	return nosivost;
    }
    public void setNosivost(double nosivost) {
    	this.nosivost = nosivost;
    }
    @Override
    public void ispisi() {
        System.out.println("Broj kotača: " + getBrojKotaca() + ", Nosivost: " + nosivost + " Brzina: " + getBrzina());
    }
}
