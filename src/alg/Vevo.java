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

    public String getSzamla() {
        double fizetendo = 0;
        String szamla = "Számla " + getNev() + " részére.\n";
        for (Rendeles rendeles : rendelesek) {
            double reszOsszeg = 0;
            switch (rendeles.getMitrendelt().getArkod()) {
                case Pizza.ALAP:
                    reszOsszeg += (Pizza.ALAP * rendeles.getDarab());
                    break;
                case Pizza.MARGARITHA:
                    reszOsszeg += (Pizza.MARGARITHA * rendeles.getDarab());
                    break;
                case Pizza.HAWAII:
                    reszOsszeg += (Pizza.HAWAII * rendeles.getDarab());
                    break;
            }
            if (rendeles.getDarab() > 5) {
                reszOsszeg *= 0.9;
            } //10% kedvezmeny!

            szamla += "  " + rendeles.getMitrendelt().getNev() + "\t" + reszOsszeg + "Ft \n";
            fizetendo += reszOsszeg;

        }
        szamla += "----------------\nMindösszesen: " + fizetendo + "Ft";

        return szamla;


    }
}
