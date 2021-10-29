import java.util.Date;

public class Empleado extends Persona {
    
    public int numeroDeLegajo;
    public String numeroDeCuil;
    public Date fechaIngreso;
    public String diasDeTrabajo; //Lunes a Viernes.
    public String TurnoDeTrabajo; //Mañana/Tarde/Noche
    public String cbu;
    public double sueldo;

    public boolean esValidoCBU(){
        if (this.cbu.length()==23) {
            return true;
        }
        return false;
    }

}
