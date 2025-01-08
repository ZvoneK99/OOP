package VJEZBEFAKSREDO;

public class Gradanin extends Natjecatelj {

	public Gradanin(String ime, int duzina) {
		super(ime, duzina);
	}

	@Override
	public String odabranaDisciplina(String ime) {
		return "Gradanin "+super.toString();
	}

}
