package VJEZBEFAKSREDO;

public class Maratonac extends Natjecatelj {
	
	public Maratonac(String ime, int duzina) {
		super(ime, duzina);
	}
	
	@Override
	public String odabranaDisciplina(String ime) {
		return "Maratonac "+super.toString();
	}
}
