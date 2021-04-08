/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploswingexcepciones.Manejadores;

import granja.Suelo;
import javax.swing.JPanel;

/**
 *
 * @author jpmazate
 */
public class ManejadorSuelo {
    
    private JPanel sueloPanel;
    private Suelo[][] distribucionDeSuelo;
    private int cantidadCuadrosSueloX;
    private int cantidadCuadrosSueloY;

    public ManejadorSuelo(JPanel sueloPanel, Suelo[][] distribucionDeSuelo, int cantidadCuadrosSueloX, int cantidadCuadrosSueloY) {
        this.sueloPanel = sueloPanel;
        this.distribucionDeSuelo = distribucionDeSuelo;
        this.cantidadCuadrosSueloX = cantidadCuadrosSueloX;
        this.cantidadCuadrosSueloY = cantidadCuadrosSueloY;
        dibujarSuelo();
    }
    
    
    public void dibujarSuelo(){
        for (int i = 0; i < cantidadCuadrosSueloX; i++) {
            for (int j = 0; j < cantidadCuadrosSueloY; j++) {
                Suelo suelo = this.distribucionDeSuelo[i][j];
                this.sueloPanel.add(suelo.getSuperficieLabel());
            }
            
        }
    }
}
