package Zadatak6;

public class Main {
	public static void main(String[]args) {
		Racun r1 = new Racun("Ika", 0);
		Racun r2 = new Racun("Mima", 1500);
		
		r1.uplati(150);
		System.out.println(r1);
		r2.isplati(1300);
		System.out.println(r2);
	}
}
