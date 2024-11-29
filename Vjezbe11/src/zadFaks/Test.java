package zadFaks;

public class Test {
	public static void main(String[]args) {
		GeometrijskiLik geoLik = new GeometrijskiLik(4, 6);
		Krug krug = new Krug(5, 1);
		Pravokutnik pravokutnik = new Pravokutnik(5, 6);
		Kvadrat kvadrat = new Kvadrat(6, 7);
		
		System.out.println("Geometrijski lik: "+geoLik.toString());
		System.out.println("Krug: "+krug.toString());
		System.out.println("Pravokutnik: "+pravokutnik.toString());
		System.out.println("Kvadrat: "+kvadrat.toString());
	}
}
