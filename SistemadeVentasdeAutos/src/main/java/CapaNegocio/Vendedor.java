
package CapaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Vendedor extends RegistroVenta{

    private char codVendedor ;
    private String nombreVend ;
    private String celVendedor ; 

    public char getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(char codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNombreVend() {
        return nombreVend;
    }

    public void setNombreVend(String nombreVend) {
        this.nombreVend = nombreVend;
    }

    public String getCelVendedor() {
        return celVendedor;
    }

    public void setCelVendedor(String celVendedor) {
        this.celVendedor = celVendedor;
    }
    public ArrayList<RegistroVenta> registra = new ArrayList();

    public ArrayList<RegistroVenta> getRegistra() {
        return registra;
    }

    public void setRegistra(ArrayList<RegistroVenta> registra) {
        this.registra = registra;
    }

    
   
}
