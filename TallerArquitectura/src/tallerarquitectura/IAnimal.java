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
public interface IAnimal {
    public void comunicarse();
    
    public String tipoAlimentacion(Alimentacion ObjAlimentacion);
    
    public String tipoestructura(Estructura ObjEstructura);
}
