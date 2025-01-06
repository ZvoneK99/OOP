package Zadatak5_1;

public class Main {
	public static void main(String[]args) {
		Matrica m1 = new Matrica(4, 3);
		
		for(int i=0; i<m1.getBrojRedaka(); i++) {
			for(int j=0; j<m1.getBrojStupaca(); j++) {
				m1.M[i][j] = i+1;
			}
		}
		System.out.println("Originalna matrica:");
		System.out.println(m1);
		
		System.out.println("Transponirana matrica");
		System.out.println(m1.transponiraj(m1));
	}
}
