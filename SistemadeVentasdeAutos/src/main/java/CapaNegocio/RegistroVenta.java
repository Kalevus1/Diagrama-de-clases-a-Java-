
package CapaNegocio;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class RegistroVenta {
   private char codRegistro ;
   private Date fechaHoraRegistro ;
   private double precioRegistro ; 
   public Cliente registraCliente ;
   public Automovil consiAutomovil;
   private String tieneVendedor;
   public Vendedor tieVendedor;
   public ArrayList<Mantenimiento> tiene = new ArrayList();

    public Automovil getConsiAutomovil() {
        return consiAutomovil;
    }

    public void setConsiAutomovil(Automovil consiAutomovil) {
        this.consiAutomovil = consiAutomovil;
    }
    private String consignaAutomovil;
    private String registroCliente;

    public char getCodRegistro() {
        return codRegistro;
    }

    public void setCodRegistro(char codRegistro) {
        this.codRegistro = codRegistro;
    }

    public Date getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(Date fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public double getPrecioRegistro() {
        return precioRegistro;
    }

    public void setPrecioRegistro(double precioRegistro) {
        this.precioRegistro = precioRegistro;
    }

    public String getRegistroCliente() {
        return registroCliente;
    }

    public void setRegistroCliente(String registroCliente) {
        this.registroCliente = registroCliente;
    }

    public String getConsignaAutomovil() {
        return consignaAutomovil;
    }

    public void setConsignaAutomovil(String consignaAutomovil) {
        this.consignaAutomovil = consignaAutomovil;
    }

    public String getTieneVendedor() {
        return tieneVendedor;
    }

    public void setTieneVendedor(String tieneVendedor) {
        this.tieneVendedor = tieneVendedor;
    }
}
