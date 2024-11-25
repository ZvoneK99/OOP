package primjer06;

public class Test {
	public static void main(String[]args) {
		MultimedijskaDatoteka m1 = new MultimedijskaDatoteka();
		MultimedijskaDatoteka m2 = new MultimedijskaDatoteka("File.mp4", 700);
		
		VideoDatoteka v1 = new VideoDatoteka();
		VideoDatoteka v2 = new VideoDatoteka("Film.mp4", 1500, "3840x2160", 120);
		
		AudioDatoteka a1 = new AudioDatoteka();
		AudioDatoteka a2 = new AudioDatoteka("Pjesma.mp3", 5, 320, 3.5);
		
		m1.ispisiDetalje();
		m2.ispisiDetalje();
		System.out.println("--------------------------------");
		v1.ispisiDetalje();
		v2.ispisiDetalje();
		System.out.println("--------------------------------");
		a1.ispisiDetalje();
		a2.ispisiDetalje();
		System.out.println("--------------------------------");
		System.out.println("Ukupan broj kreiranih datoteka: "+MultimedijskaDatoteka.brojKreiranihDatoteka());
	}
}
