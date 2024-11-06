package primjer_04;

public class Test {
	public static void main(String[]args) {
		Knjiznica gradska = new Knjiznica();
		
		Knjiga knjig1 = new Knjiga("Vlak u snijegu", "Mato Lovrak", 1960, true);
		Knjiga knjig2 = new Knjiga("Ne možeš mi ništa", "David Goggins", 2018, true);
		Knjiga knjig3 = new Knjiga("Zov divljine", "Jack London", 1903, true);

		EBook ebook1 = new EBook("Digital Fortress", "Dan Brown", 1998, true, "PDF", 2.5);
		EBook ebook2 = new EBook("Becoming", "Michelle Obama", 2018, true, "ePub", 3.0);
		EBook ebook3 = new EBook("Clean Code", "Robert C. Martin", 2008, true, "Mobi", 4.2);
		
		gradska.dodajKnjigu(knjig1);
		gradska.dodajKnjigu(knjig2);
		gradska.dodajKnjigu(knjig3);
		gradska.dodajKnjigu(ebook1);
		gradska.dodajKnjigu(ebook2);
		gradska.dodajKnjigu(ebook3);
		
		//gradska.prikaziSveKnjige();
		gradska.posudiKnjigu("Vlak u snijegu");
		//gradska.prikaziSveKnjige();
		gradska.pronađiKnjiguPoNaslovu("Ne možeš mi ništa");
	}
}