/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tallerarquitectura2;

/**
 *
 * @author andres
 */
public class Pez  extends Animal{

    public Pez() {
    }

    public Pez(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String alimentarse(String alimento){
        return "Pez: por lo general como plangton, pero si me dan "+alimento+" me lo como"  ;
    }
    
    @Override
    public void desplazarse(){
        System.out.println("Pez: me desplazo nadando");
    }
    
    @Override
    public void jugar(){
        System.out.println("Pez: me gusta jugar con las burbujas");
    }
    
    @Override
    public String tipoAnimal(String tipo){
        return super.tipoAnimal(tipo);
    }
    
}
