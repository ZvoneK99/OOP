package Zadatak1;

public abstract class Vozilo implements IVozilo {
    private int brzina;
    private int brojKotaca;

    public Vozilo(int brojKotaca) {
        this.setBrzina(brzina);
        this.setBrojKotaca(brojKotaca);
    }
    
    public int getBrzina() {
		return brzina;
	}
	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}
	public int getBrojKotaca() {
		return brojKotaca;
	}
	public void setBrojKotaca(int brojKotaca) {
		this.brojKotaca = brojKotaca;
	}

    @Override
    public void pokreni() {
        this.setBrzina(50);
        System.out.println("Vozilo je pokrenuto");
    }

    @Override
    public void zaustavi() {
        this.setBrzina(0);
        System.out.println("Vozilo je zaustavljeno.");
    }

    @Override
    public void ispisi() {
        System.out.println("Brzina: " + this.getBrzina() +" Broj kotača: " + this.getBrojKotaca());
    }

}
