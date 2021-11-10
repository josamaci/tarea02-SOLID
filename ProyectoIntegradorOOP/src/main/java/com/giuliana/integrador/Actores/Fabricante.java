package com.giuliana.integrador.Actores;

import com.giuliana.integrador.Interfaces.IFabrica;
import com.giuliana.integrador.Manufactura;
import java.util.Scanner;

public class Fabricante implements IFabrica{
    
    @Override
    public void opcionReponer(Manufactura manufactura) {
        
        Scanner scan;
        scan = new Scanner(System.in);
        String opcion;
        System.out.println("Desea contactar al proveedor para reponer la materia prima? Y/N");
        opcion = scan.next().toLowerCase();

        switch (opcion) {
            case "y":
                System.out.println("Cuantos paquetes desea comprar? (Este producto requiere " + manufactura.getPAQUETESREQUERIDOS() + " paquetes para ser fabricado).");
                int paquetes = scan.nextInt();
                reponerMateriaPrima(manufactura.getPaquetesDeMateriaPrima(), paquetes);
                break;
            case "n":
                break;
            default:
                System.out.println("Dale che");
                opcionReponer(manufactura);
                break;
        }

    }

    @Override
    public void fabricar(int paquetesDeMateriaPrima, int PAQUETESREQUERIDOS, Manufactura manufactura) {
        {
            //SI LA CANTIDAD DE PAQUETES DE MATERIA PRIMA PARA FABRICAR EL OBJETO QUE SE TIENE ALCANZA
            //SE PROCEDE A FABRICAR EL PRODUCTO

            if (paquetesDeMateriaPrima >= PAQUETESREQUERIDOS) {
                paquetesDeMateriaPrima = -PAQUETESREQUERIDOS;

                manufactura.agregarAlStock();

                System.out.println("Se ha fabricado " + this.toString() + ". Y se ha agregado al stock");
            } else {
                opcionReponer(manufactura);
            }

        }
    }

    @Override
    public void reponerMateriaPrima(int paquetesDeMateriaPrima, int paquete) {
        {

            Proveedor proveedor = new Proveedor();
            proveedor.proveerMateriaPrima(paquete);

            paquetesDeMateriaPrima += paquete;

        }
    }
    
}
