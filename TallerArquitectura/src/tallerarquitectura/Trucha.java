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
public class Trucha extends Animal{
    public Trucha() {
    }

    @Override
    public void comunicarse() {
        System.out.println("Pero mira como beben los peces en el río\n"
                + "Pero mira como beben por ver al dios nacido\n"
                + "Beben y beben y vuelven a beber");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Los truchas comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Trucha: Pez de agua dulce, vive en aguas rápidas y frías; su carne es comestible;  \n"
                + "hay varias especies. \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de un sapo es: "+super.tipoestructura(ObjEstructura);
    }
    
}
