package alg;

public class Pizza {

    private int arkod;
    private String nev;
    public static final int ALAP = 1000;
    public static final int MARGARITHA = 1200;
    public static final int HAWAII = 1600;

    public Pizza(int arkod, String nev) {
        this.arkod = arkod;
        this.nev = nev;
    }

    public int getArkod() {
        return arkod;
    }

    public String getNev() {
        return nev;
    }

    public void setArkod(int arkod) {
        this.arkod = arkod;
    }

    
    
    
    
}
