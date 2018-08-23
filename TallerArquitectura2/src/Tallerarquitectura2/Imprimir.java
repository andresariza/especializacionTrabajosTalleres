/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tallerarquitectura2;

import java.util.ArrayList;

/**
 *
 * @author andres
 */
public class Imprimir {
    public static AccionesGeneral IAnimal;
    public static AccionesHumano IHombre;
    private static AccionesHumano IMujer;
    public static ArrayList<AccionesGeneral> ALAnimal = new ArrayList<>();
    public static ArrayList<AccionesHumano> ALHumano = new ArrayList<>();

    public Imprimir() {
        IAnimal = new Perro("Mila");
        IHombre = new Hombre("Juan",TiposDeIdentificacion.CC.getNombreCorto(),11211221);
        IMujer = new Mujer("Maria",TiposDeIdentificacion.CE.getNombreCorto());
        /*/ALAnimal.add(new Perro("Mila"));
        ALAnimal.add(new Pez("Cao"));
        
        ALHumano.add(new Hombre("Juan",TiposDeIdentificacion.CC.getNombreCorto(),11211221));
        ALHumano.add(new Mujer("Maria",TiposDeIdentificacion.CE.getNombreCorto()));
        /**/
    }
    
    public static AccionesGeneral CrearPerro(AccionesGeneral perro){
        perro = new Perro();
        return perro;
    }
    
    
    public static AccionesGeneral CrearPez(AccionesGeneral pez){
        pez = new Pez();
        return pez;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imprimir imprimir = new Imprimir();
        
        System.out.println(IAnimal.alimentarse("carne"));
        System.out.println(IAnimal.comunicarse());
        IAnimal.dormir();
        
        Perro tempPerro = (Perro)IAnimal;
        System.out.println(tempPerro.tipoAlimentacion());
        
        //operacion personalizada Animal
        Animal tempAnimal = (Animal) tempPerro;
        tempAnimal.tipoAnimal("carnivoro");
        tempAnimal.cazarOtroAnimal();
        //operacion personalizada Animal
        
        System.out.println("--------------------------");
        
        IAnimal = new Pez("Cao");
        IAnimal.desplazarse();
        IAnimal.jugar();
        IAnimal.dormir();
        System.out.println(IAnimal.alimentarse("pan"));
        
        //operacion personalizada Animal
        Animal temp2Animal = (Animal) IAnimal;
        temp2Animal.tipoAnimal("hervivoro");
        temp2Animal.cazarOtroAnimal();
        //operacion personalizada Animal
        
        System.out.println("--------------------------");
        
        IHombre.bailar();
        Hombre temp = (Hombre) IHombre;
        System.out.println(temp.comunicarse()); 
        temp.tomarCerveza(3); //Operacion personalizada para hombre
        System.out.println(IHombre.tocarInstrumento("Guitarra"));
        IHombre.trabajar();
        
        System.out.println("--------------------------");
        
        IMujer.bailar();
        Mujer temp2 = (Mujer) IMujer;
        System.out.println(temp2.comunicarse()); 
        temp2.echarCantaleta();//Operacion personalizada mujer
        System.out.println(IMujer.tocarInstrumento("Guitarra"));
        IMujer.estudiar();
        
        System.out.println("--------------------------");
        
        /*/
        System.out.println(ALAnimal.get(0).alimentarse("carne"));
        System.out.println(ALAnimal.get(0).comunicarse());
        ALAnimal.get(0).dormir();
        //System.out.println((ALAnimal.get(0).tipoAlimentacion());
        Perro tempPerro = (Perro)ALAnimal.get(0);
        System.out.println(tempPerro.tipoAlimentacion());
        
        Animal tempAnimal = (Animal) tempPerro;
        tempAnimal.tipoAnimal("carnivoro");
        tempAnimal.cazarOtroAnimal();//operacion personalizada Animal
        
        ALAnimal.get(1).desplazarse();
        ALAnimal.get(1).jugar();
        ALAnimal.get(1).dormir();
        System.out.println(ALAnimal.get(1).alimentarse("pan"));
        Animal temp2Animal = (Animal) ALAnimal.get(1);
        temp2Animal.tipoAnimal("hervivoro");
        temp2Animal.cazarOtroAnimal();//operacion personalizada Animal
        
        ALHumano.get(0).bailar();
        //ALHumano.get(0).comunicarse();
        Hombre temp = (Hombre) ALHumano.get(0);
        System.out.println(temp.comunicarse()); 
        temp.tomarCerveza(3); //Operacion personalizada para hombre
        System.out.println(ALHumano.get(0).tocarInstrumento("Guitarra"));
        ALHumano.get(0).trabajar();
        
        
        ALHumano.get(1).bailar();
        //ALHumano.get(1).comunicarse();
        Mujer temp2 = (Mujer) ALHumano.get(1);
        System.out.println(temp2.comunicarse()); 
        temp2.echarCantaleta();//Operacion personalizada mujer
        System.out.println(ALHumano.get(1).tocarInstrumento("Guitarra"));
        ALHumano.get(1).estudiar();/**/
    }    
}
