package primjer11;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Lista životinja
        ArrayList<Zivotinja> zivotinje = new ArrayList<>();
        zivotinje.add(new Pas("Rex"));
        zivotinje.add(new Macka("Mica"));
        zivotinje.add(new Pas("Max"));
        zivotinje.add(new Macka("Luna"));

        // Polimorfizam: Poziv metode oglasiSe za sve životinje
        System.out.println("Oglasavanje životinja:");
        for (Zivotinja zivotinja : zivotinje) {
            zivotinja.oglasiSe();
        }

        // Poziv metode igrajSe za kućne ljubimce
        System.out.println("\nIgra kućnih ljubimaca:");
        for (Zivotinja zivotinja : zivotinje) {
            if (zivotinja instanceof KucniLjubimac) {
                ((KucniLjubimac) zivotinja).igrajSe();
            }
        }
    }
}
