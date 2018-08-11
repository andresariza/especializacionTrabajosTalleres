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
public class Perro extends Animal{
    public Perro() {
    }
    
    public void moverRabo(){
        System.out.println("--  Soy el perro "+this.getNombre()+" y estoy moviendo el rabito porque estoy feliz --");
    }

    @Override
    public void comunicarse() {
        System.out.println("Ese perro ya no entiende, pues se ha vuelto muy bravero, \n"
                + "Se metió con una perra y esta le quito lo fiero \n"
                + "Hay viene el perro loco le patina el coco");
    }

    @Override
    public String tipoAlimentacion(Alimentacion ObjAlimentacion) {
        return "-- Los perros comen: "+super.tipoAlimentacion(ObjAlimentacion);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("-- Perro: mamífero que tiene un tamaño muy variable, pues hay razas de tamaño pequeño,  \n"
                + "medio y grande y cada una de ellas ha sido seleccionada y domesticada por el hombre con algún fin \n"
                + "edad: "+this.edad+" \n"
                + "nombre: "+this.nombre+" --");
    }

    @Override
    public String tipoestructura(Estructura ObjEstructura) {
        return "La estructura de un perro es: "+super.tipoestructura(ObjEstructura);
    }
    
}
