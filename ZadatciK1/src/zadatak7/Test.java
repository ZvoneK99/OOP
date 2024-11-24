package zadatak7;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	public static void main(String[]args) {
		ArrayList<Racunalo> racunala = new ArrayList<>();
		
		  racunala.add(new Racunalo("HP", "Pavilion", "Intel i5", 8));
	      racunala.add(new Racunalo("Dell", "Inspiron", "AMD Ryzen 5", 16));
	      racunala.add(new Racunalo("Lenovo", "ThinkPad", "Intel i3", 4));
	      racunala.add(new Racunalo());

	      for(Racunalo r : racunala) {
	    	  r.ispisiDetalje();
	      }
	      //ispis racunala sa vise od 8gb rama
	      boolean pronadjen = false;
	      System.out.println("Racunala sa vise od 80GB rama su: ");
	      for(Racunalo r : racunala) {
	    	  if(r.ram>80) {
	    		  r.ispisiDetalje();
	    		  pronadjen = true;
	    	  }
	      }
	       if(!pronadjen) {
	    	  System.out.println("Nema pronađenih racunala.");
	      }
	      
	      //Sortiranje racunala po ramu:
	      racunala.sort(Comparator.comparing(Racunalo::getRam));
	      System.out.println("Racunala sortirana po RAM-u su: ");
	      for(Racunalo r : racunala) {
	    	  r.ispisiDetalje();
	      }
	      //Ispis racunala od nekog proizvođača
	      boolean imeProizvodjaca = false;
	      System.out.println("Računala od tog proizvođača.");
	      for(Racunalo r : racunala) {
	    	  if(r.getProizvodjac().equalsIgnoreCase("dell")) {
	    		  r.ispisiDetalje();
	    		  imeProizvodjaca = true;
	    	  }
	      }
	      if(!imeProizvodjaca){
    		  System.out.println("Nema računala od tog proizvođača.");
    	  }
	}
}
