package zadatak2;

public class Automobil extends Vozilo {
	private int brojVrata;
	private String tipMotora;
	
	public Automobil(String marka, String model, int godinaProizvodnje, int brojVrata, String tipMotora) {
		super(marka, model, godinaProizvodnje);
		this.brojVrata = brojVrata;
		this.tipMotora = tipMotora;
	}
	
	public int getBrojVrata() {
		return this.brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public String getTipMotora() {
		return this.tipMotora;
	}
	public void setTipMotora(String tipMotora) {
	    if (tipMotora.equalsIgnoreCase("benzin") || 
	        tipMotora.equalsIgnoreCase("dizel") || 
	        tipMotora.equalsIgnoreCase("elektricni")) {
	        this.tipMotora = tipMotora;
	    } else {
	        throw new IllegalArgumentException("Unijeli ste nepostojeći tip motora.");
	    }
	}

	
	@Override
	public int izracunajCijenu() {
		int baznaCijena = (2024-getGodinaProizvodnje())*1000;
		
		if(getTipMotora().equalsIgnoreCase("benzin")) {
			baznaCijena+=2000;
		}
		else if(getTipMotora().equalsIgnoreCase("dizel")) {
			baznaCijena+=3000;
		}
		else if(getTipMotora().equalsIgnoreCase("elektricni")) {
			baznaCijena+=5000;
		}else {
			System.out.print("Unijeli ste nepostojeći tip motora.");
		}
		return baznaCijena;
	}
	@Override
	public void ispisiDetalje() {
	    super.ispisiDetalje();
	    System.out.println("Broj vrata: " + brojVrata + ", Tip motora: " + tipMotora + ", Cijena: " + izracunajCijenu() + " EUR");
	}

}
