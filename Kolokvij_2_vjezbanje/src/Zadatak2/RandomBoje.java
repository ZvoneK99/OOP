package Zadatak2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBoje {
	public static void main(String[]args) {
		String[] boje = {"plava", "Zuta", "Zelena", "Crvena"};
		Random random = new Random();
		List<String> odabraneBoje = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			String boja = boje[random.nextInt(boje.length)];
			odabraneBoje.add(boja);
		}
		
		System.out.println("Boje");
		for (String boja : odabraneBoje) {
			System.out.println(boja);
		}
		
	}
}
