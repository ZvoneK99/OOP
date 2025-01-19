package Zad2slicno2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Knjiga> knjige = new ArrayList<>();

        Beletristika b1 = new Beletristika("Na Drini ćuprija", "Ivo Andrić", "Povijesni roman", 300);
        Beletristika b2 = new Beletristika("Ana Karenjina", "Lav Tolstoj", "Klasik", 850);
        NaucnaKnjiga n1 = new NaucnaKnjiga("Relativnost", "Albert Einstein", "Fizika", 500);
        NaucnaKnjiga n2 = new NaucnaKnjiga("Porijeklo vrsta", "Charles Darwin", "Biologija", 200);
        Beletristika b3 = new Beletristika("Zločin i kazna", "Fjodor Dostojevski", "Klasik", 600);

        knjige.add(b1);
        knjige.add(b2);
        knjige.add(b3);
        knjige.add(n1);
        knjige.add(n2);

        // Posuđivanje knjiga
        b1.posudiKnjigu();
        b2.posudiKnjigu();
        n1.vratiKnjigu(); // Ovo vraćanje neće imati efekta jer je knjiga već dostupna

        // Ispis dostupnih knjiga
        System.out.println("Dostupne knjige:");
        for (Knjiga k : knjige) {
            if (k.isDostupna()) { // Provjerava je li knjiga dostupna
                System.out.println(k);
            }
        }

        // Ispis posuđenih knjiga
        System.out.println("\nPosuđene knjige:");
        for (Knjiga k : knjige) {
            if (!k.isDostupna()) { // Provjerava je li knjiga posuđena
                System.out.println(k);
            }
        }
    }
}
