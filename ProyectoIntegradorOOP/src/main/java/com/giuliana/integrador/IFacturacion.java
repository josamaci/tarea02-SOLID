package com.giuliana.integrador;

public interface IFacturacion {
    
    void precioFinal(Producto producto, Cliente cliente);
    void aplicarDescuento(Producto producto, Cliente cliente);
    void generarDeuda(Producto producto, Cliente cliente);
    
    String generarFactura(Producto producto, Cliente cliente);
    
}
