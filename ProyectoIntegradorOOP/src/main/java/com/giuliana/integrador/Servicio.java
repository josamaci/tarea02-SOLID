package com.giuliana.integrador;

import com.giuliana.integrador.Actores.Cliente;
import com.giuliana.integrador.Interfaces.IProducto;
import java.util.ArrayList;

public class Servicio implements IProducto{
    
    protected Producto producto;

    public Producto getProducto() {
        return producto;
    }

    public Servicio(int precio, int numeroId, String descripcion, String importeIVA, ArrayList<Manufactura> listaDeProductos, ArrayList<Cliente> listaDeClientes, ArrayList<Servicio> listaDeServicios) {
    }

    public Servicio(int precio, int numeroId, String descripcion) {
        producto = new Producto(precio, numeroId, descripcion);
    }

    public Servicio() {
    }
    
    public void vender(Cliente cliente, Servicio servicio){
        System.out.println("Se ha vendido el servicio " + producto.getDescripcion() + " al cliente " + cliente.getNombre() + ".");
    }

    @Override
    public int calcularIva(int importeIva) {
        importeIva = +(producto.getPrecio() * 21) / 100;
        return importeIva;
    }
    
    
}
