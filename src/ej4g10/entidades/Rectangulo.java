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
public class Rectangulo extends FormasGeometricas implements calculosFormas {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(Double base, Double altura, Double area, Double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public Double getPerimetro() {
        return perimetro;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public Double calcularArea() {
        this.area = (this.base * this.altura);
        return this.area;
    }

    @Override
    public Double calcularPerimetro() {
        this.perimetro = (this.altura + this.base) * 2;
        return this.perimetro;
    }
    
    
}
