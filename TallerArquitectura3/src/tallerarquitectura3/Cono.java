/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura3;

import static java.lang.Math.PI;

/**
 *
 * @author andres
 */
public class Cono extends Triangulo{
    public int altura;
    public int alturaG;
    public double radio;

    public Cono() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAlturaG() {
        return alturaG;
    }

    public void setAlturaG(int alturaG) {
        this.alturaG = alturaG;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String CalcularArea() {
        double area = this.CalcularAreaLateral() + (Math.PI * this.radio * this.radio);
        return "El area total del Cono es: "+area;
    }
    
    public double CalcularAreaLateral(){
        double areaLateral = Math.PI * this.radio * this.altura;
        return areaLateral;
    }
    
    public String CalcularVolumen(){
        double volumen = (Math.PI*(this.radio*this.radio)*this.altura)/3;
        return "El volumen del cono es: "+volumen;
    }
}
