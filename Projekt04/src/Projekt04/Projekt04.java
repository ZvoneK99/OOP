package Projekt04;
	import java.util.Scanner;
public class Projekt04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite svoje ime:");
		String ime = scanner.nextLine();
		
		System.out.println("Unesite broj godina:");
		int godine = scanner.nextInt();
		
		System.out.println("Zdravo " + ime + "! Tvoj broj godina je:" + godine + ".");
		scanner.close();
	}
}
