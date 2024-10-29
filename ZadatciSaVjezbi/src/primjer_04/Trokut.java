/*3.dio definirati klasu trokut koja ima 3 stranice i nakon sto instancirate trokut treba ispisati radi li se o jednakostranicnom 
 	jednakokracnom ili raznostranicnom trokutu*/

package primjer_04;

public class Trokut {
	double A;
	double B;
	double C;

	
	public Trokut(double A, double B, double C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public void kakavJeTrokut() {
		if(A==B && B==C) {
			System.out.println("Trokut je jednakostraničan.");
		}
		else if(A==B || A==C || B==C) {
			System.out.println("Trokut je jednakokračan.");
		}
		else if(A!=B && B!=C && A!=C) {
			System.out.println("Trokut je raznostraničan.");
		}
	}
	public static void main(String[]args) {
		Trokut t1 = new Trokut(1, 4, 6);	//raznostraničan
		Trokut t2 = new Trokut(4, 5, 4);	//jednakokračan
		Trokut t3 = new Trokut(5, 5, 5);	//jednakostraničan
		
		t1.kakavJeTrokut();
		t2.kakavJeTrokut();
		t3.kakavJeTrokut();
	}
}
