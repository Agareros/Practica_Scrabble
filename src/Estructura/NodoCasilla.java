/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import Estructura.Casillas;
/**
 *
 * @author TOSHIBA P55
 */
public class NodoCasilla {
     NodoCasilla siguiente;
    Casillas casilla;
    
    public NodoCasilla(Casillas casilla){
        this.casilla = casilla;
    }

    public NodoCasilla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCasilla siguiente) {
        this.siguiente = siguiente;
    }

    public Casillas getCasilla() {
        return casilla;
    }

    public void setCasilla(Casillas casilla) {
        this.casilla = casilla;
    }
}
