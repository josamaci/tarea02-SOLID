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
public class LimiteNaipe implements INaipe {
    public void validarCarta(int p, int n) {
        if (p < 1 || p > 4) {
            throw new IllegalArgumentException("palo no valido");
        }
        if (n < 1 || n == 8 || n == 9 || n > 12) {
            throw new IllegalArgumentException("Numero Carta no valido");
        }
    }

    @Override
    public int puntCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}