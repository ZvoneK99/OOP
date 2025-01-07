package ZAD2;

public class StopaK extends PoreznaStopa {

    public StopaK() {
        super("K", new double[] {1.0, 15.0, 9.0, 18.0, 4.0}); // Naziv i visine stopa za StopaE
    }

    @Override
    public double promjeniVisinuStope(int indeks, double novaVisinaStope) {
        double[] visineStope = getVisineStope();
        if (indeks >= 0 && indeks < visineStope.length) {
            double staraVrijednost = visineStope[indeks];
            visineStope[indeks] = novaVisinaStope;
            return staraVrijednost;
        } else {
            System.out.println("Neispravan indeks!");
            return -1;
        }
    }
}
