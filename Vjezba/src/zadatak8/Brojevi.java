package zadatak8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Brojevi {
	public static void main(String[]args) {
		ArrayList<Integer> brojevi = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite niz brojeva odvojenih razmakom.");
		String nizBrojeva = ulaz.nextLine();
		
		String[] uneseniBrojevi = nizBrojeva.split(" ");
		
		int[] parni = new int[uneseniBrojevi.length];
		int[] neparni = new int[uneseniBrojevi.length];
		int[] djeljiviSa3 = new int[uneseniBrojevi.length];
		double prosjek=0;
		int indexP=0;
		int indexN=0;
		int index3=0;
		int zbroj=0; 
		
		for (int i=0; i<uneseniBrojevi.length; i++) {
			int broj = Integer.parseInt(uneseniBrojevi[i]);
			brojevi.add(broj);
		}
		for(int broj : brojevi) {
			zbroj+=broj;
			if(broj%2==0) {
				parni[indexP] = broj;
				indexP++;
			}
			if(broj%2!=0) {
				neparni[indexN] = broj;
				indexN++;
			}
			if(broj%3==0) {
				djeljiviSa3[index3] = broj;
				index3++;
			}
		}
		prosjek = zbroj/brojevi.size();
		
		System.out.println(Arrays.toString(parni));
		System.out.println(Arrays.toString(neparni));
		System.out.println(Arrays.toString(djeljiviSa3));
		System.out.println(prosjek);
		
	}
}
