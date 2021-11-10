package com.giuliana.integrador.Actores;

import com.giuliana.integrador.Empresa;

public class Cliente {

    protected String nombre;
    protected boolean habilitado = false;
    protected boolean responsableInscripto, efectivo;
    protected int deuda;
    protected int precioAPagar;

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

    public boolean clienteHabilitado(Empresa empresa) {

        boolean estado = false;

        if ((empresa.getListaDeClientes()).contains(this)) {

            System.out.println("El cliente " + this.getNombre() + " está en la lista de clientes.");
            if (this.getDeuda() < 4000) {
                estado = true;
            }
        } else {
            System.out.println("El cliente " + this.getNombre() + " NO está en la lista de clientes.");
        }
        if (!estado) {
            System.out.println("El cliente " + this.getNombre() + " NO está habilitado para relizar la compra");
        }
        this.setHabilitado(estado);
        return estado;
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
