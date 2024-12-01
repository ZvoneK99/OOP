package zadatak15;

import java.util.Scanner;

public class MatricaOperacije {
	int brojRedaka;
	int brojStupaca;
	double[][] M;
	
	public MatricaOperacije(int brojRedaka, int brojStupaca) {
		this.brojRedaka = brojRedaka;
		this.brojStupaca = brojStupaca;
		this.M = new double[brojRedaka][brojStupaca];
	}
	
	public void ucitajElemente() {
		Scanner ulaz = new Scanner(System.in);
		for(int i=0; i<brojRedaka; i++) {
			for(int j=0; j<brojStupaca; j++) {
				System.out.println("Unesite element na poziciji ["+i+"]["+j+"]");
				M[i][j] = ulaz.nextDouble();
			}
		}
	}
	public double[] zbrojiRedke() {
		double[] zbrojeviRedaka = new double[brojRedaka];
		for(int i=0;i<brojRedaka; i++) {
			double zbroj = 0;
			for(int j=0; j<brojStupaca; j++) {
				zbroj+=M[i][j];
			}
			zbrojeviRedaka[i] = zbroj;
		}
		return zbrojeviRedaka;
	}
	
	public MatricaOperacije transponiraj() {
		MatricaOperacije transponirana = new MatricaOperacije(this.brojStupaca, this.brojRedaka);
		
		for(int i=0; i<this.brojRedaka; i++) {
			for(int j=0; j<this.brojStupaca; j++) {
				transponirana.M[j][i] = this.M[i][j];
			}
		}
		return transponirana;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M[i].length; j++) {
				sb.append(M[i][j]).append("\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
