package Zadatak1;

import java.util.Scanner;

public class Zadatak1_4 {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj.");
		int broj=ulaz.nextInt();
		
		UnosStringa br = UnosStringa.valueOf(broj);
		UnosStringa naopako = "";
		for(int i=br.length()-1; i>=0; i--) {
			naopako+= br.charAt(i);
		}
		naopako = UnosStringa.valueOf(Integer.parseInt(naopako));
		System.out.println(naopako);
		ulaz.close();
	}
}
