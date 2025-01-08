package VJEZBEFAKS2024;

public class Polumaratonac extends Natjecatelj {

	public Polumaratonac(String ime, int duzina) {
		super(ime, duzina);
	}
	@Override
	public String odabranaDisciplina(String ime) {
		return "Polumaratonac "+super.toString();
	}

}
