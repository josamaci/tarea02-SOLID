import java.util.Date;

public class Empleado extends Persona {
    
    protected int numeroDeLegajo;
    protected String numeroDeCuil;
    protected Date fechaIngreso;
    protected String diasDeTrabajo; //Lunes a Viernes.
    protected String TurnoDeTrabajo; //Mañana/Tarde/Noche
    protected String cbu;
    protected double sueldo;

    public Empleado(){}
    
    public Empleado(int numeroDeLegajo, String numeroDeCuil, Date fechaIngreso, String diasDeTrabajo, String TurnoDeTrabajo, String cbu, double sueldo) {
        this.numeroDeLegajo = numeroDeLegajo;
        this.numeroDeCuil = numeroDeCuil;
        this.fechaIngreso = fechaIngreso;
        this.diasDeTrabajo = diasDeTrabajo;
        this.TurnoDeTrabajo = TurnoDeTrabajo;
        this.cbu = cbu;
        this.sueldo = sueldo;
    }
    
    public void setNumeroDeLegajo(int numeroDeLegajo) {
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public void setNumeroDeCuil(String numeroDeCuil) {
        this.numeroDeCuil = numeroDeCuil;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDiasDeTrabajo(String diasDeTrabajo) {
        this.diasDeTrabajo = diasDeTrabajo;
    }

    public void setTurnoDeTrabajo(String TurnoDeTrabajo) {
        this.TurnoDeTrabajo = TurnoDeTrabajo;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public int getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    public String getNumeroDeCuil() {
        return numeroDeCuil;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDiasDeTrabajo() {
        return diasDeTrabajo;
    }

    public String getTurnoDeTrabajo() {
        return TurnoDeTrabajo;
    }

    public String getCbu() {
        return cbu;
    }

    public double getSueldo() {
        return sueldo;
    }

}
