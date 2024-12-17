package ZSR3_3;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Proceduralni procedura = new Proceduralni(0);
		Objektni objekt = new Objektni(0);
		Funkcionalni funkcija = new Funkcionalni(0);
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite postotak za proceduralni jezik: ");
		double proceduralni = ulaz.nextDouble();
		procedura.setPostotak(proceduralni);
		
		System.out.println("Unesite postotak za objektni jezik:");
		double objektni = ulaz.nextDouble();
		objekt.setPostotak(objektni);
		
		System.out.println("Unesite postotak za fukncionalni jezik: ");
		double funkcionalni = ulaz.nextDouble();
		funkcija.setPostotak(funkcionalni);
		
		System.out.println("Postotak za proceduralne jezike je: "+procedura.getPostotak());
		System.out.println("Postotak za objektne jezike je: "+objekt.getPostotak());
		System.out.println("Postotak za funkcionalne jezike je: "+funkcija.getPostotak());
		
		double zbroj=(procedura.getPostotak()+objekt.getPostotak()+funkcija.getPostotak());
		
		if (zbroj != 100) {
			System.out.println("Zbroj je različit od 100");
			
			double novo = 100/zbroj;
			
			System.out.println("Novi postotak za proceduralne je: "+procedura.getPostotak()*novo);
			System.out.println("Novi postotak za objektne je: "+objekt.getPostotak()*novo);
			System.out.println("Novi postotak za fukncionalne je: "+funkcija.getPostotak()*novo);
		}
	}
}
