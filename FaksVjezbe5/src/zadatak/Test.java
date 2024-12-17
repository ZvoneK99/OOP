package zadatak;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	
        Scanner ulaz = new Scanner(System.in);
        
        Proceduralni procedura = new Proceduralni(0);
        Objektni objekt = new Objektni(0);
        Funkcionalni funkcija = new Funkcionalni(0);

        System.out.print("Postotak za proceduralne jezike: ");
        procedura.setPostotak(ulaz.nextDouble());

        System.out.print("Postotak za objektne jezike: ");
        objekt.setPostotak(ulaz.nextDouble());

        System.out.print("Postotak za funkcionalne jezike: ");
        funkcija.setPostotak(ulaz.nextDouble());

        double ukupno = procedura.getPostotak() + objekt.getPostotak() + funkcija.getPostotak();

        if (ukupno != 100) {
            System.out.println("Pogresan unos. Prilagodi postotke.");
            
            double noviDio = 100 / ukupno;
            
            procedura.setPostotak(procedura.getPostotak() * noviDio);
            objekt.setPostotak(objekt.getPostotak() * noviDio);
            funkcija.setPostotak(funkcija.getPostotak() * noviDio);

        }

        if (procedura.getPostotak() > objekt.getPostotak() && procedura.getPostotak() > funkcija.getPostotak()) {
            System.out.println("Najzastupljeniji su proceduralni.");
        } else if (objekt.getPostotak() > funkcija.getPostotak()) {
            System.out.println("Najzastupljeniji su objektni.");
        } else {
            System.out.println("Najzastupljeniji su funkcionalni.");
        }
    }
}
