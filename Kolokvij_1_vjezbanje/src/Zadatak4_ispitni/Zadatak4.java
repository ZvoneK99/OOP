package Zadatak4_ispitni;

public class Zadatak4 {
	public static void main(String[]args) {
		GeometrijskiLik g1 = new GeometrijskiLik(6);
		GeometrijskiLik g2 = new GeometrijskiLik(3);
		GeometrijskiLik g3 = new GeometrijskiLik(1);
		GeometrijskiLik g4 = new GeometrijskiLik(2);
		GeometrijskiLik g5 = new GeometrijskiLik(4);
		
		g1.Opseg();
		g2.Opseg();
		g3.Opseg();
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(g3.toString());
	}
}
