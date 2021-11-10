package paquete;

import java.util.Date;

public class Insumo {
    protected String nombre;
    protected Date fechaIngreso;
    protected String codigoDeInsumo;
    protected Date fechaDeCaducidad;
    protected double precio;
    protected double costo;

    public Insumo() {
    }
    
    public Insumo(String nombre, Date fechaIngreso, String codigoDeInsumo, Date fechaDeCaducidad, double precio, double costo) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.codigoDeInsumo = codigoDeInsumo;
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.precio = precio;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigoDeInsumo() {
        return codigoDeInsumo;
    }

    public void setCodigoDeInsumo(String codigoDeInsumo) {
        this.codigoDeInsumo = codigoDeInsumo;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(Date fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}