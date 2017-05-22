package alg;

public class Pizza {

    private PizzaTipus tipus;
    private String nev;

    public Pizza(PizzaTipus tipus, String nev) {
        this.nev = nev;
        setTipus(tipus);
    }

    public PizzaTipus getTipus() {
        return tipus;
    }

    public int getAr() {
        return tipus.getAr();
    }

    public String getNev() {
        return nev;
    }

    public void setTipus(PizzaTipus tipus) {
        this.tipus = tipus;
    }
}
