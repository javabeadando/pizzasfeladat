package teszt;

import alg.Pizza;
import alg.Rendeles;
import alg.Vevo;

public class Teszt {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(Pizza.ALAP, "alap");
        Rendeles rendeles = new Rendeles(pizza, 1);
        Vevo vevo = new Vevo("Béla");

        vevo.addRendeles(rendeles);
        vevo.addRendeles(new Rendeles(new Pizza(Pizza.MARGARITHA, "margarita"), 5));

        System.out.println(vevo.getSzamla());
    }
}
