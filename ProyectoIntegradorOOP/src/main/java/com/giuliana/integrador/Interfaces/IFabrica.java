package com.giuliana.integrador.Interfaces;

import com.giuliana.integrador.Manufactura;

public interface IFabrica {
    
    public void fabricar(int paquetesDeMateriaPrima, int PAQUETESREQUERIDOS, Manufactura manufactura);
    
    public void opcionReponer(Manufactura manufactura);
    
    public void reponerMateriaPrima(int paquetesDeMateriaPrima, int paquete);
    
}
