package com.giuliana.integrador;

import java.util.ArrayList;

public class Servicio extends Producto{

    public Servicio(int precio, int numeroId, String descripcion, String importeIVA, ArrayList<Manufactura> listaDeProductos, ArrayList<Cliente> listaDeClientes, ArrayList<Servicio> listaDeServicios) {
    }

    public Servicio(int precio, int numeroId, String descripcion) {
        super(precio, numeroId, descripcion);
    }

    public Servicio() {
    }
    
    public void vender(Cliente cliente, Servicio servicio){
        System.out.println("Se ha vendido el servicio " + servicio.getDescripcion() + " al cliente " + cliente.getNombre() + ".");
    }
    
    
}
