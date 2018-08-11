/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura;

import java.util.Random;

/**
 *
 * @author andres
 */
public class Pulpo extends Animal{
    public Pulpo() {
    }
    
    /*
     * Funcion especializada para adivinar el ganador del partido
    */
    public void adivinaPartido(String equipo1, String equipo2){
        Random r = new Random();
        int probabilidad = r.nextInt(2) + 1;
        
        System.out.print("-- Soy el pulpo "+this.getNombre()+" y pronostico como ganador a: ");
        if(probabilidad == 1){
            System.out.println(equipo1+" --");
        }else{
            System.out.println(equipo2+" --");
        }
    }

    @Override
    public void comunicarse() {
        System.out.println("Mueve tus tentaculos \n"
                + "Nada sin obstaculos\n"
                + "Pulpo Paul\n"
                + "Que dices lo que va a pasar\n"
                + "Apuestas me haces ganar\n"
                + "Pulpo Paul");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Los pulpos comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Pulpo: cefalópodo, puede llegar a medir más de un metro de longitud,  \n"
                + "pesar 15 kg y llegar a tener una envergadura superior a un metro y medio \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de un pulpo es: "+super.tipoestructura(ObjEstructura);
    }
    
}
