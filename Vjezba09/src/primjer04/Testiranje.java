package primjer04;

import java.util.ArrayList;
import java.util.Scanner;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Proizvod> proizvodi = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		//Unos proizvoda
		for(int i=0; i<3; i++) {
		System.out.println("Unesite naziv proizvoda: ");
		String imeProizvoda = ulaz.nextLine();
		
		System.out.println("Unesite cijenu proizvoda: ");
		double cijenaProizvoda = ulaz.nextDouble();
		
		System.out.println("Unesite količinu na stanju: ");
		int kolicinaProizvoda = ulaz.nextInt();
		ulaz.nextLine();
		Proizvod p = new Proizvod(imeProizvoda, cijenaProizvoda, kolicinaProizvoda);
		proizvodi.add(p);
		
	}
		for(Proizvod proizvod : proizvodi) {
			proizvod.ispisiPodatke();
		}
		
	System.out.println("Odaberite proizvod unosom broja za azuriranje kolicine: ");
	for(int i=0; i<proizvodi.size(); i++) {
		System.out.println((i+1)+"."+proizvodi.get(i).naziv);
	}
	int izborProizvoda = ulaz.nextInt()-1;
	
	if(izborProizvoda >= 0 && izborProizvoda<proizvodi.size()) {
		Proizvod odabraniProizvod = proizvodi.get(izborProizvoda);
		System.out.println("Odabrali ste proizvod: "+odabraniProizvod.naziv);
		System.out.println("Zelite li: 1 - Povećati količinu, 2 - Smanjiti količinu?");
		int akcija = ulaz.nextInt();
		
		if(akcija==1) {
			System.out.println("Unesite koliko zelite povećati veličinu: ");
			int kolicina = ulaz.nextInt();
			odabraniProizvod.dodajKolicinu(kolicina);
		}
		else if(akcija==2) {
			System.out.println("Unesite koliko zelite smanjiti kolicinu");
			int kolicina = ulaz.nextInt();
			odabraniProizvod.samanjiKolicinu(kolicina);
		}
	}
		ulaz.close();

	}
}
