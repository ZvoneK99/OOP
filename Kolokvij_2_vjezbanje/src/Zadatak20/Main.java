package Zadatak20;

public class Main {
	public static void main(String[]args) {
		Kompanija kompanija = new Kompanija();
		
		Menadzer menadzer1 = new Menadzer("Ana", "Horvat", 2013, 5000);
        Menadzer menadzer2 = new Menadzer("Luka", "Kovač", 2010, 7000);
        Radnik radnik1 = new Radnik("Marko", "Perić", 2018, 50);
        Radnik radnik2 = new Radnik("Ivana", "Marić", 2020, 45);
        Intern intern1 = new Intern("Iva", "Novak", 2023);
        Intern intern2 = new Intern("Petar", "Jurić", 2022);

        kompanija.dodajZaposlenika(menadzer1);
        kompanija.dodajZaposlenika(menadzer2);
        kompanija.dodajZaposlenika(radnik1);
        kompanija.dodajZaposlenika(radnik2);
        kompanija.dodajZaposlenika(intern1);
        kompanija.dodajZaposlenika(intern2);
        
        kompanija.ispisiSveZaposlenike();
        System.out.println("-------------------------");
        kompanija.filtrirajPoVrsti("menadžer");
        System.out.println("-------------------------");
        kompanija.filtrirajPoVrsti("radnik");
        System.out.println("-------------------------");
        kompanija.filtrirajPoVrsti("intern");
        System.out.println("-------------------------");
        kompanija.najplacenijiZaposlenik();
        System.out.println("-------------------------");
        kompanija.ukupnaPlaca();
	}

}
