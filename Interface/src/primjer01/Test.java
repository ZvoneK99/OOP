package primjer01;

public class Test {
	public static void main(String[]args) {

		        KlimaUredaj klima = new KlimaUredaj();

		        // Uključivanje klime
		        klima.ukljuci();

		        // Promjena temperature
		        klima.povecajPostavku(); // Temperatura: 23°C
		        klima.smanjiPostavku(); // Temperatura: 22°C

		        // Promjena moda rada
		        klima.promijeniMod("grijanje");

		        // Provjera je li uređaj uključen
		        System.out.println("Je li klima uređaj uključen? " + klima.jeUkljucen());

		        // Isključivanje klime
		        klima.iskljuci();
	}
}
