package primjer02;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    ArrayList<Proizvod> proizvodi;

    public Test() {
        this.proizvodi = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
    		System.out.println("--------------------------");
            System.out.println("Unesite naziv proizvoda: ");
            String naziv = ulaz.nextLine();
            
            System.out.println("Unesite cijenu proizvoda: ");
            double cijena = ulaz.nextDouble();
            ulaz.nextLine(); // Čisti ulazni buffer
            
            System.out.println("Unesite kategoriju kojoj proizvod pripada: ");
            String kategorija = ulaz.nextLine();
            
            proizvodi.add(new Proizvod(naziv, cijena, kategorija));
    		System.out.println("--------------------------");

        }

        // Ispis svih proizvoda
		System.out.println("--------------------------");
        System.out.println("\nIspis svih proizvoda: ");
        for (Proizvod p : proizvodi) {
            p.ispisiDetalje();
        }

        // Pronalaženje proizvoda s najvišom cijenom
        Proizvod najskupljiProizvod = proizvodi.get(0);
        for (Proizvod p : proizvodi) {
            if (p.cijena > najskupljiProizvod.cijena) {
                najskupljiProizvod = p;
            }
        }
		System.out.println("--------------------------");
        // Ispis proizvoda s najvišom cijenom
        System.out.println("\nProizvod s najvišom cijenom: ");
        najskupljiProizvod.ispisiDetalje();
		System.out.println("--------------------------");
        System.out.println("Unesite kategoriju za pregled proizvoda: ");
        String trazenaKategorija = ulaz.nextLine();
		System.out.println("--------------------------");
        System.out.println("Proizvodi iz kategorije: "+trazenaKategorija);
        boolean pronadjenProizvod = false;
        
        for(Proizvod p : proizvodi) {
        	if(p.kategorija.equalsIgnoreCase(trazenaKategorija)) {
        		p.ispisiDetalje();
        		pronadjenProizvod = true;
        	}
        }
        if(!pronadjenProizvod) {
        	System.out.println("Nema proizvoda u kategoriji "+trazenaKategorija);
        }
		System.out.println("--------------------------");
        System.out.println("Unesite cijenu koju zelite da usporedimo sa proizvodima:");
        double mojaCijena = ulaz.nextDouble();
        for(Proizvod p : proizvodi) {
        	p.usporediCijene(mojaCijena);
        	p.ispisiDetalje();
        }
        ulaz.close(); // Zatvaranje Scanner-a
    }
}
