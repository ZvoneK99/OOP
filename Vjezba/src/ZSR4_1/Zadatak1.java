package ZSR4_1;

public class Zadatak1 {
	public static void main(String[]args) {
		StolnoRacunalo st = new StolnoRacunalo("model", "proizvodjacc", "OS", 1, 4, 5);
		PrijenosnoRacunalo p = new PrijenosnoRacunalo("modeel", "prooizv", "OPERS", 145, 124.2);
		Netbook n = new Netbook("m", "P", "OPS", 4, 1);
		
		System.out.println(st);
		System.out.println(p);
		System.out.println(n);
	}
}
