package Zadatak2;

import java.util.Scanner;

public class Jednakostranican {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite velicine stranica trokuta odvojene razmakom.");
		String stranice = ulaz.nextLine();
		
		String[] brojevi = stranice.split(" ");
		
		int stranicaA = Integer.parseInt(brojevi[0]);
		int stranicaB = Integer.parseInt(brojevi[1]);
		int stranicaC = Integer.parseInt(brojevi[2]);
		
		if(stranicaA+stranicaB <= stranicaC || stranicaA+stranicaC <= stranicaB || stranicaB+stranicaC <= stranicaA) {
			System.out.println("Trokut je nemoguc.");
		}
		else {
			if(stranicaA == stranicaB && stranicaA == stranicaC && stranicaB == stranicaC) {
				System.out.println("Trokut je jednakostranican");
			}
			else {
				System.out.println("Trokut nije jednakostranican.");
			}
		}
		ulaz.close();
	}
}
