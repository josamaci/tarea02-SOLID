
import java.util.Date;

public class AdministradorInsumos {
    public static boolean estaVencido(Insumo i){
        Date hoy = new Date();//date es un objeto en java, genera por defecto la fecha de hoy
        return (i.getFechaDeCaducidad().after(hoy));
    }
}
