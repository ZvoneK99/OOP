package ZSR4_2;

public class Rjecnik extends Knjiga {
    private String prviJezik;
    private String drugiJezik;

    public Rjecnik(int ID, String nazivDokumenta, String autor, String prviJezik, String drugiJezik) {
        super(ID, nazivDokumenta, autor);
        this.prviJezik = prviJezik;
        this.drugiJezik = drugiJezik;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prvi jezik: " + prviJezik + ", Drugi jezik: " + drugiJezik;
    }
}
