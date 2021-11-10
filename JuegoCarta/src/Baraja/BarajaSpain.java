package Baraja;

import Carta.Naipe;
import java.util.Arrays;

public class BarajaSpain {

    Naipe[] baraja;
    int cont = 40;

    public BarajaSpain() {

        int cont = 0;
        baraja = new Naipe[40];
        for (int i = 1; i <= 4; i++) {
            for (int u = 1; u <= 12; u++) {
                if (u != 8 && u != 9) {
                    baraja[cont] = new Naipe(u, i);
                    cont++;
                }//else
            }//for	
        }//for
    }//constructor barajaSpain

    public String toString() {

        return "[" + Arrays.toString(baraja) + "]";
    }
}//Clase BarajaSpain

