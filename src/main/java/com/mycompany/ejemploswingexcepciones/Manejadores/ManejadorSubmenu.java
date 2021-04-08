/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploswingexcepciones.Manejadores;

import ExcepcionesPropias.ExcepcionFormEstudiante;
import com.mycompany.ejemploswingexcepciones.Frontend.Submenu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpmazate
 */
public class ManejadorSubmenu {
    
    private Submenu submenu;

    public ManejadorSubmenu(Submenu submenu) {
        this.submenu = submenu;
    }
    
    public void realizarCambio() throws ExcepcionFormEstudiante{
       validarFormulario();
       submenu.getEstudiante().setApellido(submenu.getApellidoField().getText());
       submenu.getEstudiante().setNombre(submenu.getNombreField().getText());        
       submenu.getEstudiante().setRegistroAcademico(Integer.parseInt(submenu.getRegistroField().getText()));     
       submenu.setVisible(false);
       submenu.dispose();
    }
    
    public void validarFormulario() throws ExcepcionFormEstudiante{
        validarCampoVacio(submenu.getApellidoField().getText(), "Apellido");
        validarCampoVacio(submenu.getNombreField().getText(), "Nombre");
        convertirNumero(submenu.getRegistroField().getText(), "RegistroAcademico");
        
    }
    
    public void validarCampoVacio(String campo, String tipoDato) throws ExcepcionFormEstudiante{
        if(campo.equals("")){
            throw new ExcepcionFormEstudiante("Error en el formulario de estudiante. El campo "+tipoDato+" esta vacio.");
        }
    }
    
    public int convertirNumero(String dato, String tipoDato) throws ExcepcionFormEstudiante{
        try {
            int resultado = Integer.parseInt(dato);
            if(resultado<0){
                throw new ExcepcionFormEstudiante("El campo: "+tipoDato+" no puede ser un numero negativo, dato ingresado:"+dato);
            }else{
                return resultado;
            }
            
        } catch (NumberFormatException e) {
            throw new ExcepcionFormEstudiante("Error del tipo: "+e.getClass()+" en el formulario de estudiante. El campo: "+tipoDato+" no es un numero, dato ingresado:"+dato);
        }
    }
    
}
