package primjer09;

public class Test {
	public static void main(String[]args) {
		GeometrijskiLik geoLik = new GeometrijskiLik(4, 2);
		Trokut t1 = new Trokut(4, 2);
		Pravokutnik p1 = new Pravokutnik(2, 5);
		Kvadrat k1 = new Kvadrat(4);
		
		System.out.println("Geometrijski lik: "+geoLik.toString());
		System.out.println("Trokut "+t1.toString());
		System.out.println("Pravokutnik: "+p1.toString());
		System.out.println("Kvadrat k1: "+k1.toString());
	}
	
}
