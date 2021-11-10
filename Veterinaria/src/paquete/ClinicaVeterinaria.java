package paquete;

import java.util.*;

public class ClinicaVeterinaria {
    protected String nombre;
    protected String cuit; //identificador fiscal
    protected String telefono;
    //Es un atributo de tipo "Lista"
    //Van siempre en plural
    //y se declara:
    //public List<Tipo> nombreVariablePlural;
    //adicionalmente van a agregar = new ArrayList<>(); para que sea
    //una lista VACIA, es decir una lista con 0 elementos
    //el <> es el operador Diamante/Diamond
    protected List<Paciente> pacientes = new ArrayList<>();
    protected int capacidadMaxima = 20; //asigna un valor por defecto

    //devuelve true si el paciente paso bien la revision
    //si no, false.
    protected boolean hacerRevision(Paciente paciente){
       
        System.out.println("Revisando al paciente "+paciente.nombre);
        return true;
        
    }

    public boolean ingresar(Paciente paciente){
        //self == this
        if (this.pacientes.size() < this.capacidadMaxima){
            this.pacientes.add(paciente);
            return true;
        }

        return false;
    }
    
    public void imprimirListadoPacientes(){

        System.out.println("*****************LISTADO**********************");
        //For each paciente en pacientes
        //es un ciclo for especial
        //que permite iterar/recorrer listas
        //asignando a una variable antes del: el valor
        //de cada elemento.
        for (Paciente paciente : pacientes){
            //imprimo el atributo nombre del paciente
            System.out.println("Paciente Ingresado: " + paciente.nombre);
        }
        System.out.println("********************************************");
    }
}
