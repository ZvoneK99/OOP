package primjer03;

import java.util.ArrayList;

public class Fibonacci {
	public static void main(String[]args) {
		ArrayList<Integer> fibonacciNiz = new ArrayList<>(20);
				
		int prvi=0; 
		int drugi=1;
		System.out.println(prvi);
		for(int i=0; i<20; i++) {
			
			System.out.println(drugi);
				int sljedeci=prvi+drugi;
				prvi=drugi;
				drugi=sljedeci;
		}
	}
}
