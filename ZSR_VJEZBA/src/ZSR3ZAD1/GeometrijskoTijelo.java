package ZSR3ZAD1;

public class GeometrijskoTijelo {
	private double Volumen;
	private double Oplosje;
	public static int BrojacTijela=0;
	
	public GeometrijskoTijelo(double Volumen, double Oplosje) {
		this.Volumen = Volumen;
		this.Oplosje = Oplosje;
		BrojacTijela++;
	}
	
	@Override
	public String toString() {
		return BrojacTijela+". tijelo: Volumen: "+Volumen+" Oplosje: "+Oplosje;
	}
}
