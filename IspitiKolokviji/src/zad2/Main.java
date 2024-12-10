package zad2;

public class Main {
	public static void main(String[]args) {
		GeometrijskiLik g1 = new GeometrijskiLik(4);
		GeometrijskiLik g2 = new GeometrijskiLik(3);

		g1.opseg();
		g2.opseg();
		
		System.out.println(g1);
		System.out.println(g2);
	}
}
