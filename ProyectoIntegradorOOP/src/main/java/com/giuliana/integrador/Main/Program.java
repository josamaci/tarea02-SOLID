package com.giuliana.integrador.Main;

import com.giuliana.integrador.Empresa;
import com.giuliana.integrador.Cliente;
import com.giuliana.integrador.Manufactura;
import com.giuliana.integrador.Producto;
import com.giuliana.integrador.Servicio;

public class Program {
    
    public static void main (String[] args){
        
        Empresa carbarino = new Empresa();
        
        Manufactura m1 = new Manufactura(15, "Sancho", "Beige", 17500, 111, "Televisor 79\"");
        Manufactura m2 = new Manufactura(5, "Sonic", "Negro", 2600, 266, "Auriculares");
        m2.setCantidadEnStock(6);
        m2.setPaquetesDeMateriaPrima(20);
        Manufactura m3 = new Manufactura(19, "Hola Pato","Amarillo patito", 6000, 311, "Impresora Multifunción");
        
        Servicio s1 = new Servicio(350, 699, "Reparación de PC");
        Servicio s2 = new Servicio(100, 799, "Instalación de electrodomésticos");
        Servicio s3 = new Servicio(150, 899, "Envío a domicilio");

        Cliente c1 = new Cliente("Marcela la Crota", true, false, 35000);
        Cliente c2 = new Cliente("Floripondio Bertonatti", false, true, 0);
        Cliente c3 = new Cliente("Felipe Fichicuringa", true, false, 2000);
        Cliente c4 = new Cliente("Pepe", true, false, 30);
        Cliente c5 = new Cliente("Maria Elena Fuseneco", true, false, 30);
        
        carbarino.getListaDeProductos().add(m1);
        carbarino.getListaDeProductos().add(m2);
        carbarino.getListaDeProductos().add(m3);
        
        carbarino.getListaDeServicios().add(s1);
        carbarino.getListaDeServicios().add(s2);
        carbarino.getListaDeServicios().add(s3);
        
        carbarino.getListaDeClientes().add(c1);
        carbarino.getListaDeClientes().add(c2);
        carbarino.getListaDeClientes().add(c3);
        carbarino.getListaDeClientes().add(c5);
        
        //PRUEBA
        //TODOS LOS PRODUCTOS ESTAN SIN STOCK Y SIN PRODUCTOS PARA MANUFACTURA SALVO S2
        
        carbarino.vender(c1, m1);
        carbarino.venderServicio(c2, s3);
        carbarino.vender(c3, m2);
        carbarino.vender(c4, m3);
        carbarino.vender(c5,m1);
    }
    
}
