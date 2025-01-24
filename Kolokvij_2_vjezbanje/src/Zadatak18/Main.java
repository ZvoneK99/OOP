package Zadatak18;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Osoba> osobe = new ArrayList<>();

        // Unos za 5 članova
        for (int i = 0; i < 5; i++) {
            System.out.println("Unos za člana " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Potroši \n
            System.out.print("Ime i prezime: ");
            String imePrezime = scanner.nextLine();
            System.out.print("Broj članske iskaznice: ");
            int brojClanskeIskaznice = scanner.nextInt();
            scanner.nextLine(); // Potroši \n

            Clan clan = new Clan(id, imePrezime, brojClanskeIskaznice);

            System.out.print("Koliko knjiga želite unijeti za ovog člana? ");
            int brojKnjiga = scanner.nextInt();
            scanner.nextLine(); // Potroši \n

            for (int j = 0; j < brojKnjiga; j++) {
                System.out.print("Unesite naziv knjige " + (j + 1) + ": ");
                String knjiga = scanner.nextLine();
                clan.dodajKnjigu(knjiga);
            }

            osobe.add(clan);
        }

        // Unos za 3 zaposlenika
        for (int i = 0; i < 3; i++) {
            System.out.println("Unos za zaposlenika " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Potroši \n
            System.out.print("Ime i prezime: ");
            String imePrezime = scanner.nextLine();
            System.out.print("Odjel: ");
            String odjel = scanner.nextLine();
            System.out.print("Broj godina radnog staža: ");
            int brojGodinaRadnogStaza = scanner.nextInt();
            scanner.nextLine(); // Potroši \n

            Zaposlenik zaposlenik = new Zaposlenik(id, imePrezime, odjel, brojGodinaRadnogStaza);
            osobe.add(zaposlenik);
        }

        // Ispis svih osoba
        System.out.println("\nIspis svih osoba:");
        for (Osoba osoba : osobe) {
        	System.out.println(osoba);
        }

        scanner.close();
    }
}
