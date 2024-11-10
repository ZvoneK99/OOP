package primjer02;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String ime;
    String prezime;
    String brojIndeksa;
    int godinaStudija;
    ArrayList<Kolegij> kolegiji;
    ArrayList<Ispit> ispiti;

    // Konstruktor
    public Student(String ime, String prezime, String brojIndeksa, int godinaStudija) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
        this.kolegiji = new ArrayList<>();
        this.ispiti = new ArrayList<>();
    }

    // Dodavanje ispita u ArrayList
    public void dodajIspit(Ispit ispit) {
        ispiti.add(ispit);
        System.out.println("Ispit " + ispit.nazivKolegija + " je uspješno dodan.");
        System.out.println("-----------------------------");
    }

    // Ispis detalja ispita
    public void ispisiSveIspite() {
        System.out.println("Ispiti koje je student polagao:");
        for (Ispit ispit : ispiti) {
            ispit.ispisiDetaljeIspita();
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Zvone", "Kozul", "1743/rr", 3);
        Scanner ulaz = new Scanner(System.in);

        // Dodavanje ispita
        System.out.println("Koliko ispita želite unijeti?");
        int brojIspita = ulaz.nextInt();
        ulaz.nextLine(); // Očisti buffer

        for (int i = 0; i < brojIspita; i++) {
            System.out.println("Unesite naziv kolegija za ispit:");
            String nazivKolegija = ulaz.nextLine();

            System.out.println("Unesite datum ispita (npr. 21.prosinca.2024):");
            String datum = ulaz.nextLine();

            System.out.println("Unesite rezultat ispita (ocjena):");
            int rezultat = ulaz.nextInt();
            ulaz.nextLine(); // Očisti buffer

            // Kreiraj ispit i dodaj ga studentu
            Ispit ispit = new Ispit(nazivKolegija, datum, rezultat);
            s1.dodajIspit(ispit);
        }

        // Ispis svih ispita
        s1.ispisiSveIspite();

        ulaz.close();
    }
}
