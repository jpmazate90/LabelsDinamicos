/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.awt.Component;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author jpmazate
 */
public class SuperficieJLabel extends JLabel {
    
    private int numeroFila;
    private int numeroColumna;

    public SuperficieJLabel(int numeroFila, int numeroColumna, String text) {
        super(text);
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
    }

    public int getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public Component getLabelFor() {
        return labelFor;
    }

    public void setLabelFor(Component labelFor) {
        this.labelFor = labelFor;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
    
    
}
