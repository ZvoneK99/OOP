package Zadatak2;
import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Vozilo> vozila = new ArrayList<>();
        Random random = new Random();

        // Generiranje 10 vozila
        for (int i = 0; i < 10; i++) {
            int tip = random.nextInt(3);
            switch (tip) {
                case 0 -> vozila.add(new OsobnoVozilo("Model" + i, "REG" + i, "Tip" + i, 5, 500));
                case 1 -> vozila.add(new PutnickiKombi("Model" + i, "REG" + i, 2.5, 5.0, 15));
                case 2 -> vozila.add(new TeretniKombi("Model" + i, "REG" + i, 2.5, 5.0, 15000));
            }
        }

        // Ispis vozila za prijevoz putnika
        System.out.println("Vozila za prijevoz putnika:");
        for (Vozilo v : vozila) {
            if (v.dohvatiMaksimalanBrojPutnika() > 0) {
                System.out.println(v);
            }
        }

        // Ispis vozila za prijevoz tereta
        System.out.println("\nVozila za prijevoz tereta:");
        for (Vozilo v : vozila) {
            if (v.dohvatiMaksimalnuNosivost() > 0) {
                System.out.println(v);
            }
        }
    }
}
