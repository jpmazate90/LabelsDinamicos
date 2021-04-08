/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author jpmazate
 */
public class Granja {
    private Suelo[][] suelo;

    public Granja(int cantidadCuadrosSueloX, int cantidadSueloY) {
        this.suelo = CreadorDeSuelo.crearSueloInicial(cantidadCuadrosSueloX, cantidadSueloY);
    }

    public Suelo[][] getSuelo() {
        return suelo;
    }

    public void setSuelo(Suelo[][] suelo) {
        this.suelo = suelo;
    }
    
    
    
}
