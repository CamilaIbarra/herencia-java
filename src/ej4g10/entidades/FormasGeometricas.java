/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4g10.entidades;

/**
 *
 * @author Camila Ibarra
 */
public class FormasGeometricas{
    protected Double area;
    protected Double perimetro;

    public FormasGeometricas() {
    }

    public FormasGeometricas(Double area, Double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
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

    

    

    
    
}
