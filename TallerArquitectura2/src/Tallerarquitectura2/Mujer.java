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
public class Mujer extends Humano {

    public Mujer() {
    }

    public Mujer(String nombre, String tipoDeIdentificacion) {
        this.nombre = nombre;
        this.tipoDeIdentificacion = tipoDeIdentificacion;
    }
    
    @Override
    public String alimentarse(String alimento){
        return alimento;
    }
    
    @Override
    public void bailar(){
        System.out.println(this.nombre+": Estoy bailando hasta aburrir a todo el mundo");
    }
    
    @Override
    public String comunicarse(){
        return "Me llamo "+this.nombre+" y me comunico demaciado, sin parar\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n"
                + "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla\n";
    }
    
    @Override
    public void desplazarse(){
        System.out.println("Mujer: me estoy desplazando");
    }
    
    @Override
    public boolean dormir(){
        System.out.println("Mujer: ZZZ");
        return true;
    }
    
    @Override
    public void estudiar(){
        System.out.println("Mi nombre es "+this.nombre+" soy mujer y estoy estudiando");
    }
    
    @Override
    public void jugar(){
        System.out.println("Mujer: estoy jugando");
    }
    
    @Override
    public String tocarInstrumento(String instrumento){
        return "Mi nombre es "+this.nombre+" soy mujer y estoy intentando tocar un instrumento llamado "+instrumento;
    }
    
    @Override
    public void trabajar(){
        System.out.println("Mi nombre es "+this.nombre+" soy mujer y estoy trabajando");
    }
    
    public void echarCantaleta(){
        Calendar cal = Calendar.getInstance();
        int horaActual = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Soy mujer y llevo "+horaActual+" horas dando cantaleta el dia de hoy");
        
    }
}
