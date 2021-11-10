/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta;

/**
 *
 * @author kevin
 */
public interface INaipe {

    static public final int OROS = 1;
    static public final int BASTOS = 2;
    static public final int COPAS = 3;
    static public final int ESPADAS = 4;

    static public final int AS = 1;
    static public final int SOTA = 10;
    static public final int CABALLO = 11;
    static public final int REY = 12;

    
    public abstract String toString();

    public abstract int puntCarta();
    

}
