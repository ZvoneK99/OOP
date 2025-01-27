package Zadatak25;

public abstract class OsnovnaRadnja implements Radnja{
	String naziv;
	public OsnovnaRadnja() {
		this.naziv = "ante";
	}
	@Override
	public abstract String izvrsiRadnju();
	@Override
	public String toString() {
		return  izvrsiRadnju();
	}
}
