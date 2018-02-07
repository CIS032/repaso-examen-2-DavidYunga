/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgraficas;

/**
 *
 * @author miltonlab
 */
public class Circulo extends FiguraGeometrica{
    Punto centro;
    Double radio;

    public Circulo(Punto centro, Double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo() {
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

     @Override
    public void mover(int dx, int dy) {
        this.centro.setX(this.centro.getX() + dx);
        this.centro.setY(this.centro.getY() + dy);
    }

    @Override
    public String toString() {
        return "Circulo: " + nombre + ", centro: " + centro + ", radio: "+radio;
    }
    
    
    
}
