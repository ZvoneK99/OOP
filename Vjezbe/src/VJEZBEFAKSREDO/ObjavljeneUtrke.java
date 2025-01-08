package VJEZBEFAKSREDO;

import java.util.ArrayList;

public class ObjavljeneUtrke {
	public static ArrayList<Maratonac> p1 = new ArrayList<Maratonac>();
	public static ArrayList<Polumaratonac> p2 = new ArrayList<Polumaratonac>();
	public static ArrayList<Gradanin> p3 = new ArrayList<Gradanin>();
	
	public void dodajMaratonca(Prijava p) {
		if(p instanceof Maratonac) {
			p1.add((Maratonac)p);
		}
		else {
			System.out.println("Objekt nije tipa maratonac.");
		}
	}
	
	public static void objaviUtrku1() {
		for(Maratonac m : p1 ) {
			if(m.getDuzina() > 5000) {
				System.out.println(m.odabranaDisciplina(m.getIme()));
			}
		}
	}
}
