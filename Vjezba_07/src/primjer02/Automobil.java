package primjer02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
public class Automobil {
	String marka;
	String model;
	int godinaProizvodnje;
	
	public Automobil(String marka, String model, int godinaProizvodnje) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public static void unosAutomobila(ArrayList<Automobil> automobili) {
		for(int i=0; i<5; i++) {
			Scanner ulaz = new Scanner(System.in);
			System.out.println("Unesite marku automobila:");
			String marka = ulaz.nextLine();
			
			System.out.println("Unesite model automobila: ");
			String model = ulaz.nextLine();
			
			System.out.println("Unesite godinu proizvodnje: ");
			int godina = ulaz.nextInt();
			ulaz.nextLine();
			
			automobili.add(new Automobil(marka, model, godina));
		}
	}
	public static void poredajAutomobile(ArrayList<Automobil> automobili) {
		automobili.sort(Comparator.comparingInt(a -> -a.godinaProizvodnje));
		}
	public static void main(String[] args) {
        ArrayList<Automobil> automobili = new ArrayList<>();
        unosAutomobila(automobili);
        poredajAutomobile(automobili);

        System.out.println("Automobili sortirani od najnovijeg do najstarijeg:");
        for (Automobil a : automobili) {
            System.out.println(a.marka + " " + a.model + " " + a.godinaProizvodnje);
        }
    }
	}
