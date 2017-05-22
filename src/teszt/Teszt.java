package teszt;

import alg.PizzaTipus;
import alg.Pizza;
import alg.Rendeles;
import alg.Vevo;

public class Teszt {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(PizzaTipus.ALAP, "alap");
        Rendeles rendeles = new Rendeles(pizza, 1);
        Vevo vevo = new Vevo("B�la");

        vevo.addRendeles(rendeles);
        vevo.addRendeles(new Rendeles(new Pizza(PizzaTipus.MARGHARITA, "margarita"), 5));

        System.out.println(vevo.getSzamla());
    }
}
