package zad3;

public class Main {
	public static void main(String[]args) {
		OsobnoVozilo ov1 = new OsobnoVozilo("Merc", "351-A-541", "C-klasa", 5, 200);
		TeretnoVozilo tv1 = new TeretnoVozilo("Volvo", "424-A-821", 5, 6.5);
		
		ov1.dohvatiMaksimalanBrojPutnika();
		ov1.dohvatiMaksimalnuNosivost();
		
		System.out.println(ov1);
		System.out.println(tv1);
	}
	
	
}
