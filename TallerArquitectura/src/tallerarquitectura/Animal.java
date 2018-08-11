/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura;

import java.util.Calendar;

/**
 *
 * @author andres
 */
public abstract class Animal implements IAnimal {
    int edad;
    
    String nombre;

    public Animal() {
    }

    public Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void tipoAnimal(){
        System.out.println("-- Animal: un ser vivo que siente y se mueve por su propio impulso,  \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+"  --");
    }
    
    /*
     * Metodo de operacion adicional para calcular el año en que nacio el animalito
    */
    public int agnoNacimiento(){
        Calendar cal = Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        
        int nacimiento = year-this.getEdad();
        
        return nacimiento;
    }
    
    @Override
    public void comunicarse() {
        System.out.println("-- Sonido de animal --");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return ObjAlimentacion.getAlimentacion();
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return ObjEstructura.getTipoEstructura();
    }
    
}
