package VJEZBEFAKS2024;

import java.util.ArrayList;

public class ObjavljeneUtrke {
	public static ArrayList<Maratonac> p1 = new ArrayList<Maratonac>();
	public static ArrayList<Polumaratonac> p2 = new ArrayList<Polumaratonac>();
	public static ArrayList<Gradanin> p3 = new ArrayList<Gradanin>();
	
	public void dodajMaratonca(Maratonac m) {
		p1.add(m);
	}
	
	 public static void objaviUtrku1() {
	        System.out.println("Utrka 1: Maratonci s više od 5000 km:");
	        for (Maratonac m : p1) {
	            if (m.getDuzina() > 5000) {
	                System.out.println(m.odabranaDisciplina(m.getIme()));
	            }
	        }
	 }
}
