package ZAD2;

public class Main {
    public static void main(String[] args) {
        // Kreiranje objekata izvedenih klasa
        StopaA stopaA = new StopaA();
        StopaE stopaE = new StopaE();

        // Ispis početnih vrijednosti
        System.out.println("Stopa A:");
        System.out.println(stopaA);

        System.out.println("Stopa E:");
        System.out.println(stopaE);

        // Promjena visine stope za StopaA
        stopaA.promjeniVisinuStope(1, 19.5);
        System.out.println("Stopa A nakon promjene:");
        System.out.println(stopaA);

        // Resetiranje visina za StopaA
        stopaA.resetirajVisineStope();
        System.out.println("Stopa A nakon resetiranja:");
        System.out.println(stopaA);
    }
}
