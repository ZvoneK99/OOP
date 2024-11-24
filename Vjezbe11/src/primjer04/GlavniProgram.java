package primjer04;

public class GlavniProgram {
	public static void main(String[]args) {
		 Tocka2D T1 = new Tocka2D(); // Default konstruktor
	        Tocka2D T2 = new Tocka2D("A", 3.5, -2.7); // Konstruktor s parametrima
	        Tocka2D T3 = new Tocka2D(T2); // Konstruktor kopije

	        System.out.println(T1); // Ispisuje: O(0.0, 0.0)
	        System.out.println(T2); // Ispisuje: A(3.5, -2.7)
	        System.out.println(T3); // Ispisuje: AC(3.5, -2.7)
	}
}
