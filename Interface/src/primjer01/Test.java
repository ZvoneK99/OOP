package primjer01;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<Uredaj> uredaji = new ArrayList<>();
		
		 	uredaji.add(new Televizor("Samsung", "QLED"));
	        uredaji.add(new Televizor("LG", "OLED"));
	        uredaji.add(new Radio(99.5));
	        uredaji.add(new Radio(101.2));
	        
	        for(Uredaj uredaj : uredaji) {
	        	uredaj.ukljuci();
	        	System.out.println("Je li uređaj uključen? " + uredaj.jeUkljucen());
	        	uredaj.iskljuci();
	        	System.out.println("Je li uređaj uključen? " + uredaj.jeUkljucen());
	        }
	}
}
