package Zadatak1;

import java.util.ArrayList;

public class Palindromm {
	UnosStringa rijec;
	ArrayList<UnosStringa> rijeci = new ArrayList<>();
	public boolean jeLiPalindrom(UnosStringa rijec) {
			UnosStringa originalnaRijec = rijec;
			UnosStringa obrnutiString = "";
			UnosStringa ika = "";
			for(int i=rijec.length()-1; i>=0; i--) {
				obrnutiString+=rijec.charAt(i);
			}
			if(obrnutiString.equals(rijec)) {
				rijeci.add(rijec);
			}
			return obrnutiString.equals(rijec);
			
	}

public static void main(UnosStringa[]args) {
		Palindromm p1 = new Palindromm();
		UnosStringa rijec = "ana";
		
		System.out.println(p1.jeLiPalindrom(rijec));
	}
}