package Zadatak16;

public class Main {
	public static void main(String[]args) {
		 Agencija agencija = new Agencija();
		 
		Stan stan1 = new Stan("Ilica 1", 60, 2000, 3);
        Stan stan2 = new Stan("Vukovarska 12", 45, 1800, 2);
        Kuca kuca1 = new Kuca("Savska 5", 120, 1500, 2, true);
        Kuca kuca2 = new Kuca("Zagrebačka 15", 90, 1400, 1, false);
        PoslovniProstor ured1 = new PoslovniProstor("Trg bana Jelačića 3", 300, 2500, "Ured");
        PoslovniProstor trgovina1 = new PoslovniProstor("Ilica 55", 150, 2000, "Trgovina");
        LuksuznaNekretnina luksuzniStan = new LuksuznaNekretnina("Masarykova 8", 100, 5000, 3, 200000);
        LuksuznaNekretnina luksuznaKuca = new LuksuznaNekretnina("Pantovčak 10", 300, 8000, 3, 500000);
        Stan stan3 = new Stan("Radnička 24", 70, 1900, 3);
        Kuca kuca3 = new Kuca("Zelena ulica 10", 200, 1700, 2, true);
        
        agencija.dodajNekretninu(stan1);
        agencija.dodajNekretninu(stan2);
        agencija.dodajNekretninu(kuca1);
        agencija.dodajNekretninu(kuca2);
        agencija.dodajNekretninu(ured1);
        agencija.dodajNekretninu(trgovina1);
        agencija.dodajNekretninu(luksuzniStan);
        agencija.dodajNekretninu(luksuznaKuca);
        agencija.dodajNekretninu(stan3);
        agencija.dodajNekretninu(kuca3);
        
        System.out.println("--- Sve nekretnine ---");
        agencija.ispisNekretnina();
        
        System.out.println("\n--- Nekretnine vrste: Stan ---");
        agencija.filtrirajPoVrsti("Stan");
        
        System.out.println("\n--- Nekretnine vrste: Kuca ---");
        agencija.filtrirajPoVrsti("Kuca");
	}
}
