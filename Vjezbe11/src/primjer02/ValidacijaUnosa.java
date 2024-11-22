package primjer02;

import java.util.Scanner;

public class ValidacijaUnosa {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite neki tekst");
		String tekst = ulaz.nextLine();
		
		boolean samoSlova = tekst.matches("[a-zA-Z]+");
		boolean dovoljneDuljine = tekst.length()>5;
		 
			if(samoSlova && dovoljneDuljine) {
					System.out.println("Ispravan unos");
				}
				else if(!samoSlova){
					System.out.println("Neispravan unos. Tekst ne sadrzi samo slova");
				}
				else if(!dovoljneDuljine) {
					System.out.println("Neispravan unos. Tekst je prekratak.");
			}
			ulaz.close();
		}
	}
