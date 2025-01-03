package ZSR1;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String unos = ulaz.nextLine();

        String samoSlova = unos.replaceAll("[^a-zA-Z]", "");
        String string = samoSlova.toLowerCase();

        String najveciPalindrom = "";

        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                String subString = string.substring(i, j + 1);
                if (isPalindrome(subString) && subString.length() > najveciPalindrom.length()) {
                    najveciPalindrom = subString;
                }
            }
        }

        System.out.println("Najveći palindrom u rečenici je: " + najveciPalindrom);

        ulaz.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Ako znakovi nisu isti, nije palindrom
            }
            left++;
            right--;
        }
        return true; // Ako su svi znakovi isti, string je palindrom
    }
}
