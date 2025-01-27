package Zadatak23;

public abstract class OsnovnaFigura implements Figura{
	String naziv;
	
	@Override
	public double izracunajPovrsinu() {
		return 0;
	}
	@Override
	public double izracunajOpseg() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Figura "+naziv;
	}
}
