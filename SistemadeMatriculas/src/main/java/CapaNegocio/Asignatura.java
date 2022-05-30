/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;

/**
 *
 * @author SofiC
 */
public class Asignatura {
    protected String id;
    protected String nombre;
    protected int creditos;
    protected int horas;
    public ArrayList<Horario> pertenece=new ArrayList();
    public Curso esta;
    public ArrayList<Docente>es_dictada=new ArrayList();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public void esta_curso(Curso cur){
        esta=cur;
    }
     public void pertenecer_horario(Horario Horario){
         pertenece.add(Horario);
     }
     
     public void ser_dictada(Docente Docente){
         es_dictada.add(Docente);
     }
}
