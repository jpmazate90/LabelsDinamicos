/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import Enums.TipoDeSuelo;

/**
 *
 * @author jpmazate
 */
public class Suelo {
    private TipoDeSuelo tipoDeSuelo;
    private SuperficieJLabel superficieLabel;
    private boolean estaComprado;

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public SuperficieJLabel getSuperficieLabel() {
        return superficieLabel;
    }

    public void setSuperficieLabel(SuperficieJLabel superficieLabel) {
        this.superficieLabel = superficieLabel;
    }

    public boolean isEstaComprado() {
        return estaComprado;
    }

    public void setEstaComprado(boolean estaComprado) {
        this.estaComprado = estaComprado;
    }

    public Suelo(TipoDeSuelo tipoDeSuelo, SuperficieJLabel superficieLabel, boolean estaComprado) {
        this.tipoDeSuelo = tipoDeSuelo;
        this.superficieLabel = superficieLabel;
        this.estaComprado = estaComprado;
    }
    
}
