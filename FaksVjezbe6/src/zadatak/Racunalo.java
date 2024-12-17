package zadatak;

public abstract class Racunalo {
    private String model;
    private String proizvodac;
    private String operacijskiSustav;

    public Racunalo(String model, String proizvodac, String operacijskiSustav) {
        this.model = model;
        this.proizvodac = proizvodac;
        this.operacijskiSustav = operacijskiSustav;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public String getOperacijskiSustav() {
        return operacijskiSustav;
    }

    public void setOperacijskiSustav(String operacijskiSustav) {
        this.operacijskiSustav = operacijskiSustav;
    }

    public abstract String dohvatiTipRacunala();

    public abstract int izracunajPrenosivost();

    @Override
    public String toString() {
        return "model:" + model + ", proizvodjac: " + proizvodac + ", operacijski sustav:" + operacijskiSustav+".";
    }
}


