package ZSR2;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		String[] imena = new String[10];
		String[] jednaki = new String[10];
		String[] razliciti = new String[10];
		
		for(int i=0; i<imena.length; i++) {
			System.out.println("Unesite ime osobe "+(i+1));
			imena[i] = ulaz.nextLine();
		}
		
		int j=0;
		int k=0;
		
		for(int i=0; i<imena.length; i++) {
			if(Character.toLowerCase(imena[i].charAt(0)) == Character.toLowerCase(imena[i].charAt(imena[i].length()-1))) {
				jednaki[j] = imena[i];
				j++;
			}
			else {
				razliciti[k] = imena[i];
				k++;
				}
			}
		for(int i=0; i<j; i++) {
			System.out.println(jednaki[i]);
		}
		System.out.println("-----------------");
		for(int i=0; i<k; i++) {
			System.out.println(razliciti[i]);
		}
	}
}
