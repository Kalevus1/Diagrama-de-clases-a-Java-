/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author SofiC
 */
public class Curso {
    protected String id;
    protected String nombre;
    public PlanEstudio pertenece;
    public Ciclo esta;
    public Asignatura contiene;

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
    
    public void agregar_PlandeEstudios(PlanEstudio pe){
        pertenece=pe;
    }
    
    public void agregar_ciclo(Ciclo cc){
        esta=cc;
    }
    public void agregar_asignatura(Asignatura sig){
       contiene=sig;
    }
}
