package Zadatak24;

public class Televizor implements Elektronika{
	String marka;
	int velicinaEkrana;
	
	@Override
	public void ukljuci() {
		System.out.println("Televizor je ukljucen");
	}
	@Override
	public void iskljuci() {
		System.out.println("Televizor je iskljucen");
	}
	
}
