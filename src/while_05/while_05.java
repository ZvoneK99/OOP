package while_05;
	
import java.util.Scanner;

public class while_05 {
	public static void main (String[]args) {
		Scanner ulaz = new Scanner(System.in);
	int brojacBrojeva=0;
		while(true) {
			System.out.println("Unesite brojo:");
			int n = ulaz.nextInt();
			if(n>0) {
				brojacBrojeva++;
			}
			else {
				break;
				
			}
		}
		System.out.println("Broj unesenih pozitivnih brojeva je: "+brojacBrojeva);
		ulaz.close();
	}
}
