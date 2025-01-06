package Zadatak5_2;

public class Matrica {
	int brojRedaka;
	int brojStupaca;
	int[][] M;
	
	public Matrica(int brojRedaka, int brojStupaca) {
		this.brojRedaka = brojRedaka;
		this.brojStupaca = brojStupaca;
		this.M = new int[brojRedaka][brojStupaca];
	}
	
	
	public static Matrica transponiraj(Matrica original) {
		Matrica transponirana = new Matrica(original.brojStupaca, original.brojRedaka);
		
		for(int i=0; i<original.brojRedaka; i++) {
			for(int j=0; j<original.brojStupaca; j++) {
				transponirana.M[j][i] = original.M[i][j];
			}
		}
		return transponirana;
	}
	
	public Matrica skaliraj(int faktor) {
		Matrica nova = new Matrica(brojRedaka, brojStupaca);
		for(int i=0; i<brojRedaka; i++) {
			for(int j=0; j<brojStupaca; j++) {
				 nova.M[i][j] = this. M[i][j] *faktor;
			}
		}
		return nova;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<brojRedaka; i++) {
			for(int j=0; j<brojStupaca; j++) {
				sb.append(M[i][j]).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
