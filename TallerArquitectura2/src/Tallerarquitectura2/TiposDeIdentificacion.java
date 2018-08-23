/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tallerarquitectura2;

public enum TiposDeIdentificacion {
    CC("cc","Cédula de Ciudadania"),
    TI("ti","Tarjeta de identidad"),
    PP("pp","Pasaporte"),
    CE("ce","Cédula de extrangería"),
    PPE("ppe","Pasaporte de extrangería");
    
    private final String nombreCorto;
    private final String nombreLargo;
    
    private TiposDeIdentificacion(String a, String b){
        nombreCorto = a;
        nombreLargo = b;
    }
    
    public String getNombreCorto(){
        return nombreCorto;
    }
    
    public String getNombreLargo(){
        return nombreLargo;
    }
}
