package Zad4;

import java.util.Random;

public class RandomIspis {
	public static void main(String[]args) {
		Random random = new Random();
		
		boolean ika = random.nextBoolean();

		System.out.println(ika);
	}
}
