package primjer_02;

import java.util.ArrayList;
public class ZoloskiVrt {
	private ArrayList<Zivotinja> zivotinje;
	
	public ZoloskiVrt() {
		this.zivotinje = new ArrayList<>();
	}
	public void dodajZivotinju(Zivotinja z) {
		zivotinje.add(z);
	}
	public void prikaziSveZivotinje() {
		for(Zivotinja z : zivotinje) {
			z.oglasiSe();
		}
	}
}
