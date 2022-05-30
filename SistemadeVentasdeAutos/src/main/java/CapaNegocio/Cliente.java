
package CapaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private char codCliente;
    private String nombreCliente;
    private String celularCliente;

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

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }
    public ArrayList<RegistroVenta> tieneRegistroVenta = new ArrayList();    
}
