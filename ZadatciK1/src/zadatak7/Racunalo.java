package zadatak7;

public class Racunalo implements Comparable<Racunalo> {
	private String proizvodjac;
	String model;
	String procesor;
	int ram;
	boolean ukljuceno;
	static int brojRacunala = 0;
	
	public Racunalo(String proizvodjac, String model, String procesor, int ram) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.procesor = procesor;
		this.ram = ram;
		this.ukljuceno = false;
		brojRacunala++;
	}
	
	public Racunalo() {
		this.proizvodjac = "Nepoznat";
		this.model = "Nepoznat";
		this.procesor = "Nepoznat";
		this.ram = 4;
		this.ukljuceno = false;
		brojRacunala++;
	}
	
	//Getter i setter za proizvodjac
		public String getProizvodjac() {
			return proizvodjac;
		}
		public void setProizvodjac(String proizvodjac) {
			this.proizvodjac = proizvodjac;
		}
		public int getRam() {
			return this.ram;
		}
	
		//Metoda za ukljucivanje racunala
		public void ukljuciRacunalo() {
			this.ukljuceno = true;
		}
		//Metoda za iskljucivanje racunala
		public void iskljuciRacunalo() {
			this.ukljuceno = false;
		}
		
		public void pokreniProgram(String nazivPrograma) {
			if(this.ukljuceno == true) {
				System.out.println("Program "+nazivPrograma+" je pokrenut");
			}
			else {
				System.out.println("Računalo nije uključeno! Nije moguće pokrenuti program.");
			}
		}
		
	public void ispisiDetalje() {
		String stanje = ukljuceno ? "Da" : "Ne";
		System.out.println("Proizvođač: "+proizvodjac+", Model: "+model+", Procesor: "+procesor+", RAM: "+ram+", Ukljuceno: "+stanje+".");
		System.out.println("");
	}

	@Override
	public int compareTo(Racunalo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
