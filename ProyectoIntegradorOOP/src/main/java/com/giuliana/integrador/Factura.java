package com.giuliana.integrador;

import com.giuliana.integrador.Actores.Cliente;

public class Factura {
    
    protected Producto producto;
    protected Cliente cliente;

    public Factura(Producto producto, Cliente cliente) {
        this.producto = producto;
        this.cliente = cliente;
    }
    
    public String generarFactura(Producto producto) {
        String factura;

        if (cliente.isResponsableInscripto()) {
            producto.setImporteIVA(". Importe IVA :" + producto.getImporteIVA());
        }

        if (producto instanceof Producto) {

            factura = ("¡Gracias por comprar en Carbarino! Cliente: "
                    + cliente.getNombre()
                    + " ha comprado "
                    + producto.toString()
                    + ". Precio final: "
                    + cliente.getPrecioAPagar()
                    + producto.getImporteIVA());
        } else {
            factura = ("¡Gracias por utilizar los servicios de Carbarino! Cliente: "
                    + cliente.getNombre()
                    + " ha utilizado "
                    + producto.getDescripcion()
                    + ". Precio final: "
                    + cliente.getPrecioAPagar()
                    + producto.getImporteIVA());
        }

        return factura;
    }
    
}
