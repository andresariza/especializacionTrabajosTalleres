/*
 * Modelos de programacion
 * Ejemplos de codigo de aplicacion de patrones
 */

package edu.logica.builder;

public class UbicacionImpl implements Ubicacion{
    private String ubicacion;
    
    public UbicacionImpl(){ }
    public UbicacionImpl(String newUbicacion){
        ubicacion = newUbicacion;
    }
    
    @Override
    public String getUbicacion(){ return ubicacion; }
    
    @Override
    public void setUbicacion(String newUbicacion){ ubicacion = newUbicacion; }
    
    @Override
    public String toString(){ return ubicacion; }
}