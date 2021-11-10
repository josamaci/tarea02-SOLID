package paquete;

import java.util.Date;

//para crear una clase 
//primero se especifica el acceso (public/hay otros)
//luego la palabra "class" y finalmente
//el nombre de la clase, tiene que ser exacto al nombre
//del archivo. En este caso clase Persona esta en Persona.java
//si tienen que poner doble palabra usan PascalCase
//pascacase: cada palabra comienza con mayuscula
//ej: clase Coca Cola, seria asi: CocaCola y su archivo CocaCola.java. 
//por defecto hereda de la clase Object
public class Persona {
    
    //atributos/variables de instancia:
    //va el modificador de acceso: public/private/protected
    //public significa que TODAS las otras instancias
    //pueden acceder a mi propiedad nombre
    //despues viene el tipo de dato y finalmente el nombre del atributo
    protected String nombre;
    protected String dni;
    //el maximo de int es 2147483647
    //011-2525-6254-> con int se guardaria asi: 1125226264
    protected String telefono;
    //Date
    protected Date fechaNacimiento;
    protected String direccion;
    protected String email;

}
