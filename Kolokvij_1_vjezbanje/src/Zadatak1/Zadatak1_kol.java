package Zadatak1;

import java.util.Scanner;

public class Zadatak1_kol {
	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite cijeli broj.");
		int broj = ulaz.nextInt();
		
		int najvecaZnamenka=0;
		int najmanjaZnamenka=9;
		
		while(broj>0) {
			int znamenka = broj % 10;
			broj /= 10;
			if(znamenka>najvecaZnamenka) {
			najvecaZnamenka = znamenka;
		}
		if(znamenka<najmanjaZnamenka) {
			najmanjaZnamenka = znamenka;
		}
		}
		System.out.println("Najveca znamenka = "+najvecaZnamenka);
		System.out.println("Najmanja znamenka = "+najmanjaZnamenka);
		ulaz.close();
	}
}
