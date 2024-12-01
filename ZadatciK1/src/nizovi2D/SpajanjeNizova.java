package nizovi2D;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SpajanjeNizova {
	public static void main(String[]args) {
		int[] niz1 = {1,2,3,4,5};
		int[] niz2 = {6,7,8,9,10};
		
		int[] noviNiz = IntStream.concat(Arrays.stream(niz1), Arrays.stream(niz2)).toArray();
		
		System.out.println(Arrays.toString(noviNiz));
		
	}
}
