
package CapaNegocio;

import java.util.ArrayList;


public class Cliente {
    
    private char codCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;
    public ArrayList<Factura>recibe = new ArrayList();

    public char getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(char codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public void setcodCliente(char codCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    public void recibeFactura(Factura factura){
        recibe.add(factura);
    }

}
