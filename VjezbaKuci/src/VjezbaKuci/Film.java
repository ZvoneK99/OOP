package VjezbaKuci;

public class Film {
String naziv;
String reziser;
int godinaIzdavanja;
int trajanjeFilma;

public Film(String naziv, String reziser, int godinaIzdavanja, int trajanjeFilma) {
	this.naziv = naziv;
	this.reziser = reziser;
	this.godinaIzdavanja = godinaIzdavanja;
	this.trajanjeFilma = trajanjeFilma;
}

public void ispisiDetaljeFilma() {
	System.out.println("Naziv filma je: "+naziv);
	System.out.println("Reziser filma je: "+reziser);
	System.out.println("Godina izdavanja je: "+godinaIzdavanja);
	System.out.println("Film traje: "+trajanjeFilma+" minuta.");
}
public void main(String[]args) {
	Film nako = new Film("Brzi i Zestoki", "Šeki pokojni", 2005, 120);
	nako.ispisiDetaljeFilma();
}


}
