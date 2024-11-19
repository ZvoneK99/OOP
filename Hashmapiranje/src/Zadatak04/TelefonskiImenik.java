package Zadatak04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelefonskiImenik {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		HashMap<String, String> telefonskiImenik = new HashMap<>();
		
		telefonskiImenik.put("Ivan", "098-123-4567");
		telefonskiImenik.put("Ana", "091-987-6543");
		telefonskiImenik.put("Marko", "099-654-3210");
		telefonskiImenik.put("Lucija", "097-345-6789");
		telefonskiImenik.put("Petar", "095-111-2223");
		telefonskiImenik.put("Mia", "092-333-4444");
		telefonskiImenik.put("Sara", "093-555-6667");
		telefonskiImenik.put("Josip", "097-777-8888");
		telefonskiImenik.put("Luka", "098-999-0001");
		
		while(true) {
			
			System.out.println("1. Pretraži broj telefona");
			System.out.println("2. Dodaj novi kontakt");
			System.out.println("3. Obriši kontakt");
			System.out.println("4. Prikaži sve kontakte");
			System.out.println("5. Izlaz");
			
			int izbor = ulaz.nextInt();
			ulaz.nextLine();
			
			if(izbor==1) {
				System.out.println("Unesite ime za pretragu.");
				String ime = ulaz.nextLine();
				if(telefonskiImenik.containsKey(ime)) {
					System.out.println("Broj telefona za ime "+ime+" je: "+telefonskiImenik.get(ime));
				}
				else {
					System.out.println("Kontakt ne postoji.");
				}
				break;
			}
			else if(izbor==2) {
				System.out.println("Dodajte ime.");
				String novoIme = ulaz.nextLine();
				
				System.out.println("Dodajte broj telefona.");
				String noviBroj = ulaz.nextLine();
				
				telefonskiImenik.put(novoIme, noviBroj);
				
				System.out.println("Kontakt je uspješno dodan.");
				break;
			}
			else if(izbor==3) {
				System.out.println("Unesite ime kontakta za brisanje.");
				
				String imeZaBrisanje = ulaz.nextLine();
				
				if(telefonskiImenik.containsKey(imeZaBrisanje)) {
					telefonskiImenik.remove(imeZaBrisanje);
					System.out.println("Kontakt je uspješno obrisan.");
				}
				else {
					System.out.println("Kontakt ne postoji.");
				}
				break;
			}
			else if(izbor==4) {
				System.out.println("Svi kontakti:");
				for(Map.Entry<String, String> kontakt : telefonskiImenik.entrySet()) {
					System.out.println("Ime: "+kontakt.getKey()+" Broj: "+kontakt.getValue());
				}
				break;
			}
			else if(izbor==5) {
				System.out.println("Izlaz iz programa.");
				ulaz.close();
				return;
			}
			else {
				System.out.println("Pogrešan odabir. Pokušajte ponovno");
			}
		}
		ulaz.close();
	}
}
