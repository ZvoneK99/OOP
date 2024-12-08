package zadatak3;

public class Kugla extends GeometrijskaTijela {
	private double polumjer;
	
	public Kugla(double polumjer) {
		super(4/3*Math.PI*Math.pow(polumjer, 3), 4*Math.PI*polumjer*polumjer);
		this.polumjer = polumjer;
	}
	public double getPolumjer() {
		return this.polumjer;
	}
	public void setPolumjer(double polumjer) {
		this.polumjer = polumjer;
	}
	@Override
	public String toString() {
		return "Kugla: ("+getVolumen()+" "+getOpseg()+")"+" Redni broj: "+getRedniBroj()+".";
	}
}
