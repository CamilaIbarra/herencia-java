/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g10.servicios;



import ej4g10.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Camila Ibarra
 */
public class ServiceRectangulo{

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        Rectangulo r = new Rectangulo();
        
        System.out.println("Ingrese la base y altura del rectángulo");
        r.setBase(leer.nextDouble());
        r.setAltura(leer.nextDouble());
        
        return r;
    }
    
    public Double calcularArea(Rectangulo r){
        return r.calcularArea();
    }
    
    public Double calcularPerimetro(Rectangulo r){
        return r.calcularPerimetro();
    }

   
    
    
//        r.setArea(r.getAltura() * r.getBase());

//        r.setPerimetro((r.getBase() + r.getAltura()) * 2);


  
    
}
