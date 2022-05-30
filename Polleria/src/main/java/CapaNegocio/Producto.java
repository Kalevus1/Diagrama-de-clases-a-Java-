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
public class Producto {
    private char codProducto;
    private String descripcionProducto;
    private Double precioReferencia;
    public ArrayList<DetalleFactura>estaen = new ArrayList();
    public ArrayList<DetallePedido>esten = new ArrayList();

    public char getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(char codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(Double precioReferencia) {
        this.precioReferencia = precioReferencia;
    }
    
    public void estaenDetalleFactura(DetalleFactura detalleFactura){
        estaen.add(detalleFactura);
    }
    public void estenPedido(DetallePedido detallePedido){
        esten.add(detallePedido);
    }
    
}
