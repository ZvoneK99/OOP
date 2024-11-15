package zadatak01;

public class Automobil {
	String marka;
	String model;
	int godinaProizvodnje;
	double cijena;
	
	public Automobil(String marka, String model, int godinaProizvodnje, double cijena) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
		this.cijena = cijena;
	}
	public boolean provjeriImaLiIstihAutomobila(Automobil drugi) {
		if(marka.equals(drugi.marka) && model.equals(drugi.model) && godinaProizvodnje == drugi.godinaProizvodnje) {
			return true;
		}
		return false;
	}

	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+", model: "+model+", godina proizvodnje: "+godinaProizvodnje+", cijena: "+cijena+" $.");
	}
}
