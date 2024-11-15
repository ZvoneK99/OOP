package zadatak04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
        
        // Dodavanje zaposlenika u listu
        zaposlenici.add(new Zaposlenik("Ivan", "Ivić", "Programer", 2018, 3000.0));
        zaposlenici.add(new Zaposlenik("Ana", "Anić", "Računovođa", 2012, 2500.0));
        zaposlenici.add(new Zaposlenik("Marko", "Marić", "Voditelj", 2010, 4500.0));
        zaposlenici.add(new Zaposlenik("Lucija", "Lucić", "Programer", 2019, 3200.0));
        zaposlenici.add(new Zaposlenik("Petar", "Perić", "Računovođa", 2015, 2700.0));
        zaposlenici.add(new Zaposlenik("Mia", "Matić", "Marketing", 2017, 2800.0));
        zaposlenici.add(new Zaposlenik("Sara", "Sarić", "Programer", 2020, 3100.0));
        zaposlenici.add(new Zaposlenik("Luka", "Lukić", "Voditelj", 2013, 4000.0));
        zaposlenici.add(new Zaposlenik("Tina", "Tinić", "Računovođa", 2011, 2600.0));
        zaposlenici.add(new Zaposlenik("Josip", "Josić", "Marketing", 2016, 2900.0));
        
        // Pronalaženje zaposlenika s najvećom plaćom
        Zaposlenik najvecaPlaca = zaposlenici.get(0);
        for (int i = 0; i < zaposlenici.size(); i++) {
            if (zaposlenici.get(i).placa > najvecaPlaca.placa) {
                najvecaPlaca = zaposlenici.get(i);
            }
        }
        System.out.println("Zaposlenik s najvećom plaćom je:");
        System.out.println(najvecaPlaca.toString());
        
        // Filtriranje zaposlenika koji su zaposleni prije određene godine
        int trazenaGodina = 2015;
        for (Zaposlenik z : zaposlenici) {
            if (z.godinaZaposlenja(trazenaGodina)) {
                System.out.println(z.ispisiImePrezime()+" je poceo raditi prije "+trazenaGodina+". godine.");
            } else {
               System.out.println(z.ispisiImePrezime()+" je počeo raditi nakon "+trazenaGodina+". godine.");
            }
        }
        double zbroj=0;
        System.out.println("Prosjecna placa za sve zaposlenike iznosi: ");
        for(Zaposlenik z : zaposlenici) {
        	zbroj+=z.placa;
        }
    	double prosjekPlaca = zbroj/zaposlenici.size();
        System.out.println(prosjekPlaca);
    }
}
