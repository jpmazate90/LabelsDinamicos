/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploswingexcepciones.Frontend;

import com.mycompany.ejemploswingexcepciones.Manejadores.ManejadorSuelo;
import granja.Granja;
import java.awt.GridLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author jpmazate
 */
public class GranjaFrame extends javax.swing.JFrame {

    private ManejadorSuelo manejadorDeSuelo;
    private Granja granja;
    public GranjaFrame(int cantidadCuadrosSueloX, int cantidadCuadrosSueloY) {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.sueloPanel.setLayout(new GridLayout(cantidadCuadrosSueloX, cantidadCuadrosSueloY));
        asignarDato(cantidadCuadrosSueloX, cantidadCuadrosSueloY);
    }
    
    public void asignarDato(int cantidadX, int cantidadY){
        this.granja = new Granja(cantidadX, cantidadY);
        manejadorDeSuelo = new ManejadorSuelo(sueloPanel, granja.getSuelo(), cantidadX, cantidadY);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sueloPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout sueloPanelLayout = new javax.swing.GroupLayout(sueloPanel);
        sueloPanel.setLayout(sueloPanelLayout);
        sueloPanelLayout.setHorizontalGroup(
            sueloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        sueloPanelLayout.setVerticalGroup(
            sueloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sueloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sueloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel sueloPanel;
    // End of variables declaration//GEN-END:variables
}
