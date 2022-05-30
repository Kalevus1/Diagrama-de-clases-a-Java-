/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.Date;

/**
 *
 * @author Kalevus
 */
public class DetallePedido {
    private char codDetallePedido;
    private Double cantDetallePedido;
    public Producto consignaProducto;
    public Pedido pertenecePedido;

    public char getCodDetallePedido() {
        return codDetallePedido;
    }

    public void setCodDetallePedido(char codDetallePedido) {
        this.codDetallePedido = codDetallePedido;
    }

    public Double getCantDetallePedido() {
        return cantDetallePedido;
    }

    public void setCantDetallePedido(Double cantDetallePedido) {
        this.cantDetallePedido = cantDetallePedido;
    }

    public Producto getConsignaProducto() {
        return consignaProducto;
    }

    public void setConsignaProducto(Producto consignaProducto) {
        this.consignaProducto = consignaProducto;
    }

    public Pedido getPertenecePedido() {
        return pertenecePedido;
    }

    public void setPertenecePedido(Pedido pertenecePedido) {
        this.pertenecePedido = pertenecePedido;
    }
}
