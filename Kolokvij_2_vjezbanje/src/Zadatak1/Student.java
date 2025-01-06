package Zadatak1;

public class Student extends Osoba {
	private int godinaStudija;
	
	public Student(int ID, String imePrezime, int godinaStudija) {
		super(ID, imePrezime);
		this.godinaStudija = godinaStudija;
	}
	public int getGodinaStudija() {
		return this.godinaStudija;
	}
	public void setGodinaStudija(int godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Godina studija "+godinaStudija+".";
	}
}
