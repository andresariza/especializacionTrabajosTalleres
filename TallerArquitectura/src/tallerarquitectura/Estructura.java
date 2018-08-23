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
public class Estructura {
    
    private String tipoEstructura;

    public Estructura() {
    }

    public Estructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }
    
    /**/
    public String getTipoEstructura() {
        return this.tipoEstructura;
    }
    /*/
    public void getTipoEstructura() {
        System.out.println(this.tipoEstructura);
    }
    /**/

    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }
    
    
    
}
