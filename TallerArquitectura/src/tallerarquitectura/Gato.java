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
public class Gato extends Animal{
    public Gato() {
    }

    @Override
    public void comunicarse() {
        System.out.println("Hubo una fiesta en mi barrio \n"
                + "Llego Don Gato, llego el gato Tom\n"
                + "Llego el gato Félix\n"
                + "Llego Silvestre también vino Garfield pero hacía falta un gato\n"
                + "¿Saben quién es, hmm?\n"
                + "El gato volador");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Los gatos comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Gato: félino que se destaca por su convivencia con el hombre como mascota \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de un gato es: "+super.tipoestructura(ObjEstructura);
    }
    
}
