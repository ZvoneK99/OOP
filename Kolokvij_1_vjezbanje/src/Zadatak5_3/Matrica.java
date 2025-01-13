package Zadatak5_3;

public class Matrica {
	int brojRedaka;
	int brojStupaca;
	int[][] M;
	
	public Matrica(int brojRedaka, int brojStupaca) {
		this.brojRedaka = brojRedaka;
		this.brojStupaca = brojStupaca;
		this.M = new int[brojRedaka][brojStupaca];
	}
	
	public static Matrica zbroji(Matrica a, Matrica b) {
		if(a.brojRedaka != b.brojRedaka || a.brojStupaca != b.brojStupaca) {
			return null;
		}
		Matrica rezultat = new Matrica(a.brojRedaka, a.brojStupaca);
		for(int i=0; i<a.brojRedaka; i++) {
			for(int j=0; j<a.brojStupaca; j++) {
				rezultat.M[i][j] = a.M[i][j] + b.M[i][j];
			}
		}
		return rezultat;
	}
	
	public static Matrica pomnozi(Matrica a, Matrica b) {
		if(a.brojRedaka != b.brojRedaka || a.brojStupaca != b.brojStupaca) {
			return null;
		}
		Matrica rez = new Matrica(a.brojRedaka, a.brojStupaca);
		for(int i=0; i<a.brojRedaka; i++) {
			for(int j=0; j<a.brojStupaca; j++) {
				rez.M[i][j] = a.M[i][j] * b.M[i][j];
			}
		}
		return rez;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<brojRedaka; i++) {
			for(int j=0; i<brojStupaca; j++) {
				sb.append(M[i][j]).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
