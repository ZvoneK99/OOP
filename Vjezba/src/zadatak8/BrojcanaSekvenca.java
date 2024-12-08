package zadatak8;

import java.util.ArrayList;
import java.util.Scanner;

public class BrojcanaSekvenca {
	public static void main(String[]args) {
		ArrayList<Integer> brojevi = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da ispisemo?");
		int n = ulaz.nextInt();
		
		brojevi.add(1);
		if(n>1) {
			brojevi.add(2);
		}
		
		
		for(int i=2; i<n; i++) {
			int sljedeci=(brojevi.get(i-2)+brojevi.get(i-1))*i;
			brojevi.add(sljedeci);
		}
		System.out.println(brojevi);
		ulaz.close();
	}
}
