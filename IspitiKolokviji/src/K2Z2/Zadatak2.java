package K2Z2;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<CestovnoVozilo> vozila = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int vrsta = random.nextInt(5); // Broj izvedenih razreda
            switch (vrsta) {
                case 0:
                    vozila.add(new OsobnoVozilo("Model1", "Reg1", "Limuzina", 5, 450.0));
                    break;
                case 1:
                    vozila.add(new PutnickiKombi("Model2", "Reg2", 2.5, 4.2, 8));
                    break;
                case 2:
                    vozila.add(new TeretniKombi("Model3", "Reg3", 3.0, 5.0, 1200.0));
                    break;
                case 3:
                    vozila.add(new TeretnoVozilo("Model4", "Reg4", 4, 10.0));
                    break;
                case 4:
                    vozila.add(new Kombi("Model5", "Reg5", 3.5, 4.5) {
                        // Apstraktni razred - ne može biti instanciran direktno
                        @Override
                        public double dohvatiMaksimalnuNosivost() {
                            return 0;
                        }

                        @Override
                        public int dohvatiMaksimalanBrojPutnika() {
                            return 0;
                        }
                    });
                    break;
            }
        }

        System.out.println("Vozila pogodna za prijevoz putnika:");
        for (CestovnoVozilo vozilo : vozila) {
            if (vozilo.dohvatiMaksimalanBrojPutnika() > 0) {
                System.out.println(vozilo);
            }
        }

        System.out.println("\nVozila pogodna za prijevoz tereta:");
        for (CestovnoVozilo vozilo : vozila) {
            if (vozilo.dohvatiMaksimalnuNosivost() > 0) {
                System.out.println(vozilo);
            }
        }
    }
}
