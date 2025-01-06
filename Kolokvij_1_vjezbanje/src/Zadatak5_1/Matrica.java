package Zadatak5_1;

public class Matrica {
	private int brojRedaka;
	private int brojStupaca;
	int[][] M;
	
	public Matrica(int brojRedaka, int brojStupaca) {
		this.setBrojRedaka(brojRedaka);
		this.setBrojStupaca(brojStupaca);
		this.M = new int[brojRedaka][brojStupaca]; // Ovo je ispravno!

	}

	public int getBrojRedaka() {
		return brojRedaka;
	}

	public void setBrojRedaka(int brojRedaka) {
		this.brojRedaka = brojRedaka;
	}

	public int getBrojStupaca() {
		return brojStupaca;
	}

	public void setBrojStupaca(int brojStupaca) {
		this.brojStupaca = brojStupaca;
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
