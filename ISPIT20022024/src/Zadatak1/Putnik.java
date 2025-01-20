package Zadatak1;

public class Putnik {
	private String imePrezime;
	private int brojOstvarenihVoznji;
	private String trenutniStatus;
	String[] status = {"srebreni", "zlatni", "platinasti"};
	
	public Putnik(String imePrezime, int brojOstvarenihVoznji) {
		this.setImePrezime(imePrezime);
		this.setBrojOstvarenihVoznji(brojOstvarenihVoznji);
		
		if(brojOstvarenihVoznji<=5 ) {
			this.setTrenutniStatus(status[0]);
		}
		else if(brojOstvarenihVoznji>=6 && brojOstvarenihVoznji<=10) {
			this.setTrenutniStatus(status[1]);
		}
		else {
			this.setTrenutniStatus(status[2]);
		}
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public int getBrojOstvarenihVoznji() {
		return brojOstvarenihVoznji;
	}

	public void setBrojOstvarenihVoznji(int brojOstvarenihVoznji) {
		this.brojOstvarenihVoznji = brojOstvarenihVoznji;
	}

	public String getTrenutniStatus() {
		return trenutniStatus;
	}

	public void setTrenutniStatus(String trenutniStatus) {
		this.trenutniStatus = trenutniStatus;
	}
	 @Override
	    public String toString() {
	        return "Putnik: " + imePrezime + ", Broj ostvarenih vožnji: " + brojOstvarenihVoznji + ", Status: " + trenutniStatus;
	    }
}
