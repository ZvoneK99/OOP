package Zadatak1;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        Random random = new Random();

        // 1. Kreiranje 50 putnika
        ArrayList<Putnik> putnici = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            int brojVoznji = random.nextInt(15) + 1; // Broj vožnji između 1 i 15
            putnici.add(new Putnik("Putnik " + i, brojVoznji));
        }

        // 2. Kreiranje 20 vožnji
        ArrayList<Voznja> voznje = new ArrayList<>();
        
        // 5 Lokalnih vožnji
        for (int i = 1; i <= 5; i++) {
            voznje.add(new LokalnaVoznja("Grad A", "Grad B", 50.0, "Model L-" + i));
        }

        // 10 Međugradskih vožnji
        for (int i = 1; i <= 10; i++) {
            voznje.add(new MedjugradskaVoznja("Grad X", "Grad Y", 100.0, "Model M-" + i));
        }

        // 5 Međunarodnih vožnji
        for (int i = 1; i <= 5; i++) {
            voznje.add(new MedjunarodnaVoznja("Država A", "Država B", 200.0, "Model N-" + i));
        }

        // 3. Dodavanje putnika u vožnje
        for (Putnik putnik : putnici) {
            // Randomiziraj vožnju
            int index = random.nextInt(voznje.size());
            Voznja voznja = voznje.get(index);

            // Pokušaj rezervirati sjedalo (ako uspije, dodaj prihod vožnji)
            voznja.rezervirajSjedalo(putnik, null); // Random sjedalo
        }

        // 4. Ispis rezultata
        for (Voznja voznja : voznje) {
            System.out.println(voznja.dajOsnovneInformacije());
            voznja.ispisiPopisPutnika();
            System.out.println("Ukupan prihod: " + voznja.getUkupanPrihod() + "\n");
        }
    }
}
