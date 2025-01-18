package Zadatak3_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<Dogadjaj> dogadjaji = new ArrayList<>();

        try {
            // Unos broja događaja
            System.out.println("Koliko događaja želite unijeti?");
            int brojDogadjaja = ulaz.nextInt();
            ulaz.nextLine(); // Čišćenje buffera

            // Unos događaja
            for (int i = 0; i < brojDogadjaja; i++) {
                System.out.println("Unesite naziv događaja " + (i + 1) + ":");
                String naziv = ulaz.nextLine();

                System.out.println("Unesite datum događaja u formatu dd.MM.yyyy:");
                String unosDatuma = ulaz.nextLine();
                LocalDate datum = LocalDate.parse(unosDatuma, formatter);

                dogadjaji.add(new Dogadjaj(naziv, datum));
            }

            // Sortiranje događaja po datumu
            dogadjaji.sort(Comparator.comparing(Dogadjaj::getDatum));

            // Ispis događaja
            System.out.println("Sortirani događaji:");
            LocalDate danas = LocalDate.now();
            for (Dogadjaj dogadjaj : dogadjaji) {
                LocalDate datum = dogadjaj.getDatum();
                long razlikaDana = ChronoUnit.DAYS.between(danas, datum);
                String status = razlikaDana > 0
                        ? "Ostalo je " + razlikaDana + " dana."
                        : "Prošlo je " + Math.abs(razlikaDana) + " dana.";
                System.out.println(dogadjaj + " - " + status);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Pogrešan unos datuma. Molimo pokušajte ponovno.");
        } finally {
            ulaz.close();
        }
    }
}