package alg;

public enum PizzaTipus {

    ALAP(1000),
    MARGHARITA(1200),
    HAWAII(1600);
    private int ar;

    private PizzaTipus(int ar) {
        this.ar = ar;
    }

    public int getAr() {
        return ar;
    }
}
