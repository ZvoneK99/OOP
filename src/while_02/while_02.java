//ispis zbroja parnih brojeva od 1 do 20 sa while petljom
package while_02;

public class while_02 {

	public static void main(String[]args) {
		int zbroj=0;
		int broj=1;
		
		while(broj<=20) {
			if(broj%2==0) {
				zbroj+=broj;
				
			}
			broj++;
		}
		System.out.println("Zbroj parnih brojeva je:"+zbroj);
	}
}
