package Zadatak4_1;

import java.util.ArrayList;

public class Knjiga {
	String naslov;
	String autor;
	int godinaIzdanja;
	ArrayList<String> poglavlja;
	
	public Knjiga(String naslov, String autor, int godinaIzdanja) {
		this.naslov = naslov;
		this.autor = autor;
		this.godinaIzdanja = godinaIzdanja;
		this.poglavlja = new ArrayList<String>(3);
	}
	
	public void dodajPoglavlje(String poglavlje) {
		poglavlja.add(poglavlje);
	}
	public int brojPoglavlja() {
		return poglavlja.size();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Naslov: ").append("<").append(naslov).append(">\n");
		sb.append("Autor: ").append("<").append(autor).append(">\n");
		sb.append("Godina izdanja: ").append("<").append(godinaIzdanja).append(">\n");
		for(int i=0; i<poglavlja.size(); i++) {
			sb.append("<").append(poglavlja.get(i)).append(">");
			if(i<poglavlja.size()-1) {
				sb.append(", ");
			}
		}
		sb.append("\n");
		sb.append("Ukupan broj poglavlja: <").append(poglavlja.size()).append(">");
		return sb.toString();
	}
	
	public static void main(String[]args) {
		Knjiga k1 = new Knjiga("Lovac u žitu", "J.D.Salinger", 1950);
		
		k1.dodajPoglavlje("Uvod");
		k1.dodajPoglavlje("Prvo poglavlje");
		k1.dodajPoglavlje("Zaključak");

		System.out.println(k1);
	}
}
