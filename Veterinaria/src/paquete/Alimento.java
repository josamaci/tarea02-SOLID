package paquete;


import java.util.Date;

public class Alimento extends Insumo{
    protected String tipoAlimento;

    public Alimento(String tipoAlimento, String nombre, Date fechaIngreso, String codigoDeInsumo, Date fechaDeCaducidad, double precio, double costo) {
        super(nombre, fechaIngreso, codigoDeInsumo, fechaDeCaducidad, precio, costo);
        this.tipoAlimento = tipoAlimento;
    }

    public Alimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

}
