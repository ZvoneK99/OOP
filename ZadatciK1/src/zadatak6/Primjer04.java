package zadatak6;

import java.util.Scanner;

public class Primjer04 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesi ime i prezime: ");
		String ime_prezime = ulaz.nextLine();
		
		String ime = ime_prezime.substring(0, ime_prezime.indexOf(' '));
		String prezime = ime_prezime.substring(ime_prezime.indexOf(' ') + 1);
		
		
		System.out.println(ime);
		System.out.println(prezime);
	}
}
