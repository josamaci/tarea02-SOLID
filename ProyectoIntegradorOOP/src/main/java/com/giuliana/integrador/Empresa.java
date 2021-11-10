package com.giuliana.integrador;
import com.giuliana.integrador.Actores.Cliente;
import java.util.ArrayList;

public class Empresa {
    
    protected final String nombreDeLaEmpresa = "Carbarino S.A.",
            descripcion = "Venta de productos tecnológicos y servicios relacionados";

    static public final int IVA = 21, DESCUENTO = 10, DEUDA = 25;

    static protected ArrayList<Manufactura> listaDeProductos;
    static protected ArrayList<Cliente> listaDeClientes;
    static protected ArrayList<Servicio> listaDeServicios;

    public Empresa(String importeIVA, ArrayList<Manufactura> listaDeProductos, ArrayList<Cliente> listaDeClientes, ArrayList<Servicio> listaDeServicios) {
        this.listaDeProductos = listaDeProductos;
        this.listaDeClientes = listaDeClientes;
        this.listaDeServicios = listaDeServicios;
    }

    public Empresa() {
        listaDeProductos = new ArrayList();
        listaDeClientes = new ArrayList();
        listaDeServicios = new ArrayList();
    }

    //GETTERS Y SETTERS

    public ArrayList<Manufactura> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<Manufactura> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public ArrayList<Servicio> getListaDeServicios() {
        return listaDeServicios;
    }

    public void setListaDeServicios(ArrayList<Servicio> listaDeServicios) {
        this.listaDeServicios = listaDeServicios;
    }

}
