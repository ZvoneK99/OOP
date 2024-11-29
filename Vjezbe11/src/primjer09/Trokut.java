package primjer09;

public class Trokut extends GeometrijskiLik {
	double visina;
	double baza;
	
	public Trokut(double visina, double baza) {
		super(0, 0);
		this.visina = visina;
		this.baza = baza;
		
		double povrsina = (baza * visina) /2;
		
		double hipotenuza = Math.sqrt(Math.pow(baza/2, 2)+ Math.pow(visina, 2));
		double opseg = baza+2*hipotenuza;
		
		setPovrsina(povrsina);
		setOpseg(opseg);	
		}

}
