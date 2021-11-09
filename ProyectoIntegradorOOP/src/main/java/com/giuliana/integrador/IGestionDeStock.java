package com.giuliana.integrador;

public interface IGestionDeStock {

    void quitarDelStock();
    
    void fabricar();
    void reponerMateriaPrima(int paquete);
    void agregarAlStock(); 
    void chequearStock();
    
    String toString();
    
}
