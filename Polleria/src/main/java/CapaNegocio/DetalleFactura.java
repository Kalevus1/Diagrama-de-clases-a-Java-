/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author Kalevus
 */
public class DetalleFactura {
    private char codDetalleVenta;
    private Double precioUnitario;
    private Double subtotal;
    private Double cantidad;
    public Factura perteneceFactura;    
    public Producto contieneProducto;

    public char getCodDetalleVenta() {
        return codDetalleVenta;
    }

    public void setCodDetalleVenta(char codDetalleVenta) {
        this.codDetalleVenta = codDetalleVenta;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getPerteneceFactura() {
        return perteneceFactura;
    }

    public void setPerteneceFactura(Factura perteneceFactura) {
        this.perteneceFactura = perteneceFactura;
    }

    public Producto getContieneProducto() {
        return contieneProducto;
    }

    public void setContieneProducto(Producto contieneProducto) {
        this.contieneProducto = contieneProducto;
    }
}
