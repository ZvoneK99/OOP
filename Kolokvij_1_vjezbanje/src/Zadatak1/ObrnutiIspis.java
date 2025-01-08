package Zadatak1;

import java.util.Scanner;

public class ObrnutiIspis {
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite rečenicu:");
        String recenica = ulaz.nextLine();

        String[] rijeci = recenica.split(" ");
        String obrnutaRecenica = "";
        String obrnuteRijeciURecenici = "";

        for (int i = rijeci.length - 1; i >= 0; i--) {
            obrnutaRecenica += rijeci[i] + " ";
            
            String obrnutaRijec = ""; // Resetiraj obrnutu riječ za svaku iteraciju
            for (int j = rijeci[i].length() - 1; j >= 0; j--) {
                obrnutaRijec += rijeci[i].charAt(j);
            }
            obrnuteRijeciURecenici += obrnutaRijec + " "; // Dodaj obrnutu riječ
        }

        System.out.println("Rečenica s obrnutim redoslijedom riječi:");
        System.out.println(obrnutaRecenica.trim());

        System.out.println("Rečenica s obrnutim riječima:");
        System.out.println(obrnuteRijeciURecenici.trim());

        ulaz.close();
    }
}
