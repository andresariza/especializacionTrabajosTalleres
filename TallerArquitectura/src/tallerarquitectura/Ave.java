/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura;

/**
 *
 * @author andres
 */
public class Ave extends Animal{

    public Ave() {
    }
      
    @Override
    public void comunicarse() {
        System.out.println("Soy un pajarito \n"
                + "te quiero no me olvides \n"
                + "lo que pido es muy sencillo hazme un favor \n"
                + "si existe este amor \n"
                + "ven y traeme una flor \n"
                + "roja,roja, \n"
                + "la traeras y asi me salvaras. ");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Las aves comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Ave: cuerpo cubierto por plumas, pico córneo sin dentadura \n"
                + "y dos alas que normalmente las emplean para volar.\n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }
    
    @Override
    public String tipoestructura(Estructura ObjEstructura){
        return "La estructura de un ave es: "+super.tipoestructura(ObjEstructura);
    }
}
