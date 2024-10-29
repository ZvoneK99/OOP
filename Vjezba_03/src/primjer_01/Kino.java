package primjer_01;

public class Kino {
    private int kapacitet;
    private Film[] filmovi;
    private int brojFilmova;

    public Kino(int kapacitet) {
        this.kapacitet = kapacitet;
        this.filmovi = new Film[kapacitet];
        this.brojFilmova = 0;
    }

    public void dodajFilm(Film film) {
        if (brojFilmova < kapacitet) {
            filmovi[brojFilmova++] = film;
            System.out.println("Film " + film.getNaslov() + " je dodan u program.");
        } else {
            System.out.println("Nema slobodnog mjesta u programu.");
        }
    }

    public void ukloniFilm(String naslov) {
        for (int i = 0; i < brojFilmova; i++) {
            if (filmovi[i] != null && filmovi[i].getNaslov().equals(naslov)) {
                System.out.println("Film " + naslov + " je uklonjen iz programa.");
                
                // Pomakni elemente niza unazad
                for (int j = i; j < brojFilmova - 1; j++) {
                    filmovi[j] = filmovi[j + 1];
                }
                filmovi[--brojFilmova] = null;
                return;
            }
        }
        System.out.println("Film s naslovom " + naslov + " nije pronađen.");
    }

    public void ispisiSveFilmove() {
        System.out.println("---------- Program kina -----------");
        for (int i = 0; i < brojFilmova; i++) {
            filmovi[i].ispisiDetalje();
        }
    }

    public static void main(String[] args) {
        Kino kino = new Kino(3);

        Film film1 = new Film("Titanic", "Drama", 195);
        Film film2 = new Film("Inception", "Sci-Fi", 148);
        Film film3 = new Film("Matrix", "Akcija", 136);

        kino.dodajFilm(film1);
        kino.dodajFilm(film2);
        kino.dodajFilm(film3);

        kino.ispisiSveFilmove();
        
        kino.ukloniFilm("Inception");
        kino.ispisiSveFilmove();
    }
}
