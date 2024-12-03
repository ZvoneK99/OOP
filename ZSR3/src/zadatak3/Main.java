package zadatak3;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Proceduralni procedura = new Proceduralni(0);
		Objektni objekt = new Objektni(0);
		Funkcionalni funkcija = new Funkcionalni(0);
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite postotak za proceduralni:");
		procedura.setPostotak(ulaz.nextDouble());
		
		System.out.println("Unesite postotak za objektni:");
		objekt.setPostotak(ulaz.nextDouble());
		
		System.out.println("Unesite postotak za funkcionalni: ");
		funkcija.setPostotak(ulaz.nextDouble());
		
		double ukupno = procedura.getPostotak() + objekt.getPostotak() + funkcija.getPostotak();
		
		if(ukupno != 100) {
			System.out.println("Postotci nisu ispravni. Proporcionalno se prilagođavaju.");
			double faktor = 100/ ukupno;
			procedura.setPostotak(procedura.getPostotak()*faktor);
			objekt.setPostotak(objekt.getPostotak()*faktor);
			funkcija.setPostotak(funkcija.getPostotak()*faktor);
			 System.out.printf("Proceduralni: %.2f%%\n", procedura.getPostotak());
	            System.out.printf("Objektni: %.2f%%\n", objekt.getPostotak());
	            System.out.printf("Funkcionalni: %.2f%%\n", funkcija.getPostotak());
		}
		System.out.println("Ispis najzastupljenijeg jezika. ");
		if(procedura.getPostotak() > objekt.getPostotak() && procedura.getPostotak() > funkcija.getPostotak()) {
			System.out.println("Najzastupljeniji su proceduralni jezici.");
		}else if(objekt.getPostotak() > procedura.getPostotak() && objekt.getPostotak() > funkcija.getPostotak()) {
			System.out.println("Najzastupljeniji su objektni jezici.");
		}else {
			System.out.println("Najzastupljeniji su funkcionalni jezici.");
		}
		ulaz.close();
	}
}
