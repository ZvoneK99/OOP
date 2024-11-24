package primjer04;

public class GlavniProgram {
    public static void main(String[] args) {
        Tocka2D T1 = new Tocka2D("A", 3, 4);
        Tocka2D T2 = new Tocka2D("B", 7, 1);

        // Udaljenost (instancijska metoda)
        System.out.println("Udaljenost između " + T1 + " i " + T2 + " je " + T1.udaljenost(T2));

        // Udaljenost (statična metoda)
        System.out.println("Udaljenost (statično) između " + T1 + " i " + T2 + " je " +
                           Tocka2D.udaljenost(T1, T2));

        // Polovište
        Tocka2D P = Tocka2D.poloviste(T1, T2);
        System.out.println("Polovište između " + T1 + " i " + T2 + " je " + P);
    }
}
