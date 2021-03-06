package com.giuliana.integrador;

import com.giuliana.integrador.Interfaces.IProducto;
import java.util.ArrayList;

public class Producto implements IProducto {

	protected int precio, numeroId;
	protected String descripcion;
        private String importeIVA = "";

    public String getImporteIVA() {
        return importeIVA;
    }

    public void setImporteIVA(String importeIVA) {
        this.importeIVA = importeIVA;
    }
        
        
    public Producto(int precio, int numeroId, String descripcion) {
        this.precio = precio;
        this.numeroId = numeroId;
        this.descripcion = descripcion;
    }

    public Producto() {
    }
    
        @Override
    public int calcularIva(int importeIva){
        
        importeIva =+ (precio*21)/100;
        
        return importeIva;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
