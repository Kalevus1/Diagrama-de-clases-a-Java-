/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Kalevus
 */
public class Factura {

    private char codRegistroVenta;
    private String tipoPagoRegistroVenta;
    private Double montoRegistroVenta;
    public Cliente correspondeCliente; 
    public ArrayList<DetalleFactura>tiene = new ArrayList();

    public char getCodRegistroVenta() {
        return codRegistroVenta;
    }

    public void setCodRegistroVenta(char codRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
    }

    public String getTipoPagoRegistroVenta() {
        return tipoPagoRegistroVenta;
    }

    public void setTipoPagoRegistroVenta(String tipoPagoRegistroVenta) {
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
    }

    public Double getMontoRegistroVenta() {
        return montoRegistroVenta;
    }

    public void setMontoRegistroVenta(Double montoRegistroVenta) {
        this.montoRegistroVenta = montoRegistroVenta;
    }

    public Cliente getCorrespondeCliente() {
        return correspondeCliente;
    }

    public void setCorrespondeCliente(Cliente correspondeCliente) {
        this.correspondeCliente = correspondeCliente;
    }

    public void tieneDetalleFactura(DetalleFactura detalleFactura){
        tiene.add(detalleFactura);
    }

}
