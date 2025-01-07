package ZAD2;

public class StopaA extends PoreznaStopa {

    public StopaA() {
        super("A", new double[] {0.0, 17.0, 10.0, 20.0, 5.0}); // Naziv i visine stopa za StopaA
    }

    @Override
    public double promjeniVisinuStope(int indeks, double novaVisinaStope) {
        double[] visineStope = getVisineStope(); // Dohvati trenutne visine
        if (indeks >= 0 && indeks < visineStope.length) {
            double staraVrijednost = visineStope[indeks];
            visineStope[indeks] = novaVisinaStope; // Promijeni vrijednost
            return staraVrijednost; // Vrati staru vrijednost
        } else {
            System.out.println("Neispravan indeks!");
            return -1; // Indikacija greške
        }
    }
}
