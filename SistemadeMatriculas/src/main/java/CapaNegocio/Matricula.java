
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Matricula  {

    protected String id ;
    protected Date fecha ;
    public Alumno realiza;
    public Ciclo pertenece;
    public Semestre esta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void agregar_alumno(Alumno al){
        realiza=al;
    }
    
    
}
