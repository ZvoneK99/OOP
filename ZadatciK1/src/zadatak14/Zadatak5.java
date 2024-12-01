package zadatak14;

public class Zadatak5 {
	public static void main(String[]args) {
		Matrica m1 = new Matrica(2, 2);
		Matrica m2 = new Matrica(2, 2);
		Matrica m3 = new Matrica(2, 2);
		Matrica m4 = new Matrica(3, 2);
		Matrica m5 = new Matrica(2, 3);
		
		// Postavljanje elemenata za m1
        m1.M[0][0] = 1; m1.M[0][1] = 2;
        m1.M[1][0] = 3; m1.M[1][1] = 4;

        // Postavljanje elemenata za m2
        m2.M[0][0] = 5; m2.M[0][1] = 6;
        m2.M[1][0] = 7; m2.M[1][1] = 8;

        // Postavljanje elemenata za m3
        m3.M[0][0] = 2; m3.M[0][1] = 4;
        m3.M[1][0] = 6; m3.M[1][1] = 8;

        // Postavljanje elemenata za m4 (3x2 matrica)
        m4.M[0][0] = 1; m4.M[0][1] = 2;
        m4.M[1][0] = 3; m4.M[1][1] = 4;
        m4.M[2][0] = 5; m4.M[2][1] = 6;

        // Postavljanje elemenata za m5 (2x3 matrica)
        m5.M[0][0] = 1; m5.M[0][1] = 2; m5.M[0][2] = 3;
        m5.M[1][0] = 4; m5.M[1][1] = 5; m5.M[1][2] = 6;
     // Ispis svake matrice
        System.out.println("Matrica m1:");
        System.out.println(m1);

        System.out.println("Matrica m2:");
        System.out.println(m2);

        System.out.println("Matrica m3:");
        System.out.println(m3);

        System.out.println("Matrica m4:");
        System.out.println(m4);

        System.out.println("Matrica m5:");
        System.out.println(m5);
        
        Matrica zbrojena1 = Matrica.zbroji(m1, m2);
        if(zbrojena1 != null) {
        	System.out.println("Rezultat zbrajanja m1 i m2: ");
        	System.out.println(zbrojena1);
        }
        else {
            System.out.println("Zbrajanje m1 i m2 nije moguće.");
        }
        Matrica zbrojena2 = Matrica.zbroji(m1, m3);
        if (zbrojena2 != null) {
            System.out.println("Rezultat zbrajanja m1 i m3:");
            System.out.println(zbrojena2);
        } else {
            System.out.println("Zbrajanje m1 i m3 nije moguće.");
        }

        // Pokušaj zbrajanja matrica različitih dimenzija
        Matrica zbrojenaRazlicita = Matrica.zbroji(m4, m5);
        if (zbrojenaRazlicita == null) {
            System.out.println("Zbrajanje m4 i m5 nije moguće zbog različitih dimenzija.");
        }
	}
}
