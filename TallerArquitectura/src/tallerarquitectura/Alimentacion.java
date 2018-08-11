package tallerarquitectura;

/**
 *
 * @author Andres Ariza
 */
public class Alimentacion {
    private String tipoAlimentacion;

    public Alimentacion() {
    }
    
    public Alimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getTipoAlimentacion() {
        return this.tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getAlimentacion() {
        return this.getTipoAlimentacion();
    }

    public void setAlimentacion(String tipoAlimentacion) {
        this.setTipoAlimentacion(tipoAlimentacion);
    }
    
    
}
