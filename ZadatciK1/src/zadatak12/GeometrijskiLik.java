package zadatak12;

import java.util.ArrayList;
import java.util.Scanner;

public class GeometrijskiLik {
	int BrojStranica;
	ArrayList<Double> stranice;
	
	public GeometrijskiLik(int BrojStranica) {
		this.BrojStranica = BrojStranica;
		this.stranice = new ArrayList<>();
		UcitajStranice();
	}
	public void UcitajStranice() {
		for (int i=0; i<BrojStranica; i++) {
			Scanner ulaz = new Scanner(System.in);
			System.out.println("Unesi stranicu: "+(i+1));
			double duljina = ulaz.nextDouble();
			
			stranice.add(duljina);
		}
	}
	public double Opseg() {
		double opseg = 0;
		for(int i=0; i<stranice.size(); i++) {
			opseg+=stranice.get(i);
		}
		return opseg;
	}
	
	@Override
	public String toString() {
		StringBuilder straniceIspis = new StringBuilder();
		
		for(int i=0; i<stranice.size(); i++) {
			straniceIspis.append("<").append(stranice.get(i)).append(">");
			if(i<stranice.size()-1) {
				straniceIspis.append(", ");
			}
		}
		return "Geometrijski lik ima <"+BrojStranica+"> stranica, duljina: "+straniceIspis+", Opseg: "+Opseg();
	}
}
