package Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class NajveciNajmanji {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		ArrayList<Integer> brojevi = new ArrayList<>();
		while(true) {
			System.out.println("Unesite broj");
			int broj=ulaz.nextInt();
			if(broj == 0) {
				break;
			}
			brojevi.add(broj);
		}
		int maxZbroj = Integer.MIN_VALUE;
		int minZbroj = Integer.MAX_VALUE;
		int najveciBroj = Integer.MIN_VALUE;
		int najmanjiBroj = Integer.MAX_VALUE;
		
		for(int br : brojevi) {
			if(zbrojZnamenki(br) > maxZbroj) {
				maxZbroj = zbrojZnamenki(br);
			}
			if(zbrojZnamenki(br) < minZbroj) {
				minZbroj = zbrojZnamenki(br);
			}
			if(br>najveciBroj) {
				najveciBroj = br;
			}
			if(br<najmanjiBroj) {
				najmanjiBroj = br;
			}
		}
		System.out.println(brojevi);
		System.out.println("Najveci broj "+najveciBroj);
		System.out.println("Najmanji broj "+najmanjiBroj);
		System.out.println("Najveci zbroj znamenki "+maxZbroj);
		System.out.println("Najmanji zbroj znamenki "+minZbroj);
	}
	public static int zbrojZnamenki(int broj) {
		int zbrojZnamenki=0;
		while(broj>0) {
			int znamenka = broj % 10;
			broj/=10;
			zbrojZnamenki+=znamenka;
		}
		return zbrojZnamenki;
	}
}
