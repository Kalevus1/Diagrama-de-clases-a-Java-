/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kalevus
 */
public class Pedido {
    private char codPedido;
    private Date fechadia;
    private String estadoPedido;
    public Motorizado atendidoMotorizado;
    public ArrayList<DetallePedido>contiene = new ArrayList();
    
    public char getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(char codPedido) {
        this.codPedido = codPedido;
    }

    public Date getFechadia() {
        return fechadia;
    }

    public void setFechadia(Date fechadia) {
        this.fechadia = fechadia;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    public Motorizado getAtendidoMotorizado() {
        return atendidoMotorizado;
    }

    public void setAtendidoMotorizado(Motorizado atendidoMotorizado) {
        this.atendidoMotorizado = atendidoMotorizado;
    }
 
    public void contieneDetallePedido(DetallePedido detallePedido){
        contiene.add(detallePedido);
    }
}
