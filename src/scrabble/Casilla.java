/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import javax.swing.JLabel;

/**
 *
 * @author TOSHIBA P55
 */
public class Casilla {
    JLabel label;
    int coorX;
    int coorY;
    String tipo;
    Ficha ficha;
    
    public Casilla(int x, int y,String tipo){
        this.coorX = x;
        this.coorY = y;
        this.tipo = tipo;
        this.ficha = null;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
