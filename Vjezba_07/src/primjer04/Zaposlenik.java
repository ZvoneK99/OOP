package primjer04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
public class Zaposlenik {
	String ime;
	String prezime;
	double placa;
	
	public Zaposlenik(String ime, String prezime, double placa) {
		this.ime = ime;
		this.prezime = prezime;
		this.placa = placa;
	}
	public static void unosZaposlenika(ArrayList<Zaposlenik> zaposlenici) {
		Scanner ulaz = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("Unesite ime: ");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime: ");
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite vašu plaću: ");
			double placa = ulaz.nextDouble();
			ulaz.nextLine();
			
			zaposlenici.add(new Zaposlenik(ime, prezime, placa));
			
		}
		ulaz.close();
	}
	public static void sortiranjeZaposlenika(ArrayList<Zaposlenik> zaposlenici) {
		zaposlenici.sort(Comparator.comparingDouble(a -> -a.placa));
	}
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		unosZaposlenika(zaposlenici);
		sortiranjeZaposlenika(zaposlenici);
		
		System.out.println("Zaposlenici sortirani po velicini place: ");
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z.ime+" "+z.prezime+" "+z.placa);
		}
		
	}
}
