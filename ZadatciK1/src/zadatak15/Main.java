package zadatak15;

public class Main {
	public static void main(String[]args) {
		MatricaOperacije matrica = new MatricaOperacije(3,3);
		
		System.out.println("Unesite elemente matrice");
		matrica.ucitajElemente();
		
		System.out.println("Unesena matrica:");
		System.out.println(matrica.toString());
		
		double[] zbrojevi = matrica.zbrojiRedke();
		 System.out.println("\nZbrojevi elemenata po redovima:");
	        for (int i = 0; i < zbrojevi.length; i++) {
	            System.out.println("Redak " + (i + 1) + ": " + zbrojevi[i]);
	        }
	     System.out.println(matrica.transponiraj());
	        
	}
}
