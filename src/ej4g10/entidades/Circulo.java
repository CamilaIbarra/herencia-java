/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g10.entidades;

import ej4g10.interfaces.calculosFormas;

/**
 *
 * @author Camila Ibarra
 */
public class Circulo extends FormasGeometricas implements calculosFormas {
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;

    }

    public Circulo(Double radio, Double area, Double perimetro) {
        super(area, perimetro);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }


    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public Double calcularArea() {
        this.area = PI * (Math.pow(this.radio, 2));
        return this.area;
    }

    @Override
    public Double calcularPerimetro() {
        this.perimetro = PI * (this.radio*2);
        return this.perimetro;
    }

    
    
    
   
}
