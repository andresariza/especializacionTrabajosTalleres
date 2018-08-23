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
public class Cilindro extends Circulo{
    long altura;

    public Cilindro() {
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    @Override
    public String CalcularArea() {
        double area = (2 * this.pi * this.radio * this.altura) + (2 *this.pi * this.radio * this.radio);
        return "El area del cilindro es: "+area;
    }
    
    public String calcularVolumen(){
        double volumen = this.pi * this.radio * this.radio * this.altura;
        return "El volumen del cilindro es "+volumen;
    }
}
