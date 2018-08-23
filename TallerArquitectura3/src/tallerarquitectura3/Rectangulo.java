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
public class Rectangulo extends FiguraGeometrica{
    double ladoA;
    double ladoB;

    public Rectangulo() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String CalcularArea() {
        double area = this.ladoA * this.ladoB;
        return "El area del rectangulo es: "+area;
    }

    @Override
    public String CalcularPerimetro() {
        double perimetro = (2 * this.ladoA) + (2 * this.ladoB);
        return "El perimetro del rectangulo es: "+perimetro;
    }
    
    
}
