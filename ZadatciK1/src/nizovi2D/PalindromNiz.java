package nizovi2D;

public class PalindromNiz {
	public static void main(String[]args) {
		char[] rijec = {'r', 'a', 'd', 'A', 'R'};
		
		for(int i=0; i<rijec.length; i++) {
			rijec[i] = Character.toLowerCase(rijec[i]);
		}
		boolean jePalindrom = true;
		
		for(int i = 0, j = rijec.length - 1; i < j; i++, j--) {
			
			if(rijec[i] != rijec[j]) {
				jePalindrom = false;
				break;
			}
		}
		if(jePalindrom) {
			System.out.println("Palindrom"); 
		}
		else {
			System.out.println("Nije palindrom.");
		}
	}
}
