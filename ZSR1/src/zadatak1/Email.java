/*Napisati program u Javi skoji unosi string i provjerava radi li se o ispravnoj e-mail adresi. 
 * Ispravnom e-mail adresom smatra se onaj string koji sadrzi proizvoljno korisnicko ime sastavljeno od slova engleskog alfabeta, 
 * znamenki te znakova točke (.) i donje crte (_) nakon kojeg slijedi znak @ te iz toga domenu koja mora imati barem jednu točku u sredini teksta. 
 * Nakon provjere dojavljuje se poruka o ispravnosti unesene e-mail adrese.*/

package zadatak1;

import java.util.Scanner;

public class Email {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite Email za provjeru ispravnosti");
		String email = ulaz.nextLine();
		
		String ispravanEmail = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
		

		if(email.matches(ispravanEmail)) {
			System.out.println("Email je ispravan.");
		}
		else {
			System.out.println("Email nije ispravan.");
		}
		ulaz.close();
	}
}
