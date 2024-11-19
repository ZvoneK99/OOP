package Zadatak03;

import java.util.HashMap;

public class BrojanjeSlova {
	public static void main(String[]args) {
		HashMap<Character, Integer> frekvencija = new HashMap<>();
		String tekst = "banana";
		
		for(char c : tekst.toLowerCase().toCharArray()) {
			frekvencija.put(c, frekvencija.getOrDefault(c, 0)+ 1);
		}
		System.out.println(frekvencija);
	}
}
