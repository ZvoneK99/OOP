package Zadatak1;

import java.util.Scanner;

public class Zadatak1_5 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj.");
		int broj = ulaz.nextInt();
		
		String br = String.valueOf(broj);
		
		String parni = "";
		int brojacParnih = 0;
		String neparni = "";
		int brojacNeparnih = 0;
		
		for(int i=0; i<br.length(); i++) {
			int znamenka = Character.getNumericValue(br.charAt(i));
			if(znamenka%2==0) {
				brojacParnih++;
				parni +=znamenka;
			}
			else {
				brojacNeparnih++;
				neparni+=znamenka;
			}
		}
		System.out.println("Parni: "+brojacParnih+"("+parni+")");
		System.out.println("Neparni "+brojacNeparnih+"("+neparni+")");
		ulaz.close();
	}
}
