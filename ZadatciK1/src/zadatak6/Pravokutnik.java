package zadatak6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Pravokutnik {
	double visina;
	double sirina;
	
	public Pravokutnik(double visina, double sirina) {
		this.visina = visina;
		this.sirina = sirina;
		
	}
	public double izracunajOpseg() {
		return 2*(visina+sirina);
	}
	public double izracunajPovrsinu() {
		return visina*sirina;
	}
	public void ispisiDetalje() {
		System.out.println("Visina: "+visina+", Širina: "+sirina+".");
	}
	
	
	public static void main (String[]args) {
		ArrayList<Pravokutnik> pravokutnici = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			
			System.out.println("Unesite prvu stranicu pravokutnika: "+(i+1));
			double visina = ulaz.nextDouble();
			
			System.out.println("Unesite drugu stranicu pravokutnika: "+(i+1));
			double sirina = ulaz.nextDouble();
			ulaz.nextLine();
			
			Pravokutnik pravokutnik = new Pravokutnik(visina, sirina);
			pravokutnici.add(pravokutnik);
			}
		
		for(Pravokutnik p : pravokutnici) {
			System.out.println("Povrsina pravokutnika je: "+p.izracunajPovrsinu());
			System.out.println("Opseg pravokutnika je: "+p.izracunajOpseg());
		}
		
		Pravokutnik najveciPravokutnik = pravokutnici.get(0);
		System.out.println("Pravokutnik sa najvecom povrsinom je: ");
		for(int i=0; i<pravokutnici.size(); i++) {
			if(pravokutnici.get(i).izracunajPovrsinu()>najveciPravokutnik.izracunajPovrsinu()) {
				najveciPravokutnik = pravokutnici.get(i);
				najveciPravokutnik.ispisiDetalje();
			}
		}
		
	}
}
