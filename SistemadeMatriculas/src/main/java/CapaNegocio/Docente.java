
package CapaNegocio;

import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Docente extends Persona {

    protected String profesion ;
    protected String especialidad ;
    protected String titulo ;
    protected String gradoAca ;
    public ArrayList<Asignatura> dicta = new ArrayList();

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGradoAca() {
        return gradoAca;
    }

    public void setGradoAca(String gradoAca) {
        this.gradoAca = gradoAca;
    }
     
    public void agregar_asignatura(Asignatura asig){
        dicta.add(asig);
    }
}
