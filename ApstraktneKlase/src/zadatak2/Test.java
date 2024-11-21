
package zadatak2;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Racunalo> racunala = new ArrayList<>();

        // Dodavanje računala
        racunala.add(new StolnoRacunalo("Dell", "Optiplex 7070", new double[]{50, 20, 30}));
        racunala.add(new PrijenosnoRacunalo("HP", "Pavilion 15", 2.5));
        racunala.add(new PrijenosnoRacunalo("Lenovo", "ThinkPad X1", 1.8));

        // Iteracija i ispis
        for (Racunalo racunalo : racunala) {
            racunalo.ispisiDetalje();
            System.out.println("Prenosivost: " + racunalo.izracunajPrenosivost());
            System.out.println();
        }
    }
}
