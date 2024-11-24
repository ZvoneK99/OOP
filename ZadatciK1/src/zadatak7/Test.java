package zadatak7;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	public static void main(String[]args) {
		ArrayList<Racunalo> racunala = new ArrayList<>();
		
		racunala.add(new Racunalo("HP", "Pavilion", "Intel i5", 8));
        racunala.add(new Racunalo("Dell", "Inspiron", "AMD Ryzen 5", 16));

        // Dodavanje objekata klase Laptop
        racunala.add(new Laptop("Lenovo", "ThinkPad", "Intel i7", 16, 10));
        racunala.add(new Laptop("Apple", "MacBook Pro", "M1", 8, 20));
        
        
        for(Racunalo r : racunala) {
        	System.out.println(r.ispisiDetalje());
        }
	}
}
