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
public class Esfera extends Circulo{

    public Esfera() {
    }

    @Override
    public String CalcularArea() {
        double area = 4 * this.pi * this.radio * this.radio;
        return "El area de la esfera es "+area;
    }
    
    public String CalcularVolumen(){
        double volumen = (4/3)*this.pi*this.radio*this.radio*this.radio;
        return "El volumen de la esfera es "+volumen;
    }
}
