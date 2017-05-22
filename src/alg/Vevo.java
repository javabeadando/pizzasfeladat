package alg;

import java.util.Vector;

public class Vevo {

    private String nev;
    private Vector<Rendeles> rendelesek;

    public Vevo(String nev) {
        this.nev = nev;
        rendelesek = new Vector<>();
    }

    public String getNev() {
        return nev;
    }

    public void addRendeles(Rendeles mit) {
        rendelesek.add(mit);
    }

    public double getFizetendo() {
        double fizetendo = 0;
        for (Rendeles rendeles : rendelesek) {
            fizetendo += rendeles.getRendelesErteke();
        }
        return fizetendo;
    }

    public String getSzamla() {
        String szamla = "Számla " + getNev() + " részére.\n";
        for (Rendeles rendeles : rendelesek) {
            szamla += rendeles.toString();
        }
        szamla += "----------------\nMindösszesen: " + getFizetendo() + "Ft";
        return szamla;
    }
}
