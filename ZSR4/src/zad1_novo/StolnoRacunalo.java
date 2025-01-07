package zad1_novo;

public class StolnoRacunalo extends Racunalo {
	private double[] dimenzijeKucista;
	
	public StolnoRacunalo(String model, String proizvodjac, String OS, double visina, double sirina, double dubina) {
		super(model, proizvodjac, OS);
		this.setDimenzijeKucista(new double[] {visina, sirina, dubina});
	}
	
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
		return (int) (5+(volumen)/30);
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Dimenzije kucista:  Visina: "+dimenzijeKucista[0]+" Sirina: "+dimenzijeKucista[1]+" Dubina: "+dimenzijeKucista[2];
	}
}
