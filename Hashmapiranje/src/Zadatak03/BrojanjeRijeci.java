package Zadatak03;

import java.util.HashMap;

public class BrojanjeRijeci {
	public static void main(String[]args) {
		HashMap<String, Integer> brojPojava = new HashMap<>();
		String tekst = "Teletina ispod sača.";
		String[] rijeci = tekst.split(" ");
		for(String rijec : rijeci) {
			brojPojava.put(rijec, brojPojava.getOrDefault(rijec, 0 )+1);
		}
		System.out.println(brojPojava);
		
	}
}
