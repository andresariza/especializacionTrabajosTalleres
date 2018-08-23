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
public class Cuadrado extends FiguraGeometrica {
    protected double lado;

    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String CalcularArea() {
        double area = this.lado * this.lado;
        return "El area del cuadrado es: "+area;
    }

    @Override
    public String CalcularPerimetro() {
        double perimetro = 4 * this.lado;
        return "El perimetro del cuadrado es: "+perimetro;
    }
    
}
