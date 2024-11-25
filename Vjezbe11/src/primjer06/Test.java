package primjer06;

public class Test {
	public static void main(String[]args) {
		MultimedijskaDatoteka m1 = new MultimedijskaDatoteka();
		MultimedijskaDatoteka m2 = new MultimedijskaDatoteka("File.mp4", 700);
		MultimedijskaDatoteka m3 = new MultimedijskaDatoteka();
		m1.otvori();
		m1.ispisiDetalje();
		m2.ispisiDetalje();
		m3.ispisiDetalje();
		System.out.println("Ukupan broj kreiranih datoteka: "+MultimedijskaDatoteka.brojKreiranihDatoteka());
	}
}
