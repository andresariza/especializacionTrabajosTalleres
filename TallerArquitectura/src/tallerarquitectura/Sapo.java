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
public class Sapo extends Animal{
    public Sapo() {
    }

    @Override
    public void comunicarse() {
        System.out.println("El hijo de rana, Rinrín renacuajo\n"
                + "salió esta mañana muy tieso, muy majo.\n"
                + "Con pantalón corto, corbata a la moda\n"
                + "sombrero encintado y chupa de boda.");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Los sapos comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Sapo: anfibio, respira a través de branquias en su estado de larva y luego experimenta  \n"
                + "una metamorfosis que, deriva en el desarrollo de la respiración de tipo pulmonar \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de un sapo es: "+super.tipoestructura(ObjEstructura);
    }
    
}
