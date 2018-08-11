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
public class Tortuga extends Animal{
    public Tortuga() {
    }

    @Override
    public void comunicarse() {
        System.out.println("Yo tengo una tortuga que se pasa todo el día \n"
                + "corriéndole carreras a una hormiga en la cocina. \n"
                + "ya le sacó ventaja y estaba por llegar, \n"
                + "mas se cayó cuando empezó a trepar.");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Las tortugas comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Tortuga: vertebrado con reproducción ovípara cuya temperatura es \n"
                + "regulada por el efecto del ambiente en su organismo. \n"
                + "Es un animal eminentemente herbívoro, pacífico y algunas de sus especies\n"
                + "se encuentran en peligro de extinción \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de una tortuga es: "+super.tipoestructura(ObjEstructura);
    }
    
}
