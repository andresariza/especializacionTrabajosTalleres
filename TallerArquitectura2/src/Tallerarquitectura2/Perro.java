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
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre) {
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
        return "Perro: soy un perro y estoy comiendo "+alimento;
    }
    
    @Override
    public String comunicarse(){
        return "Perro: me estoy comunicando guauf";
    }
    
    @Override
    public void desplazarse(){
        System.out.println("Perro: corro en cuatro patas para moverme");
    }
    
    @Override
    public void jugar(){
        System.out.println("Perro: me gusta ir a recojer pelotas");
    }
    
    @Override
    public String tipoAnimal(String tipo){
        return super.tipoAnimal(tipo);
    }
    
    public String tipoAlimentacion(){
        return "Los perros son carnivoros";
    }
    
}
