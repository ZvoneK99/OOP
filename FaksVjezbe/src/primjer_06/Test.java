package primjer_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>(10);
        Scanner ulaz = new Scanner(System.in);
        int brojPogresnihDatuma = 0; // Brojač za nevaljane datume
        
        for (int i = 1; i <=10; i++) {
            System.out.print("Unesite ime: ");
            String ime = ulaz.nextLine();
            
            System.out.print("Unesite prezime: ");
            String prezime = ulaz.nextLine();
            
            System.out.print("Unesite dan rođenja: ");
            int dan = ulaz.nextInt();
            
            System.out.print("Unesite mjesec rođenja: ");
            int mjesec = ulaz.nextInt();
            
            System.out.print("Unesite godinu rođenja: ");
            int godina = ulaz.nextInt();
            ulaz.nextLine(); // Čisti ulaz za sljedeći unos
            
            // Stvaramo objekt Datum
            Datum datumRođenja = new Datum(dan, mjesec, godina);
            
            // Provjeravamo je li datum valjan
            if (!datumRođenja.jeDatumValjan()) {
                System.out.println("Unijeli ste nevaljan datum. Molimo unesite ispravan datum.");
                brojPogresnihDatuma++;
                continue; 
            }
            
            Osoba osoba = new Osoba(ime, prezime, datumRođenja);
            osobe.add(osoba);
        }
        
        ulaz.close();
        
        osobe.sort((osoba1, osoba2) -> osoba1.datumRođenja.compareTo(osoba2.datumRođenja));
        
        // Ispis svih osoba
        System.out.println("Popis osoba od najstarije do najmlađe:");
        for (Osoba osoba : osobe) {
            osoba.ispisiDetalje();
            if (osoba.jePunoljetna()) {
                System.out.println("Osoba je punoljetna.");
            } else {
                System.out.println("Osoba nije punoljetna.");
            }
            System.out.println("-------------------------");
        }
        
        // Ispis broja osoba koje su unijele nevaljan datum
        System.out.println("Broj unosa s nevaljanim datumima: " + brojPogresnihDatuma);
    }
}
