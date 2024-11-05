package primjer_02;

public class TestBiblioteka {
    public static void main(String[] args) {
        // Kreiranje knjiga
        Knjiga knjiga1 = new Knjiga("Mali Princ", "Antoine de Saint-Exupery", 1943);
        Knjiga knjiga2 = new Knjiga("1984", "George Orwell", 1949);

        // Kreiranje članova
        ClanBiblioteke clan1 = new ClanBiblioteke("Ivan", "Ivić");
        ClanBiblioteke clan2 = new ClanBiblioteke("Ana", "Anić");

        // Kreiranje biblioteke i dodavanje knjiga i članova
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.dodajKnjigu(knjiga1);
        biblioteka.dodajKnjigu(knjiga2);
        biblioteka.dodajClana(clan1);
        biblioteka.dodajClana(clan2);

        // Posudba knjiga
        biblioteka.posudiKnjigu(clan1, knjiga1);  // Uspješna posudba
        biblioteka.posudiKnjigu(clan2, knjiga1);  // Neuspješna posudba jer je knjiga već posuđena

        // Ispis posuđenih knjiga za svakog člana
        clan1.ispisiPosudjeneKnjige();
        clan2.ispisiPosudjeneKnjige();
    }
}
