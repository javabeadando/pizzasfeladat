package alg;

public class Rendeles {

    private Pizza mitrendelt;
    private int darab;
    public static final int KEDVEZMENY =10; //%-ban
    public static final int MENNYISEG_KEDVEZMENYHEZ =5; // db

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
        osszeg = mitrendelt.getAr()*darab;
        if (darab >= MENNYISEG_KEDVEZMENYHEZ) {
            osszeg *= (1.0-KEDVEZMENY/100.);
        }
        return osszeg;
    }

    @Override
    public String toString() {
        return " " + mitrendelt.getNev() + "\t" + getRendelesErteke() + "Ft \n";
    }
}
