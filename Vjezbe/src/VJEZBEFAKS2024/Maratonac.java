package VJEZBEFAKS2024;

public class Maratonac extends Natjecatelj {
	private ObjavljeneUtrke utrke;
	
	public Maratonac(String ime, int duzina, ObjavljeneUtrke utrke) {
		super(ime, duzina);
		this.utrke = utrke;
		this.utrke.dodajMaratonca(this);
	}

	@Override
	public String odabranaDisciplina(String ime) {
		return "Maratonac "+super.toString();
	}

}
