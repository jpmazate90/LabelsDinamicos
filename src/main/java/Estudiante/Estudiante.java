/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author jpmazate
 */
public class Estudiante {
    
    private String  nombre;
    private String apellido;
    private Integer registroAcademico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(Integer registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public Estudiante(String nombre, String apellido, Integer registroAcademico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.registroAcademico = registroAcademico;
    }
    
    
    
    
    
}
