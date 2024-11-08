package primjer10;

public class Test {
    public static void main(String[] args) {
        // Kreiraj tečajeve
        Tecaj tecaj1 = new Tecaj("Java Programiranje", 40);
        Tecaj tecaj2 = new Tecaj("Web Razvoj", 30);
        Tecaj tecaj3 = new Tecaj("Osnove Baze Podataka", 20);

        // Kreiraj polaznike
        Polaznik p1 = new Polaznik("Ana", "Anić", 1001);
        Polaznik p2 = new Polaznik("Ivan", "Ivić", 1002);
        Polaznik p3 = new Polaznik("Marko", "Markić", 1003);
        Polaznik p4 = new Polaznik("Lucija", "Lucić", 1004);

        // Dodaj polaznike na tečajeve
        tecaj1.dodajPolaznika(p1);
        tecaj1.dodajPolaznika(p2);
        tecaj2.dodajPolaznika(p3);
        tecaj3.dodajPolaznika(p4);

        // Kreiraj institut i dodaj tečajeve
        Institut institut = new Institut();
        institut.dodajTecaj(tecaj1);
        institut.dodajTecaj(tecaj2);
        institut.dodajTecaj(tecaj3);

        // Testiranje metoda
        System.out.println("Prikaz svih tečajeva:");
        institut.prikaziSveTecaje();

        System.out.println("\nPrikaz polaznika za tečaj 'Java Programiranje':");
        institut.prikaziPolaznikeZaTecaj("Java Programiranje");

        System.out.println("\nPrikaz polaznika za tečaj 'Web Razvoj':");
        institut.prikaziPolaznikeZaTecaj("Web Razvoj");

        System.out.println("\nPrikaz polaznika za tečaj 'Osnove Baze Podataka':");
        institut.prikaziPolaznikeZaTecaj("Osnove Baze Podataka");

        // Uklanjanje polaznika i ponovno ispisivanje tečajeva
        System.out.println("\nUklanjanje polaznika s ID-om 1002 iz tečaja 'Java Programiranje':");
        tecaj1.ukloniPolaznika(1002);
        institut.prikaziPolaznikeZaTecaj("Java Programiranje");
    }
}
