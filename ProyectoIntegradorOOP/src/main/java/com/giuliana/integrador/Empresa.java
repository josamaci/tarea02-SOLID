package com.giuliana.integrador;
import java.util.ArrayList;

public class Empresa
        implements IFacturacion {

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

    protected final String nombreDeLaEmpresa = "Carbarino S.A.",
            descripcion = "Venta de productos tecnológicos y servicios relacionados";

    static public final int IVA = 21, DESCUENTO = 10, DEUDA = 25;


    static protected ArrayList<Manufactura> listaDeProductos;
    static protected ArrayList<Cliente> listaDeClientes;
    static protected ArrayList<Servicio> listaDeServicios;

//    Producto producto;
//    Manufactura manufactura;
//    Servicio servicio;
//    Cliente cliente;
    public void vender(Cliente cliente, Manufactura producto) {

        if (clienteHabilitado(cliente)) {
                        
            producto.quitarDelStock();//QUITAR 1 DE LA LISTA DE STOCK
            precioFinal(producto, cliente);
            System.out.println(generarFactura(producto, cliente));;//GENERAR FACTURA
        }
    }

    public void venderServicio(Cliente cliente, Servicio servicio) {
        if (clienteHabilitado(cliente)) {
            servicio.vender(cliente, servicio);
            precioFinal(servicio, cliente);
            System.out.println(generarFactura(servicio, cliente));//GENERAR FACTURA
        }
    }

    public boolean clienteHabilitado(Cliente cliente) {

        boolean estado=false;

        if ((listaDeClientes).contains(cliente)) {

            System.out.println("El cliente " + cliente.getNombre() + " está en la lista de clientes.");            
            if (cliente.getDeuda() < 4000) {
                estado = true;
            }
        }else{
            System.out.println("El cliente " + cliente.getNombre() + " NO está en la lista de clientes.");
        }
        if(!estado){
            System.out.println("El cliente " + cliente.getNombre() + " NO está habilitado para relizar la compra");
        }
        cliente.setHabilitado(estado);
        return estado;
    }

    //OVERRIDES
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

    @Override
    public String generarFactura(Producto producto, Cliente cliente) {
        String factura;
        
        if (cliente.isResponsableInscripto()) {
                producto.setImporteIVA(". Importe IVA :" + producto.getImporteIVA());
            }

        if (producto instanceof Manufactura) {
            

            factura = ("¡Gracias por comprar en Carbarino! Cliente: "
                    + cliente.getNombre()
                    + " ha comprado "
                    + ((Manufactura) producto).toString()
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
