/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tallerarquitectura2;

import java.util.Calendar;

/**
 *
 * @author andres
 */
public abstract class Animal implements AccionesGeneral{
    protected String nombre;
    private String tipo;

    public Animal() {
    }

    @Override
    public String comunicarse() {
        String mensaje = "Me estoy comunicando";
        return mensaje;
    }

    @Override
    public void desplazarse() {
        System.out.println("Me estoy desplazando");
    }

    @Override
    public boolean dormir() {
        Calendar cal = Calendar.getInstance();
        int horaActual = cal.get(Calendar.HOUR_OF_DAY);
        if(horaActual>20){
            System.out.println("Son mas de las 8, un animal a esta hora ya deberia estar durmiendo");
            return true;
        }else{
            System.out.println("Son las "+horaActual+", aun no es hora de dormir");
            return false;
        }
    }

    @Override
    public abstract String alimentarse(String alimento);

    @Override
    public abstract void jugar();
    
    public String tipoAnimal(String tipo){
        this.tipo = tipo;
        return tipo;
    }
    
    public void cazarOtroAnimal(){
        if(tipo.equals("carnivoro")){
            System.out.println("Tengo que cazar algun otro ser vivo para alimentarme");
        }else{
            System.out.println("No tengo que cazar porque como plantas");
        }
    }
}
