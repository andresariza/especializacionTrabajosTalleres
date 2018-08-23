/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarquitectura3;

import java.util.ArrayList;

/**
 *
 * @author andres
 */
public class Imprimir {
    
    public static ArrayList<FiguraGeometrica> figuras = new ArrayList<>() ;

    public Imprimir() {
        Circulo circulo = new Circulo();
        circulo.setRadio(23);
        figuras.add(circulo);
        
        Esfera esfera = new Esfera();
        esfera.setRadio(20);
        figuras.add(esfera);
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLadoA(12);
        rectangulo.setLadoB(25);
        figuras.add(rectangulo);
        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(43);
        figuras.add(cuadrado);
        
        Cono cono = new Cono();
        cono.setAltura(12);
        cono.setAlturaG(10);
        cono.setRadio(5);
        figuras.add(cono);/**/
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imprimir imprimir = new Imprimir();
        figuras.get(0).CalcularArea();
        for(FiguraGeometrica figura : figuras){
            System.out.println(figura.CalcularArea());
            System.out.println(figura.CalcularPerimetro());
            
            if(figura instanceof Esfera){
                Esfera ef = (Esfera)figura;
                System.out.println(ef.CalcularVolumen());
            }
            
            
            if(figura instanceof Cono){
                Cono con = (Cono)figura;
                System.out.println(con.CalcularVolumen());
                System.out.println(con.CalcularArea());
            }
            System.out.println("---------------------");
	}/**/
    }
    
}
