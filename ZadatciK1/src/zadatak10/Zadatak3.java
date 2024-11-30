package zadatak10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadatak3 {
	    public static void main(String[] args) {
	        Scanner ulaz = new Scanner(System.in);

	        // Formatter za unos datuma u formatu DD.MM.GGGG
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

	        LocalDate prviDatum = null, drugiDatum = null;

	        // Unos i provjera prvog datuma
	        while (prviDatum == null) {
	            System.out.println("Unesite prvi datum (DD.MM.GGGG):");
	            String unosPrvogDatuma = ulaz.nextLine();

	            try {
	                prviDatum = LocalDate.parse(unosPrvogDatuma, formatter);
	            } catch (DateTimeParseException e) {
	                System.out.println("Uneseni datum nije ispravan. Pokušajte ponovno.");
	            }
	        }

	        // Unos i provjera drugog datuma
	        while (drugiDatum == null) {
	            System.out.println("Unesite drugi datum (DD.MM.GGGG):");
	            String unosDrugogDatuma = ulaz.nextLine();

	            try {
	                drugiDatum = LocalDate.parse(unosDrugogDatuma, formatter);
	            } catch (DateTimeParseException e) {
	                System.out.println("Uneseni datum nije ispravan. Pokušajte ponovno.");
	            }
	        }

	        // Izračun razmaka između datuma
	        long razmakUDanima = ChronoUnit.DAYS.between(prviDatum, drugiDatum);

	        // Ispis rezultata
	        System.out.println("Razmak između datuma je: " + Math.abs(razmakUDanima) + " dana.");

	        ulaz.close();
	    }
	}
