package zadatak3;

import java.util.Scanner;

public class URL {
	
	public static boolean provjeraURL(String URL) {
		String regex = "^(http://|https://)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		return URL.matches(regex);
	}
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite URL");
		String url = ulaz.nextLine();
		
		if(provjeraURL(url)) {
			System.out.println("URL je ispravan");
		}
		else {
			System.out.println("URL nije ispravan");
		}
		ulaz.close();
	}
}
