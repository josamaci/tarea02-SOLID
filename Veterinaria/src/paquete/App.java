package paquete;

public class App {
   
    public static void main(String[] args) throws Exception {
        
        //en este caso creo una variable local "michi"
        //de tipo Paciente
        Paciente michi = new Paciente();

        //le asigna nombre al michi
        michi.nombre = "Mabel";
        michi.especie = "gati";

        Paciente perrito = new Paciente();
        perrito.nombre = "Rubencio";
        perrito.especie = "perrito";

        Paciente agatha = new Paciente();
        agatha.nombre = "Agatha";
        agatha.especie = "gati";

        ClinicaVeterinaria vete = new ClinicaVeterinaria();
        vete.nombre = "Pupis";

        System.out.println("El nombre del primer paciente es: "+ michi.nombre);
        System.out.println("El nombre del segundo paciente es: "+ perrito.nombre);
        System.out.println("El nombre del tercer paciente es: "+ agatha.nombre);
        
        Cliente dueño1 = new Cliente();
        dueño1.nombre = "Pedro";

        michi.dueño = dueño1;

        System.out.println("El dueño del primer paciente es "+ michi.dueño.nombre);

        Cliente dueño2 = new Cliente();
        dueño2.nombre = "Liliana";

        //perrito.dueño = dueño2;
        //En este caso si se ejecuta, se rompe porque
        //nunca se asigne al dueño de perrito
        //generando un NullPointerException
        //System.out.println("El dueño del segundo paciente es "+ perrito.dueño.nombre);

        perrito.dueño = dueño2;
        agatha.dueño = dueño2;

        System.out.println("El dueño del tercer paciente es "+ agatha.dueño.nombre);
        
        agatha.dueño.nombre = "Lucas";
        System.out.println("El dueño del segundo paciente es "+ perrito.dueño.nombre);
        System.out.println("El dueño del tercer paciente es "+ agatha.dueño.nombre);

        //Llamo a los metodos de ingresarlos a la veterinaria.
        //vete.ingresar(michi);
        //vete.ingresar(perrito);

        //vete.imprimirListadoPacientes();
    }
}
