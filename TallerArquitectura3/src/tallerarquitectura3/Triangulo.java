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
public class Triangulo extends FiguraGeometrica{
    int base;
    int ladoA;
    int ladoB;

    public Triangulo() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String CalcularArea() {
        double semiperimetro = (this.base+this.ladoA+this.ladoB)/2;
        double area =  Math.sqrt(semiperimetro*((semiperimetro-this.base) + (semiperimetro-this.ladoA) + (semiperimetro-this.ladoB)));
        return "El area del triangulo es: "+area;
    }

    @Override
    public String CalcularPerimetro() {
        double perimetro = this.ladoA + this.ladoB + this.base;
        return "El perimetro del triangulo es: "+perimetro;
    }
    
    
}
