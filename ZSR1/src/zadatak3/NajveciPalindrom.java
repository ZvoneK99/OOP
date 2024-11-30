package zadatak3;

import java.util.Scanner;


public class NajveciPalindrom {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        // Unos rečenice
        System.out.println("Unesite rečenicu:");
        String recenica = ulaz.nextLine();

        // Filtriraj samo slova i pretvori u mala slova
        String samoSlova = recenica.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Pronađi najveći palindrom
        String najveciPalindrom = findNajveciPalindrom(samoSlova);

        // Ispis rezultata
        System.out.println("Najveći podstring koji je palindrom: " + najveciPalindrom);

        ulaz.close();
    }

    // Metoda za pronalazak najvećeg palindroma
    public static String findNajveciPalindrom(String str) {
        int maxLength = 0;
        String najveciPalindrom = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String podstring = str.substring(i, j);

                // Provjera je li podstring palindrom i je li dulji od trenutnog najvećeg
                if (isPalindrom(podstring) && podstring.length() > maxLength) {
                    maxLength = podstring.length();
                    najveciPalindrom = podstring;
                }
            }
        }
        return najveciPalindrom;
    }

    // Metoda za provjeru je li string palindrom
    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

