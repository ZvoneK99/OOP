package projekt_05;

public class Test {
	
	    public static void main(String[] args) {
	        Videoteka videoteka = new Videoteka();

	        // Dodavanje filmova
	        Film film1 = new Film("Titanic", "Drama", 1997, true);
	        Film film2 = new Film("The Matrix", "Sci-Fi", 1999, true);
	        DokumentarniFilm dokFilm1 = new DokumentarniFilm("Planet Earth", "Dokumentarni", 2006, false, 60);

	        videoteka.dodajFilm(film1);
	        videoteka.dodajFilm(film2);
	        videoteka.dodajFilm(dokFilm1);

	        // Prikaz svih filmova
	        //System.out.println("Prikaz svih filmova:");
	        //videoteka.prikaziSveFilmove();

	        // Posudba i vraćanje filmova
	        System.out.println("\nPosudba filma 'Titanic':");
	        videoteka.posudiFilm("Titanic");

	        System.out.println("\nPrikaz dostupnih filmova:");
	        videoteka.prikaziDostupneFilmove();

	        System.out.println("\nVraćanje filma 'Titanic':");
	        videoteka.vratiFilm("Titanic");

	        // Traženje filma
	        System.out.println("\nTraženje filma 'The Matrix':");
	        videoteka.pronađiFilmPoNaslovu("The Matrix");
	    }
}
