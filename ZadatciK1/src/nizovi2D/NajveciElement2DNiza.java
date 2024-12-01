package nizovi2D;

public class NajveciElement2DNiza {
	public static void main(String[]args) {
		int[][] Niz2D = {
				{3,4,2},
				{2,42,-10},
				{3,51,-2}
				};
		int max=Niz2D[0][0];
		for(int i=0; i<Niz2D.length; i++) {
			for(int j=0; j<Niz2D[i].length; j++) {
				if(Niz2D[i][j]>max) max=Niz2D[i][j];
			}
		}
		System.out.println(max);
	}
}
