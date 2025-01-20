package Zadatak6;

public class DevizniRacun extends OsnovniRacun {
	private String valuta;
	
	public DevizniRacun(String imeVlasnika, double stanjeRacuna, String valuta) {
		super(imeVlasnika, stanjeRacuna);
		this.setValuta(valuta);
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
	@Override
	public String toString() {
		return super.toString() + " Valuta: "+getValuta();
	}
}
