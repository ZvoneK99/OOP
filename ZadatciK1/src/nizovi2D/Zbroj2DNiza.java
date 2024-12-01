package nizovi2D;

public class Zbroj2DNiza {
	public static void main(String[]args) {
		int[][] Niz2D = {
				{3,1,2},
				{2,4,-10},
				{3,5,-2}
				};
		int zbroj=0;
		for(int i=0; i<Niz2D.length; i++) {
			for(int j=0; j<Niz2D[i].length; j++) {
				zbroj+=Niz2D[i][j];
			}
		}
		System.out.println(zbroj);
	}
}
