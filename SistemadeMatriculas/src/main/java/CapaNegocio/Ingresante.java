
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Ingresante extends Alumno {

    protected String metodoIng ;
    protected String puestoIng ;
    protected double notaIng ;

    public String getMetodoIng() {
        return metodoIng;
    }

    public void setMetodoIng(String metodoIng) {
        this.metodoIng = metodoIng;
    }

    public String getPuestoIng() {
        return puestoIng;
    }

    public void setPuestoIng(String puestoIng) {
        this.puestoIng = puestoIng;
    }

    public double getNotaIng() {
        return notaIng;
    }

    public void setNotaIng(double notaIng) {
        this.notaIng = notaIng;
    }    
}
