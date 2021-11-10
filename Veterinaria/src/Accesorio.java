
import java.util.Date;

public class Accesorio  extends Insumo{
    protected String genero;

    public Accesorio(String genero) {
        this.genero = genero;
    }

    public Accesorio(String genero, String nombre, Date fechaIngreso, String codigoDeInsumo, Date fechaDeCaducidad, double precio, double costo) {
        super(nombre, fechaIngreso, codigoDeInsumo, fechaDeCaducidad, precio, costo);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
