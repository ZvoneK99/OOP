package Zadatak5_2;

public class Glavni {
	public static void main(String[]args) {
		Matrica m1 = new Matrica(4, 3);
		
		for(int i=0; i<m1.brojRedaka; i++) {
			for(int j=0; j<m1.brojStupaca; j++) {
				m1.M[i][j] = i+1;
			}
		}
		System.out.println("Originalna matrica");
		System.out.println(m1);
		System.out.println("-------------------");
		System.out.println("Transponirana");
		System.out.println(m1.transponiraj(m1));
		System.out.println("--------------------");
		System.out.println("Skalirana");
		System.out.println(m1.skaliraj(3));
	}
}
