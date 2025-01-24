package Zadatak18;

import java.util.ArrayList;

public class Clan extends Osoba {
	int brojClanskeIskaznice;
	ArrayList<String> posudeneKnjige;
	
	public Clan(int ID, String imePrezime, int brojClanskeIskaznice) {
		super(ID, imePrezime);
		this.brojClanskeIskaznice = brojClanskeIskaznice;
		this.posudeneKnjige = new ArrayList<String>();
	}
	public Clan(Clan c) {
		super(c);
		this.brojClanskeIskaznice = c.brojClanskeIskaznice;
		this.posudeneKnjige = new ArrayList<String>(c.posudeneKnjige);
	}
	public void dodajKnjigu(String knjiga) {
		posudeneKnjige.add(knjiga);
	}
	public void vratiKnjige() {
		for(String knjiga : posudeneKnjige) {
			System.out.println(knjiga);
		}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append("Broj clanske: ").append(brojClanskeIskaznice).append("Posudjene knjige ");
		for(String knjiga : posudeneKnjige) {
			sb.append(knjiga).append(" ");
		}
		return sb.toString();
		
	}
	
	
}
