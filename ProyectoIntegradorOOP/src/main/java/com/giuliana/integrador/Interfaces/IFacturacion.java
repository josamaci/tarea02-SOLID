package com.giuliana.integrador.Interfaces;

import com.giuliana.integrador.Actores.Cliente;
import com.giuliana.integrador.Producto;

public interface IFacturacion {
    
    void precioFinal(Producto producto, Cliente cliente);
    void aplicarDescuento(Producto producto, Cliente cliente);
    void generarDeuda(Producto producto, Cliente cliente);
    
}
