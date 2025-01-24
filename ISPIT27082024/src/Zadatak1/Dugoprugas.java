package Zadatak1;

public class Dugoprugas extends Natjecatelj {
	ObjavljeneUtrke utrke;
	public Dugoprugas(int brojKilometara, String imePrezime) {
		super(brojKilometara, imePrezime);
		String dodaj = utrke.dodajDugoprugasa(Prijava p);
	}

	@Override
	public String odabranaDisciplina(String ime) {
		return super.toString()+" Dugoprugas.";
	}
	
}
