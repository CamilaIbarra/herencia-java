/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g10.servicios;

import ej4g10.entidades.Circulo;
import java.util.Scanner;

/**
 *
 * @author Camila Ibarra
 */
public class ServiceCirculo{
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo crearCirculo(){
        Circulo c = new Circulo();
        System.out.println("Ingrese el radio del círculo");
        c.setRadio(leer.nextDouble());
        return c;
    }
    
    public Double calcularArea(Circulo c){
        return c.calcularArea();
    }
    
    public Double calcularPerimetro(Circulo c){
        return c.calcularPerimetro();
    }
}
