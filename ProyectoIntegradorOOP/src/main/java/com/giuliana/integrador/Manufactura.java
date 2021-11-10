package com.giuliana.integrador;
import com.giuliana.integrador.Actores.Fabricante;
import com.giuliana.integrador.Interfaces.IGestionDeStock;
import com.giuliana.integrador.Interfaces.IProducto;
import java.util.ArrayList;
import java.util.Scanner;

public class Manufactura 
        implements IProducto, IGestionDeStock {
    
    Scanner scan = new Scanner(System.in);
    
    private final int PAQUETESREQUERIDOS;

    private int paquetesDeMateriaPrima, cantidadEnStock;
    String marca, color;
    protected Producto producto;

    public Manufactura(int PAQUETESREQUERIDOS, int paquetesDeMateriaPrima, int precio, int numeroId, int cantidadEnStock, String descripcion, String marca, String color) {
        producto = new Producto(precio, numeroId, descripcion);
        this.paquetesDeMateriaPrima = paquetesDeMateriaPrima;
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
        this.cantidadEnStock = cantidadEnStock;
    }

    public Manufactura(int PAQUETESREQUERIDOS, String marca, String color, int precio, int numeroId, String descripcion) {
        producto = new Producto(precio, numeroId, descripcion);
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
        this.marca = marca;
        this.color = color;
    }

    public Manufactura(int PAQUETESREQUERIDOS) {
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
    }   

    @Override
    public void agregarAlStock() {
        
        Fabricante fabricante = new Fabricante();
        
        fabricante.fabricar(paquetesDeMateriaPrima, PAQUETESREQUERIDOS, this);
    }

    @Override
    public void quitarDelStock() {
        if(cantidadEnStock > 0 ){
        this.cantidadEnStock --;
            System.out.println("Se ha tomado el producto " + toString() + " del stock");
        }else{
            System.out.println("El producto" + toString() +
                    " no se encuentra en stock");
            System.out.println("Productos en stock:");
            chequearStock();
            
            //SI ESTA EN CERO, LLAMO A REPONER, REPONER LLAMA A FABRICAR, Y FABRICAR LLAMA A AGREGAR STOCK
            opcionAgregar();
        }
        
    }
    
    @Override
    public String toString() {
        String string = (" - " + producto.descripcion + " " + this.marca + " " + this.color);
        
        return string;        
    }

    @Override
    public void chequearStock() {
        for(Manufactura producto : Empresa.listaDeProductos){
            if(producto.cantidadEnStock > 0) {
            System.out.println(this.toString());
            }
        }
    }
    
    public void opcionAgregar(){
        String opcion;
        System.out.println("Desea reponer este producto? Y/N");
        opcion = scan.next().toLowerCase();
        
        switch (opcion){
            case "y":
                agregarAlStock();
                break;
            case "n":
                break;
            default:
                System.out.println("Dale amigui no es tan dificil");
                opcionAgregar();
                break;
        }
        
    }

    public int getPaquetesDeMateriaPrima() {
        return paquetesDeMateriaPrima;
    }

    public void setPaquetesDeMateriaPrima(int paquetesDeMateriaPrima) {
        this.paquetesDeMateriaPrima = paquetesDeMateriaPrima;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    
    public int getPAQUETESREQUERIDOS() {
        return PAQUETESREQUERIDOS;
    }
    
    public Producto getProducto() {
        return producto;
    }

    @Override
    public int calcularIva(int importeIva) {

        importeIva = +(producto.getPrecio() * 21) / 100;

        return importeIva;

    }
    
    
}
