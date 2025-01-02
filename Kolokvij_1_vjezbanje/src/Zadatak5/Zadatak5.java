package Zadatak5;

public class Zadatak5 {
    public static void main(String[] args) {
        // Stvaranje matrica
        Matrica m1 = new Matrica(3, 5);
        Matrica m2 = new Matrica(4, 2);
        Matrica m3 = new Matrica(5, 3);
        Matrica m4 = new Matrica(3, 5); // Ista dimenzija kao m1
        Matrica m5 = new Matrica(4, 2);

        // Popunjavanje matrica m1 i m4 (npr. s proizvoljnim vrijednostima)
        for (int i = 0; i < m1.brojRedaka; i++) {
            for (int j = 0; j < m1.brojStupaca; j++) {
                m4.M[i][j] = i + j + 1; // Npr. sumom indeksa
                m1.M[i][j] = (i + 1) * (j + 1); // Npr. proizvodom indeksa
            }
        }

        // Zbrajanje matrica m1 i m4
        Matrica zbroj = Matrica.zbroji(m1, m4);
        if (zbroj != null) {
            System.out.println("Zbroj matrica m1 i m4:");
            System.out.println(zbroj.toString());
        } else {
            System.out.println("Matrice nisu kompatibilne za zbrajanje.");
        }
    }
}
