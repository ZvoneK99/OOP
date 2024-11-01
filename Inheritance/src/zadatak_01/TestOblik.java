package zadatak_01;

public class TestOblik {
	public static void main(String[]args) {
		Oblik oblik1 = new Oblik("Plava");
		Krug krug1 = new Krug("crvena", 5.0);
		
		oblik1.ispuni();
		krug1.ispuni();
	}
}
