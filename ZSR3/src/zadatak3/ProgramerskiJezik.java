package zadatak3;

public class ProgramerskiJezik {
	private double postotak;
	
	//Getter i setter za postotak
	public double getPostotak() {
		return this.postotak;
	}
	public void setPostotak(double postotak) {
		if(postotak<0) {
			throw new IllegalArgumentException("Postotak ne moze biti manji od 0.");
		}
		this.postotak = postotak;
	}
	
	public ProgramerskiJezik(double postotak) {
		this.postotak = postotak;
	}
	
	
}
