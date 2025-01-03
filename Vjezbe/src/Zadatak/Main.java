package Zadatak;

public class Main {
	public static void main(String[]args) {
		Knjiga k1 = new Knjiga(" Ika", "mima", 312, true);
		Knjiga k2 = new Knjiga("Vlak u snijegu", "Mato Lovrak", 141, false);
		
		k1.vratiKnjigu();
		
		System.out.println(k1);
	}
}
