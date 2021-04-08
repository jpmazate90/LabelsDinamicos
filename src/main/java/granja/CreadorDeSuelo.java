/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import Enums.TipoDeSuelo;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author jpmazate
 */
public class CreadorDeSuelo {
    
    
    public static Suelo[][] crearSueloInicial(int cantidadCuadrosueloX, int cantidadCuadroSueloY){
        Suelo cuadroDeSuelo;
        Suelo[][] suelo = new Suelo[cantidadCuadrosueloX][cantidadCuadroSueloY];
        for (int i = 0; i < cantidadCuadrosueloX; i++) {
            for (int j = 0; j < cantidadCuadroSueloY; j++) {
                SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,"Fila:" + (i + 1) + " Columna:" + (j + 1) );
                 jlabel.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        SuperficieJLabel label=(SuperficieJLabel)evt.getComponent();
                        JOptionPane.showMessageDialog(null,"Fila:"+(label.getNumeroFila()) +" Columna:"+(label.getNumeroColumna()));
                    }
                 });
                 
                 cuadroDeSuelo = new Suelo(TipoDeSuelo.DESIERTO, jlabel,false);
                 suelo[i][j] = cuadroDeSuelo;
            }
            
        }
        return suelo;
    }
}
