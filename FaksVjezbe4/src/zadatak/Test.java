package zadatak;

public class Test {
    public static void main(String[] args) {
        Krug krug = new Krug(25.0, 15.0);          
        Pravokutnik pravokutnik = new Pravokutnik(40.0, 18.0); 
        Kvadrat kvadrat = new Kvadrat(16.0, 16.0);
        Kvadrat kvadrat2 = new Kvadrat(16.0, 16.0);	
       
        System.out.println("Krug " + krug);
        System.out.println("Pravokutnik " + pravokutnik);
        System.out.println("Kvadrat " + kvadrat);
        System.out.println("Kvadrat2 "+kvadrat2);
        
        System.out.println("Ukupno geometrijskih likova: " + GeometrijskiLik.getBrojacLikova());
    }
}



