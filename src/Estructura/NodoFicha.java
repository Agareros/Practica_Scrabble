/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import scrabble.Ficha;
/**
 *
 * @author TOSHIBA P55
 */
public class NodoFicha {
      NodoFicha siguiente;
    Ficha ficha;
    
    public NodoFicha(Ficha ficha){
        this.ficha = ficha;
        this.siguiente = null;
    }

    public NodoFicha getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFicha siguiente) {
        this.siguiente = siguiente;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
    
    
    
}
