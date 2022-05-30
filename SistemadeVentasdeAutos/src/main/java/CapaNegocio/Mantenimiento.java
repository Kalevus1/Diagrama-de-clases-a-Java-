/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Mantenimiento {
    private char codMantenimiento ;
    private Date fechaMantenimiento ;
    private double precioMantenimiento ;
    private String descripcionMantenimiento ;
    public ArrayList<RegistroVenta>correspondeRegistroVenta = new ArrayList();
    
    public char getCodMantenimiento() {
        return codMantenimiento;
    }

    public void setCodMantenimiento(char codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaManttenimiento(Date fechaManttenimiento) {
        this.fechaMantenimiento = fechaManttenimiento;
    }

    public double getPrecioMantenimiento() {
        return precioMantenimiento;
    }

    public void setPrecioMantenimiento(double precioMantenimiento) {
        this.precioMantenimiento = precioMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }

    public ArrayList<RegistroVenta> getCorrespondeRegistroVenta() {
        return correspondeRegistroVenta;
    }

    public void setCorrespondeRegistroVenta(ArrayList<RegistroVenta> correspondeRegistroVenta) {
        this.correspondeRegistroVenta = correspondeRegistroVenta;
    }
}