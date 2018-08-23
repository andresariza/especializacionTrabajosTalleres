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
public class Cubo extends Cuadrado {

    public Cubo() {
    }

    @Override
    public String CalcularArea() {
        double area = 6 * this.lado;
        return "El area del cubo es: "+area;
    }
    
    public String CalcularVolumen(){
        double volumen = this.lado * this.lado * this.lado;
        return "El volumen del cubo es: "+volumen;
    }
    
}
