package forEach_02;

public class forEach_02 {
	public static void main(String[]args) {

	int[] nizBrojeva = {1,2,3};
	int zbroj=0;
	for (int i : nizBrojeva) {
		zbroj+=i;

		}
	System.out.print("Zbroj brojeva je: "+zbroj);
	}	
}
