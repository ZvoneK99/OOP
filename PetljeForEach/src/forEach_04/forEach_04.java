package forEach_04;

public class forEach_04 {
	public static void main(String[]args) {
		int[] nizBrojeva = {1,2,4,61,14,430,-3,4,99};
		int najvećiBroj=nizBrojeva[0];
		for(int i : nizBrojeva) {
			if(i>najvećiBroj) {
				najvećiBroj=i;
				
			}
		
		}
		System.out.println("Najveći broj u nizu je: "+najvećiBroj);
	}
}
