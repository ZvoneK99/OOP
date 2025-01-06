package ZSR3ZAD3;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite postotak za proceduralni");
		double proceduralni = ulaz.nextDouble();
		
		System.out.println("Unesite postotak za objektni");
		double objektni = ulaz.nextDouble();
		
		System.out.println("Unesite postotak za fukncionalni");
		double fukncionalni= ulaz.nextDouble();
		
		System.out.println("Postotak za proceduralni "+proceduralni);
		System.out.println("Postotak za objektni "+objektni);
		System.out.println("Postotak za fukncionalni "+fukncionalni);
		
		double postotak = 100 / (proceduralni+objektni+fukncionalni) ;
		
		if(proceduralni+objektni+fukncionalni != 100) {
				proceduralni *=postotak;
				objektni*=postotak;
				fukncionalni*=postotak;
		}
		System.out.println("-----------------------");
		System.out.println("Novi postotci su: ");
		System.out.println("Postotak za proceduralni "+proceduralni);
		System.out.println("Postotak za objektni "+objektni);
		System.out.println("Postotak za fukncionalni "+fukncionalni);
		
		if(proceduralni > objektni && proceduralni > fukncionalni) {
			System.out.println("Proceduralni je najzastupljeniji.");
		}
		else if(objektni > proceduralni && objektni > fukncionalni) {
			System.out.println("Objektni je najazastupljeniji");
		}
		else {
			System.out.println("Fukncionalni je najzastupljeniji");
		}
	}
}
