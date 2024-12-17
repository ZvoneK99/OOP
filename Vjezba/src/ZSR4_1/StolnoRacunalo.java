package ZSR4_1;

public class StolnoRacunalo extends Racunalo {
	private double[] dimenzijeKucista;
	
	public StolnoRacunalo(String model, String proizvodjac, String operacijskiSustav, double visina, double sirina, double dubina) {
		super(model, proizvodjac, operacijskiSustav);
		this.setDimenzijeKucista(new double[] {visina, sirina, dubina});
	}

	//Getter i setter
	public double[] getDimenzijeKucista() {
		return dimenzijeKucista;
	}

	public void setDimenzijeKucista(double[] dimenzijeKucista) {
		this.dimenzijeKucista = dimenzijeKucista;
	}

	@Override
	public String dohvatiTipRacunala() {
		return "Stolno racunalo";
	}

	@Override
	public int izracunajPrenosivost() {
		double volumen = dimenzijeKucista[0]*dimenzijeKucista[1]*dimenzijeKucista[2];
		
		return (int) (5+volumen/30);
	}
	
	@Override
	public String toString() {
		return super.toString()+" dimenzije kucista: ("+dimenzijeKucista[0]+" "+dimenzijeKucista[1]+" "+dimenzijeKucista[2]+")"+
				izracunajPrenosivost()+"ikaaa"+dohvatiTipRacunala();
		
	}
}
