package alg;

public class Rendeles {

    private Pizza mitrendelt;
    private int darab;

    public Rendeles(Pizza mitrendelt, int darab) {
        this.mitrendelt = mitrendelt;
        this.darab = darab;
    }

    public int getDarab() {
        return darab;
    }

    public Pizza getMitrendelt() {
        return mitrendelt;
    }
}
