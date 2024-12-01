package zadatak14;

public class Matrica {
	int brojRedaka;
	int brojStupaca;
	double[][] M;
	
	public Matrica(int brojRedaka, int brojStupaca) {
		this.brojRedaka = brojRedaka;
		this.brojStupaca = brojStupaca;
		this.M = new double[brojRedaka][brojStupaca];
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
	public static Matrica zbroji(Matrica m1, Matrica m2) {
		if(m1.brojRedaka != m2.brojRedaka || m1.brojStupaca != m2.brojStupaca) {
			return null;
		}
		
		Matrica rezultat = new Matrica(m1.brojRedaka, m1.brojStupaca);
		
		for(int i=0; i<m1.brojRedaka; i++) {
			for(int j=0; j<m1.brojStupaca; j++) {
				rezultat.M[i][j] = m1.M[i][j] + m2.M[i][j];
			}
		}
		return rezultat;
	}
	public static Matrica pomnozi(Matrica m1, Matrica m2) {
		if(m1.brojRedaka != m2.brojRedaka || m1.brojStupaca != m2.brojStupaca) {
			return null;
		}
		
		Matrica rezultat = new Matrica(m1.brojRedaka, m1.brojStupaca);
		
		for(int i=0; i<m1.brojRedaka; i++) {
			for(int j=0; j<m1.brojStupaca; j++) {
				rezultat.M[i][j] = m1.M[i][j] * m2.M[i][j];
			}
		}
		return rezultat;
	}
}
