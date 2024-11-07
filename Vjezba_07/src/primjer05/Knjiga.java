package primjer05;

import java.util.ArrayList;
import java.util.Scanner;

public class Knjiga {
	String naslov;
	String autor;
	int godinaIzdanja;
	
	public Knjiga(String naslov, String autor, int godinaIzdanja) {
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
	}

	public void ispisiDetalje() {
		System.out.println("Naslov knjige je "+naslov+".");
		System.out.println("Autor knjige "+naslov+" je "+autor+".");
		System.out.println("Godina izdanja knjige "+naslov+" je "+godinaIzdanja+".");
	}
	public static void unesiKnjige(ArrayList<Knjiga> knjige) {
		Scanner ulaz = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("Unesite naslov knjige");
			String naslov = ulaz.nextLine();
			
			System.out.println("Unesite ime autora");
			String autor = ulaz.nextLine();
			
			System.out.println("Unesite godinu izdanja");
			int godinaIzdanja = ulaz.nextInt();
			ulaz.nextLine();
			System.out.println("-----------------------------");
			knjige.add(new Knjiga(naslov, autor, godinaIzdanja));
		}
	}
	public static void ispisKnjiga(ArrayList<Knjiga>knjige) {
		System.out.println("Detalji o knjigama");
		for(Knjiga k : knjige) {
			k.ispisiDetalje();
		}
	}
	public static void pronađiKnjigu(int godinaIzdanja, ArrayList<Knjiga> knjige) {
		boolean postojiKnjiga = false;
		System.out.println("Knjige izdane nakon "+godinaIzdanja+". godine su:");
		for(Knjiga k : knjige) {
			if(k.godinaIzdanja > godinaIzdanja) {
				System.out.println(k.naslov);
				postojiKnjiga = true;
				System.out.println("-----------------------------");

			}			
		}
		if(!postojiKnjiga) {
			System.out.println("Nema knjiga izdanih nakon "+godinaIzdanja+". godine");

		}
	}
	public static void main(String[]args) {
		ArrayList<Knjiga> knjige = new ArrayList<>();
		unesiKnjige(knjige);
		ispisKnjiga(knjige);
		pronađiKnjigu(1990, knjige);
		
	}
}
