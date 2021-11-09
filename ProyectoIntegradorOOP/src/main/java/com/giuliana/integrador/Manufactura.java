package com.giuliana.integrador;
import java.util.ArrayList;
import java.util.Scanner;

public class Manufactura 
        extends Producto implements IGestionDeStock {
    
    Scanner scan = new Scanner(System.in);
    private final int PAQUETESREQUERIDOS;
    private int paquetesDeMateriaPrima, cantidadEnStock;
    String marca, color;

    public Manufactura(int PAQUETESREQUERIDOS, int paquetesDeMateriaPrima, int precio, int numeroId, int cantidadEnStock, String descripcion, String marca, String color) {
        super(precio, numeroId, descripcion);
        this.paquetesDeMateriaPrima = paquetesDeMateriaPrima;
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
        this.cantidadEnStock = cantidadEnStock;
    }

    public Manufactura(int PAQUETESREQUERIDOS, String marca, String color, int precio, int numeroId, String descripcion) {
        super(precio, numeroId, descripcion);
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
        this.marca = marca;
        this.color = color;
    }

    public Manufactura(int PAQUETESREQUERIDOS) {
        this.PAQUETESREQUERIDOS = PAQUETESREQUERIDOS;
    }   

    @Override
    public void agregarAlStock() {        
        fabricar();        
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
    public void fabricar() {
        //SI LA CANTIDAD DE PAQUETES DE MATERIA PRIMA PARA FABRICAR EL OBJETO QUE SE TIENE ALCANZA
        //SE PROCEDE A FABRICAR EL PRODUCTO
        
        if(paquetesDeMateriaPrima >= PAQUETESREQUERIDOS){
            paquetesDeMateriaPrima =- PAQUETESREQUERIDOS;
            
            this.agregarAlStock();
            
            System.out.println("Se ha fabricado " + this.toString() + ". Y se ha agregado al stock");
        }else{
            opcionReponer();            
        }
        
    } 
    

    @Override
    public String toString() {
        String string = (" - " + this.descripcion + " " + this.marca + " " + this.color);
        
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

    @Override
    public void reponerMateriaPrima(int paquete) {
        
        Proveedor proveedor = new Proveedor();
        proveedor.proveerMateriaPrima(paquete);
        
        paquetesDeMateriaPrima += paquete;
        
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
    
    public void opcionReponer(){
        String opcion;
        System.out.println("Desea contactar al proveedor para reponer la materia prima? Y/N");
        opcion = scan.next().toLowerCase();
        
        switch (opcion){
            case "y":
                System.out.println("Cuantos paquetes desea comprar? (Este producto requiere " + PAQUETESREQUERIDOS + " paquetes para ser fabricado).");
                int paquetes = scan.nextInt();
                reponerMateriaPrima(paquetes);
                break;
            case "n":
                break;
            default:
                System.out.println("Dale che");
                opcionReponer();
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
    
    
}
