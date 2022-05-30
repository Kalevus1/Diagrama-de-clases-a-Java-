
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {

    protected String id ;
    protected String nombres ;
    protected String apellidos ;
    protected String correo ;
    protected String domicilio ;
    protected Date fechaNc ;
    protected String lugarNac ;
    protected String numcel ;
    protected Boolean Seguro ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNc() {
        return fechaNc;
    }

    public void setFechaNc(Date fechaNc) {
        this.fechaNc = fechaNc;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getNumcel() {
        return numcel;
    }

    public void setNumcel(String numcel) {
        this.numcel = numcel;
    }

    public Boolean getSeguro() {
        return Seguro;
    }

    public void setSeguro(Boolean Seguro) {
        this.Seguro = Seguro;
    }
}
