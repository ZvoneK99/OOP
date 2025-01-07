package ZAD1;

import java.util.ArrayList;
import java.util.Random;

public class Kolokvij2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Generiranje putnika
        ArrayList<Putnik> sviPutnici = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            String imePrezime = "Putnik" + i;
            int brojVoznji = random.nextInt(25); // Nasumičan broj vožnji
            String status = brojVoznji < 10 ? "obicna" : (brojVoznji < 20 ? "zlatni" : "platinasti");
            sviPutnici.add(new Putnik(imePrezime, brojVoznji, status));
        }

        // Kreiranje 30 vožnji
        ArrayList<Voznja> sveVoznje = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            int tipVoznje = random.nextInt(3);
            if (tipVoznje == 0) {
                sveVoznje.add(new LokalnaVoznja("Mostar", "Čapljina", 10.0, 50, "BiH"));
            } else if (tipVoznje == 1) {
                sveVoznje.add(new MedjugradskaVoznja("Mostar", "Sarajevo", 20.0, 50, "BiH"));
            } else {
                sveVoznje.add(new MedjunarodnaVoznja("Mostar", "Zagreb", 50.0, 50, "Hrvatska"));
            }
        }

        // Dodjeljivanje putnika vožnjama
        for (Voznja voznja : sveVoznje) {
            int brojPutnika = random.nextInt(21) + 30; // 50-90% kapaciteta
            for (int i = 0; i < brojPutnika; i++) {
                Putnik putnik = sviPutnici.get(random.nextInt(sviPutnici.size()));
                voznja.prodajaKarata(putnik);
            }
        }

        // Ispis vožnji
        for (Voznja voznja : sveVoznje) {
            System.out.println(voznja.dajOsnovneInformacije());
            System.out.println(voznja.ispisiPopisPutnika());
            System.out.println("Ukupno putnika: " + voznja.getPopisPutnika().size());
            System.out.println();
        }

        System.out.println("Ukupan prihod: " + Voznja.getUkupniPrihod());
    }
}
