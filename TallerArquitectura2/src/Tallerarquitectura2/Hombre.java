/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tallerarquitectura2;

/**
 *
 * @author andres
 */
public class Hombre extends Humano {

    public Hombre() {
    }
    
    public Hombre(String nombre, String tipoDeIdentificacion, int identificacion) {
        this.nombre = nombre;
        this.tipoDeIdentificacion = tipoDeIdentificacion;
        this.identificacion = identificacion;
    }
    

    @Override
    public String alimentarse(String alimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bailar() {
        System.out.println("Mi nombre es "+this.nombre+" y al son que me toquen bailo");
    }

    @Override
    public String comunicarse() {
        return "Mi nombre es "+this.nombre+" y me estoy comunicando";
    }

    @Override
    public void desplazarse() {
        System.out.println("Soy un humano y me estoy desplazando");
    }
    
    @Override
    public boolean dormir(){
        return true;
    }

    @Override
    public void estudiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String tocarInstrumento(String instrumento) {
        return "Mi nombre es "+this.nombre+" y estoy tocando un instrumento llamado "+instrumento;
    }

    @Override
    public void trabajar() {
        System.out.println("Mi nombre es "+this.nombre+" y trabajo muy duro, como un esclavo, paguenme dinero");
    }
    
    public void tomarCerveza(int numeroDeCervezas){
        if(numeroDeCervezas<=6){
            System.out.println("Cantinero, sirvame otras 6");
            this.tomarCerveza(numeroDeCervezas+6);
        }else if(numeroDeCervezas>6 && numeroDeCervezas<=12){
            System.out.println("Cantinero, sirvame otras 6 y ponga la mesa del rincon de los tigres del norte");
            this.tomarCerveza(numeroDeCervezas+6);
        }else if(numeroDeCervezas>12){
            System.out.println("Cantinero, traiga un trapero porque me vomité :v");
        }
    }
    
}
