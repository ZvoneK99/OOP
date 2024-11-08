package primjer13;

import java.util.ArrayList;
import java.util.Scanner;

public class Osoba {
	String ime;
	String prezime;
	int godinaRodjenja;
	
	public Osoba(String ime, String prezime, int godinaRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}
	public void ispisiDetalje() {
        System.out.println("Ime: " + ime + ", Prezime: " + prezime + ", Godina rođenja: " + godinaRodjenja);
    }
}
	class Test {
		ArrayList<Osoba> osobe;
		public Test() {
			this.osobe = new ArrayList<>();
		}
		public static void main(String[]args) {
				ArrayList<Osoba> osobe = new ArrayList<>();
				System.out.println("-----Podatci o osobama:-----");
				Scanner ulaz = new Scanner(System.in);
				
				for(int i=0; i<3; i++) {
					System.out.println("Unesite ime osobe: ");
					String ime = ulaz.nextLine();
					
					System.out.println("Unesite prezime osobe: ");
					String prezime = ulaz.nextLine();
					
					System.out.println("Unesite godinu rođenja");
					int godinaRodjenja = ulaz.nextInt();
					ulaz.nextLine();
					
					osobe.add(new Osoba(ime, prezime, godinaRodjenja));
				}
				System.out.println("Ispis osoba:");
				for(Osoba o : osobe) {
					o.ispisiDetalje();
				}
				ulaz.close();
		}	
		
	}


