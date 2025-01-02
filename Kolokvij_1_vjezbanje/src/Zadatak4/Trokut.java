package Zadatak4;

public class Trokut {
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;
	
	public Trokut(double stranicaA, double stranicaB, double stranicaC) {
		if(stranicaA+stranicaB <= stranicaC  || stranicaA+stranicaC <= stranicaB || stranicaB+stranicaC <= stranicaA) {
			stranicaA = 0;
			stranicaB = 0;
			stranicaC = 0;
		}
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;
	}
	
	//Getteri i setteri
	public double getStranicaA() {
		return stranicaA;
	}
	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}
	
	public double getStranicaB() {
		return stranicaB;
	}
	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}
	
	public double getStranicaC() {
		return stranicaC;
	}
	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}
	
	public boolean jePravokutan() {
		 if (stranicaA == 0 || stranicaB == 0 || stranicaC == 0) {
		        return false; // Trokut nije valjan
		    }
		double kvadratA = stranicaA*stranicaA;
		double kvadratB = stranicaB*stranicaB;
		double kvadratC = stranicaC*stranicaC;
		if(kvadratA != kvadratB+kvadratC && kvadratB != kvadratA+kvadratC && kvadratC != kvadratA+kvadratB) {
			return false;
		}
		return true;
	}
	public double Opseg() {
		return stranicaA+stranicaB+stranicaC;
	}
	public double Povrsina() {
		double s = (stranicaA+stranicaB+stranicaC) / 2;
		return Math.sqrt(s*(s-stranicaA)*(s-stranicaB)*(s-stranicaC));
	}
	
	@Override
	public String toString() {
		return "Duljine stranica su: " + stranicaA + ", " + stranicaB + ", " + stranicaC +
			       "\nOpseg: " + Opseg() + ", Povrsina: " + Povrsina() +
			       ", Pravokutan: " + jePravokutan() + ".";

	}
}
