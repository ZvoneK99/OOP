package Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        Automobil auto = new Automobil(4, "benzin");
        Bicikl bicikl = new Bicikl(2, "cestovno");
        Kamion kamion = new Kamion(6, 30);
        System.out.println("auto");
        auto.pokreni();
        auto.ispisi();
        auto.zaustavi();
        auto.ispisi();
        System.out.println("-------------");
        
        System.out.println("Bicikl");
        bicikl.pokreni();
        bicikl.ispisi();
        bicikl.zaustavi();
        bicikl.ispisi();
        System.out.println("-------------");
        
        System.out.println("Kamion");
        kamion.pokreni();
        kamion.ispisi();
        kamion.zaustavi();
        kamion.ispisi();
    }
}

/*Napisati program za upravljanje razlicitim vrstama vozila. 
Svako vozilo ima osnovne karakteristike poput brzine i broja kotaca, a implementirat cemo iduce klase automobil, bicikl i kamion.
Kreirati sučelje IVozilo  koje definira sljedece metode, pokreni, zaustavi, ispisi(ispoisuje informacije)
Potrebno je definirati apstraktnu klasu Vozilo koja implementira prethodno definirano sučelje i definira zajednicke atribute
za sve vrste vozila brzina i brojKotaca(int su oba)
Ova klasa ima iduce metode pokreni, zaustavi ispisi
potrbno je kreirati sljedece klase automobil, bicikl i kamion
klasa Automobil ima dodatne atribute tipMotora(string), i metodu ispisi(podatke)
klasa Bicikl ima dodatni atribut tipBicikla(cestovno, brdsko...) i metodu ispisi(podatke)
klasa Kamion ima dodatni atribut nosivost(double) i metodu ispisi(podatke)
kreirati testnu klasu u kojoj cemo instancirati objekte klasa te pozvati sve metode za svaki objekt
metoda pokreni postavlja brzinu i ispisuje da je vozilo pokrenuto
metoda zaustavi postavlja brzinu na 0 i ispisuje da je vozilo zaustavljeno
metoda ispisi ispisuje informacije o vozilu*/