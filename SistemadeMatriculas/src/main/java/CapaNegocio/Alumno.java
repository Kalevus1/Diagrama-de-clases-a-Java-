
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona {

    
    protected Date fechaIngr ;
    protected String estado ;
    protected String creditos;
    public Matricula hace ;
    public EscuelaProfesional pertenece;
    public PlanEstudio esta ;

    public Date getFechaIngr() {
        return fechaIngr;
    }

    public void setFechaIngr(Date fechaIngr) {
        this.fechaIngr = fechaIngr;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
}

