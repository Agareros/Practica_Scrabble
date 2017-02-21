/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

/**
 *
 * @author TOSHIBA P55
 */
public class Nodo {
        public String posicion;

    public Nodo arriba = null;
    public Nodo abajo = null;
    public Nodo siguiente = null;
    public Nodo anterior = null;

    public Nodo(String posicion) {
        this.posicion = posicion;
    }
    public Nodo(){
        
    }
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    
    public Nodo getArriba() {
        return arriba;
    }

    public void setArriba(Nodo arriba) {
        this.arriba = arriba;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
}
