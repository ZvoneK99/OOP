package zadatak;


public class Zadatak {
	public static void main(String[]args) {
		StolnoRacunalo sr = new StolnoRacunalo("lifebook", "Fujitsu", "Windows", 30, 20, 15);
		PrijenosnoRacunalo pr = new PrijenosnoRacunalo("One", "HP", "Windows", 5000, 1.4);
		Netbook n = new Netbook("tablet", "Samsung", "Linux", 3000, 1);
		
		System.out.println(sr);
		System.out.println("----------------------");
		System.out.println(pr);
		System.out.println("-----------------------");
		System.out.println(n);
	}
}

/*definirati apsktaktni razred racunala te razrede stolno racunalo i prijenosno racunalo koji nasljeđuju racunalo
klasa racunalo sadrzi sljedece podatkovne clanove: model, proizvođač i operacijski sustav(stringovi)
stolno racunalo dodatno sadrzi podatkovne clanove za zapis dimenzija kucista,a to je niz od 3 realna broja(visina, 
sirina dubina)
dok prijenosno racunalo sadrzi podatkovne clanove za zapis podataka o kapacitetu baterije(int) i 
tezine racunala(realni broj)
apstraktni razred racunalo sadrzi sljedece apstraktne metode: 
dohvatiTipRacunala bez ulaznih parametara
koja vraca tekstualn podatak o vrsti racunala tj. stolno ili prijenosno racunalo
metodu: izracunajPrenosivost bez ulaznih parametara i vraca cjelobrojni podatak o kategoriji prenosivosti uređaja
i to na nacin da za prijenosno racunalo vraca njihovu tezinu zaokruzenu na cijeli broj, a za stolna racunala
racuna po formuli 5+volumen kucista/30

definirati razred Netbook koja nasljeđuje prijenosno racunalo 
metoda izracunajPrenosivost u ovom razredu uvijek vraca 1
a metoda dohvati tip racunala vraca "Netbook prijenosno racunalo" koristeci metodu nadređenog razreda
dodatno je potrebno onemoguciti daljnje nasljeđivanje razreda Netbook(final)

napisati konstruktore za sve razrede pri cemu konstruktori izvedenih razreda koriste konstruktor osnovnog razreda
napisati get i set metode za sve podatkovne clanove te preopteretiti metodu toString u svim razredima
definirati razred Zadatak koji sadrzi metodu main u kojoj ce se inicijalizirati po jedan objekt svakog od navedenih razreda
i prikazati sve ostvarene funkcionalnosti

Zvonimir Kozul 1743/rr-np

*/