
import java.util.Date;

public class Medicamento extends Insumo {
    protected String tipoMedicamento;

    public Medicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public Medicamento(String tipoMedicamento, String nombre, Date fechaIngreso, String codigoDeInsumo, Date fechaDeCaducidad, double precio, double costo) {
        super(nombre, fechaIngreso, codigoDeInsumo, fechaDeCaducidad, precio, costo);
        this.tipoMedicamento = tipoMedicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }
    

}
