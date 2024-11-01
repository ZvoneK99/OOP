package zadatak_01;

public class Krug extends Oblik {
	double polumjer;
	
	public Krug(String boja, double polumjer) {
		super(boja);
		this.polumjer = polumjer;
	}
	
	@Override
	public void ispuni() {
		System.out.println("Krug je ispunjen bojom. "+boja);
	}
}
