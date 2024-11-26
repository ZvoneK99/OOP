package primjer01;

public class Radio implements Uredaj {
	double frekvencija;
	boolean ukljucen;
	
	public Radio(double frekvencija) {
		this.frekvencija = frekvencija;
		this.ukljucen = false;
	}
	@Override
	public void ukljuci() {
		ukljucen = true;
		System.out.println("Radio na frekvenciji "+frekvencija+" MHz je ukljucen.");
	}

	@Override
	public void iskljuci() {
		ukljucen = false;
		System.out.println("Radio je iskljucen.");
	}

	@Override
	public boolean jeUkljucen() {
		return ukljucen;
	}
}
