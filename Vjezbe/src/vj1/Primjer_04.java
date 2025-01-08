package vj1;

import java.util.Scanner;

public class Primjer_04 
{
	public static void main(String [] args)
	{
		Scanner ulaz = new Scanner(System.in);
		
		System.out.print("Unesi ime i prezime: ");
		String ime_prezime = ulaz.nextLine();
		
		String[] imePrezime = ime_prezime.trim().split(" ");
		
		String imee = imePrezime[0];
		String prezimee = imePrezime[1];
		
		System.out.println("Ime je "+imee);
		System.out.println("Prezime je "+prezimee);
		
		
		
	String ime = ime_prezime.substring(0, ime_prezime.indexOf(' '));
		String prezime = ime_prezime.substring(ime_prezime.indexOf(' ') + 1);
		System.out.println("Ime je " + ime + ".");
		System.out.println("Prezime je " + prezime + ".");
		ulaz.close();
	}
}