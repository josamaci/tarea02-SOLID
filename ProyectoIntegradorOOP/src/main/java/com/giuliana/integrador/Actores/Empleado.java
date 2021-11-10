package com.giuliana.integrador.Actores;

import com.giuliana.integrador.Empresa;
import com.giuliana.integrador.Factura;
import com.giuliana.integrador.Interfaces.IFacturacion;
import com.giuliana.integrador.Manufactura;
import com.giuliana.integrador.Producto;
import com.giuliana.integrador.Servicio;
import static com.giuliana.integrador.Empresa.DESCUENTO;
import static com.giuliana.integrador.Empresa.DEUDA;
import static com.giuliana.integrador.Empresa.IVA;

public class Empleado implements IFacturacion {
    
    protected Empresa empresa;

    public Empleado(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void vender(Cliente cliente, Manufactura manufactura) {

        if (cliente.clienteHabilitado(empresa)) {

            manufactura.quitarDelStock();//QUITAR 1 DE LA LISTA DE STOCK
            precioFinal(manufactura.getProducto(), cliente);
            Factura factura = new Factura(manufactura.getProducto(), cliente);
            System.out.println(factura.generarFactura(manufactura.getProducto()));;//GENERAR FACTURA
        }
    }

    public void venderServicio(Cliente cliente, Servicio servicio) {
        if (cliente.clienteHabilitado(empresa)) {
            servicio.vender(cliente, servicio);
            precioFinal(servicio.getProducto(), cliente);
            Factura factura = new Factura(servicio.getProducto(), cliente);
            System.out.println(factura.generarFactura(servicio.getProducto()));//GENERAR FACTURA
        }
    }

    @Override
    public void precioFinal(Producto producto, Cliente cliente) {

        producto.setImporteIVA(String.valueOf(producto.calcularIva(IVA)));
        producto.setPrecio(producto.calcularIva(IVA) + producto.getPrecio());
        cliente.setPrecioAPagar(producto.getPrecio());

        if (cliente.isEfectivo()) {
            aplicarDescuento(producto, cliente);
        } else {
            generarDeuda(producto, cliente);
        }
    }

    @Override
    public void aplicarDescuento(Producto producto, Cliente cliente) {
        int precioFinal = cliente.getPrecioAPagar() - (producto.getPrecio() * DESCUENTO) / 100;

        cliente.setPrecioAPagar(precioFinal);
    }

    @Override
    public void generarDeuda(Producto producto, Cliente cliente) {
        int deuda = (producto.getPrecio() * DEUDA) / 100;
        cliente.setDeuda(cliente.getDeuda() + deuda);
    }
    
}
