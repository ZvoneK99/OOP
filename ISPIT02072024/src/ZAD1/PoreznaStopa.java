package ZAD1;

public abstract class PoreznaStopa {
	private char[] stope = {'A', 'E', 'J', 'k', 'M'};
	private double[] visineStopa = {0.0, 17.0, 10.0, 20.0, 5.0};
	
	public PoreznaStopa() {
		
	}
	
	public abstract void promjeniVisinuStope(char stopa, double novaVisina);
	
	public abstract void resetirajVisinuStope();

	//Getteri i setteri
	public char[] getStope() {
		return stope;
	}
	public void setStope(char[] stope) {
		this.stope = stope;
	}
	public double[] getVisineStopa() {
		return visineStopa;
	}
	public void setVisineStopa(double[] visineStopa) {
		this.visineStopa = visineStopa;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Porezne stope");
		for(char stopa : stope) {
			sb.append(stopa).append(" ");
		}
		sb.append("Visine ");
		for(double visina : visineStopa) {
			sb.append(visina).append(" ");
		}
		return sb.toString();
	}
}
