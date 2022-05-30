/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SofiC
 */
public class PlanEstudio {
    protected String id;
    protected Date año;
    protected String resolucion;
    protected int totalCreditos;
    public Alumno rige;
    public ArrayList<Curso>contiene=new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
    
    public void agregar_alumno(Alumno al){
        rige=al;
    }
    
    public void agregar_curso(Curso Curso){
        contiene.add(Curso);
    }
            
}
