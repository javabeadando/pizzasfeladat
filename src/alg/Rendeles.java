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

    public double getRendelesErteke() {
        double osszeg = 0;
        switch (mitrendelt.getArkod()) {
            case Pizza.ALAP:
                osszeg += (Pizza.ALAP * darab);
                break;
            case Pizza.MARGARITHA:
                osszeg += (Pizza.MARGARITHA * darab);
                break;
            case Pizza.HAWAII:
                osszeg += (Pizza.HAWAII * darab);
                break;
        }
        return osszeg;
    }

    @Override
    public String toString() {
        return " " + mitrendelt.getNev() + "\t" + getRendelesErteke() + "Ft \n";
    }
    
}
