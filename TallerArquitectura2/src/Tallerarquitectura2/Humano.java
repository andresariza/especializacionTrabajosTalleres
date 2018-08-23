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
public abstract class Humano implements AccionesHumano, AccionesGeneral{
    protected int identificacion;
    protected String nombre;
    protected String tipoDeIdentificacion ;

    public Humano() {
    }
    
    @Override
    public void desplazarse(){
        System.out.println("Hola me estoy desplazando");
    }
    
    @Override
    public boolean dormir(){
        return true;
    }

    @Override
    public abstract String alimentarse(String alimento);
    
    @Override
    public abstract String comunicarse();
    
    @Override
    public abstract void jugar();

    @Override
    public abstract void trabajar();

    @Override
    public abstract String tocarInstrumento(String instrumento);

    @Override
    public abstract void estudiar();

    @Override
    public abstract void bailar();
}
