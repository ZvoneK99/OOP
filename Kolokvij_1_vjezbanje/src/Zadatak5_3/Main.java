package Zadatak5_3;

public class Main {
	public static void main(String[]args) {
		Matrica m1 = new Matrica(4, 3);
		Matrica m2 = new Matrica(3, 4);
		Matrica m3 = new Matrica(4, 3);
		Matrica m4 = new Matrica(3, 4);
		
		
		System.out.println(Matrica.pomnozi(m1, m3));
	}
}
