package Zadatak19;

public class Antikvitet extends OsnovniEksponat{
	private int povjesniZnacaj;
	
	public Antikvitet(String naziv, int godina, int povjesniZnacaj) {
		super(naziv, godina);
		if(povjesniZnacaj < 1 || povjesniZnacaj > 10) {
			throw new IllegalArgumentException("Povjesni znacaj mora biti između 1 i 10");
		}
		this.povjesniZnacaj = povjesniZnacaj;
	}
	
	public int getPovjesniZnacaj() {
		return povjesniZnacaj;
	}
	public void setPovjesniZnacaj(int povjesniZnacaj) {
		if(povjesniZnacaj<1 || povjesniZnacaj>10) {
			throw new IllegalArgumentException("Povjesni znacaj mora biti između 1 i 10");
		}
		this.povjesniZnacaj = povjesniZnacaj;
	}
	@Override
	public String vrstaEksponata() {
		return "Antikvitet";
	}
	@Override
	public double vrijednostEksponata() {
		return (2023 - getGodina()) * getPovjesniZnacaj() * 50;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Povjesni značaj: ").append(getPovjesniZnacaj()).append(" Vrijednos eksponata: ").append(vrijednostEksponata());
		return sb.toString();
	}
}
