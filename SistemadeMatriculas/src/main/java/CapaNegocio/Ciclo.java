/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

/**
 *
 * @author SofiC
 */
public class Ciclo {
    protected String id;
    protected String nombre;
    public Matricula tiene;
    public Curso contiene;

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
    
    public void agregar_matricula(Matricula mat){
        tiene= mat;
    }
    public void agregar_curso(Curso cur){
        contiene=cur;
    }
}
