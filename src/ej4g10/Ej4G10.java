/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g10;

import ej4g10.entidades.Circulo;
import ej4g10.entidades.Rectangulo;
import ej4g10.servicios.ServiceCirculo;
import ej4g10.servicios.ServiceRectangulo;

/**
 *
 * @author Camila Ibarra
 */
public class Ej4G10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceRectangulo servRec = new ServiceRectangulo();
        Rectangulo r = servRec.crearRectangulo();
        System.out.println("-----Rectángulo-----");
        System.out.println("Área= "+ servRec.calcularArea(r));
        System.out.println("Perímetro= " + servRec.calcularPerimetro(r));
        ServiceCirculo servC = new ServiceCirculo();
        Circulo c = servC.crearCirculo();
        System.out.println("-----Círculo-----");
        System.out.println("Área= "+ servC.calcularArea(c));
        System.out.println("Perímetro= " + servC.calcularPerimetro(c));
        
    }
    
}
