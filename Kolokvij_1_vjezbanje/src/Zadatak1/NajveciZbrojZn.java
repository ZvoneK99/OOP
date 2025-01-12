package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class NajveciZbrojZn {

	public static void main(UnosStringa[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Integer> brojevi = new ArrayList<>();
		while(true) {
			System.out.println("Unesite brojeve");
			int broj = ulaz.nextInt();
		if(broj == 0) {
			break;
		}
		brojevi.add(broj);
		}
		int NajvecizbrojZnamenki = Integer.MIN_VALUE;
		int najmanjiZbrojZnamenki = Integer.MAX_VALUE;
		for(int br : brojevi) {
			if(zbrojZnamenki(br) > NajvecizbrojZnamenki) {
				NajvecizbrojZnamenki  = zbrojZnamenki(br);
			}
			if(zbrojZnamenki(br)< najmanjiZbrojZnamenki) {
				najmanjiZbrojZnamenki = zbrojZnamenki(br);
			}
		}
		System.out.println(brojevi);
		System.out.println(NajvecizbrojZnamenki);
		System.out.println(najmanjiZbrojZnamenki);
		
	}
	static int zbrojZnamenki(int b) {
		int zbrojZnamenki=0;
		while(b>0) {
			int znamenka = b % 10;
			b /= 10;
			zbrojZnamenki+=znamenka;
		}
		return zbrojZnamenki;
	}
}
