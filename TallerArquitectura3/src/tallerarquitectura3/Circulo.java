/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura3;

/**
 *
 * @author andres
 */
public class Circulo extends FiguraGeometrica {
    protected double pi = Math.PI;
    protected double radio;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public String CalcularArea() {
        double area = this.pi * this.radio * this.radio;
        return "El area del circulo es: "+area;
    }

    @Override
    public String CalcularPerimetro() {
        double perimetro = 2 * this.pi * this.radio;
        return "El perimetro del circulo es: "+perimetro;
    }
    
}
