package zadatak;

public class StolnoRacunalo extends Racunalo {
	private double[] dimenzijeKucista;

	public StolnoRacunalo(String model, String proizvodjac, String  operacijskiSustav,  double visina, double sirina, double dubina) {
		super(model, proizvodjac, operacijskiSustav);
		this.dimenzijeKucista = new double[] {visina, sirina, dubina};
	}
	
	public double[] getDimenzijeKucista() {
		return dimenzijeKucista;
	}

	public void setDimenzijeKucista(double[] dimenzijeKucista) {
		this.dimenzijeKucista = dimenzijeKucista;
	}
	public String dohvatiTipRacunala() {
		return "Stolno računalo";
	}
	
	public int izracunajPrenosivost() {
		double volumenKucista = dimenzijeKucista[0]*dimenzijeKucista[1]*dimenzijeKucista[2];
		
		return (int) (5+(volumenKucista)/30);
	}
	@Override
	public String toString() {
		String osnovniIspis = super.toString();
		return osnovniIspis+" Dimenzije: ("+dimenzijeKucista[0]+" "+dimenzijeKucista[1]+" "+dimenzijeKucista[2]+")"+
				"Tip racunala "+dohvatiTipRacunala()+  ", Prenosivost: "+izracunajPrenosivost();
	}
}


