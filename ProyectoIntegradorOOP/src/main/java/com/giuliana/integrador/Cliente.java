package com.giuliana.integrador;

public class Cliente {
    
    private String nombre;
    private boolean responsableInscripto,habilitado, efectivo;
    private int deuda;
    private int precioAPagar;

    public Cliente(String nombre, boolean responsableInscripto, boolean habilitado, boolean efectivo, int deuda) {
        this.nombre = nombre;
        this.responsableInscripto = responsableInscripto;
        this.habilitado = habilitado;
        this.efectivo = efectivo;
        this.deuda = deuda;
    }

    public Cliente(String nombre, boolean responsableInscripto, boolean efectivo, int deuda) {
        this.nombre = nombre;
        this.responsableInscripto = responsableInscripto;
        this.efectivo = efectivo;
        this.deuda = deuda;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isResponsableInscripto() {
        return responsableInscripto;
    }

    public void setResponsableInscripto(boolean responsableInscripto) {
        this.responsableInscripto = responsableInscripto;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean estaHabilitado) {
        this.habilitado = estaHabilitado;
    }

    public boolean isEfectivo() {
        return efectivo;
    }

    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public int getPrecioAPagar() {
        return precioAPagar;
    }

    public void setPrecioAPagar(int precioAPagar) {
        this.precioAPagar = precioAPagar;
    }    
    
}
