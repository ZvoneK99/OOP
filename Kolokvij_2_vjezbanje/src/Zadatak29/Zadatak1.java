package Zadatak29;

public class Zadatak1 {
	public static void main(String[]args) {
		StolnoRacunalo s1 = new StolnoRacunalo("HP13", "HP", "windows", 30, 20, 3);
		PrijenosnoRacunalo p1 = new PrijenosnoRacunalo("Fujitsu141", "Fujitsu", "Windows", 5000, 2.5);
		Netbook n1 = new Netbook("SamsungS14", "Samsung", "android", 4300, 1.4);
		
		System.out.println(s1);
		System.out.println("------------------------");
		System.out.println(p1);
		System.out.println("------------------------");
		System.out.println(n1);
	}
	
}
