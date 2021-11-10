package Baraja;
import Carta.Naipe;

/**
 *
 * @author kevin
 */
public class Dealer extends BarajaSpain {

    private BarajaSpain bar;

    public Dealer(BarajaSpain bar) {
        this.bar = bar;
    }

    public void barajar() {
        for (int u = 0; u <= 200; u++) {
            int p1 = (int) (Math.random() * 40);
            int p2 = (int) (Math.random() * 40);
            Naipe tem = baraja[p1];
            baraja[p1] = baraja[p2];
            baraja[p2] = tem;
        }

    }

    public boolean quedanCartas() {
        if (cont == 0) {
            return false;
        } else {
            return true;
        }
    }

    public Naipe sacaCarta() {
        cont--;
        if (cont < 0) {
            throw new IllegalArgumentException("no quedan cartas que devolver");
        }
        return baraja[cont];

    }

    public Naipe dimeCarta(int i) {
        if (i > cont && cont == 0) {
            return null;
        }
        return baraja[i];
    }

}
