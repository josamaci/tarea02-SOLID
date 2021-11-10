package Juego;

import Carta.Naipe;
import Baraja.*;

public class Brisca {

    protected BarajaSpain b;
    protected Naipe[] jugador1;
    protected Naipe[] jugador2;
    protected int punJu1;
    protected int punJu2;
    protected Naipe getMuestra;
    protected int turno;

    public Brisca() {
        Dealer b = new Dealer(new BarajaSpain());
        jugador1 = new Naipe[3];
        jugador2 = new Naipe[3];
        punJu1 = 0;
        punJu2 = 0;
        b.barajar();
        for (int i = 0; i < 3; i++) {
            jugador1[i] = b.sacaCarta();
            jugador2[i] = b.sacaCarta();
        }
        getMuestra = b.dimeCarta(0);

    }
    public boolean quedaMano() {
        if ((jugador1[0] == null && jugador1[1] == null && jugador1[2] == null) && (jugador2[0] == null && jugador2[1] == null && jugador2[2] == null)) {
            return false;
        } else {
            return true;
        }

    }

    public BarajaSpain getB() {
        return b;
    }

    public Naipe[] getJugador1() {
        return jugador1;
    }

    public Naipe[] getJugador2() {
        return jugador2;
    }

    public int getPunJu1() {
        return punJu1;
    }

    public int getPunJu2() {
        return punJu2;
    }

    public Naipe getMuestra() {
        return getMuestra;
    }

    public int getTurno() {
        return turno;
    }
    
    
}
