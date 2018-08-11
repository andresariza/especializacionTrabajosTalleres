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
public class Imprimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro = new Perro();
        perro.setNombre("Mila");
        perro.setEdad(5);
        perro.tipoAlimentacion(crearAlimentacion("Carnivoro"));
        perro.tipoestructura(crearEstructura("Vertebrado"));
        perro.comunicarse();
        perro.tipoAnimal();
        System.out.println("");
        
        Perro perrito = (Perro) perro;
        perrito.moverRabo();
        System.out.println("");
        
        Animal ave = new Ave();
        ave.setNombre("Paquita");
        ave.setEdad(1);
        ave.tipoAlimentacion(crearAlimentacion("Herbivoro"));
        ave.tipoestructura(crearEstructura("Vertebrado"));
        ave.comunicarse();
        ave.tipoAnimal();
        System.out.println("");
        
        Animal tortuga = new Tortuga();
        tortuga.setNombre("Franklin");
        tortuga.setEdad(11);
        tortuga.tipoAlimentacion(crearAlimentacion("Herbivoro"));
        tortuga.tipoestructura(crearEstructura("Vertebrado"));
        tortuga.comunicarse();
        tortuga.tipoAnimal();
        System.out.println("");
        
        Animal gato = new Gato();
        gato.setNombre("Felix");
        gato.setEdad(7);
        gato.tipoAlimentacion(crearAlimentacion("Carnivoro"));
        gato.tipoestructura(crearEstructura("Vertebrado"));
        gato.comunicarse();
        gato.tipoAnimal();
        System.out.println("");
        
        Animal pulpo = new Pulpo();
        pulpo.setNombre("Paul");
        pulpo.setEdad(7);
        pulpo.tipoAlimentacion(crearAlimentacion("Carnivoro"));
        pulpo.tipoestructura(crearEstructura("Invertebrado"));
        pulpo.comunicarse();
        pulpo.tipoAnimal();
        System.out.println("");
        
        Pulpo pulpito = (Pulpo) pulpo;
        pulpito.adivinaPartido("Colombia","Inglaterra");
        System.out.println("");
        
        Animal sapo = new Sapo();
        sapo.setNombre("Rene");
        sapo.setEdad(3);
        sapo.tipoAlimentacion(crearAlimentacion("Carnivoro"));
        sapo.tipoestructura(crearEstructura("Vertebrado"));
        sapo.comunicarse();
        sapo.tipoAnimal();
        System.out.println("");
        
        Animal trucha = new Trucha();
        trucha.setNombre("Nemmo");
        trucha.setEdad(6);
        trucha.tipoAlimentacion(crearAlimentacion("Herbivoro"));
        trucha.tipoestructura(crearEstructura("Vertebrado"));
        trucha.comunicarse();
        trucha.tipoAnimal();
        System.out.println("");
        
        System.out.println("El animal "+trucha.getNombre()+" nacio el año "+trucha.agnoNacimiento());
        System.out.println("");
    }
    
    public static Alimentacion crearAlimentacion(String alimentacion){
        Alimentacion ObjAlimentacion = new Alimentacion(alimentacion);
        return ObjAlimentacion; 
    }
    
    public static Estructura crearEstructura(String estructura){
        Estructura ObjEstructura = new Estructura(estructura);
        return ObjEstructura;
    }
    
}
