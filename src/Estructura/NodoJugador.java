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
public class NodoJugador {
    
 Jugador jugador;
 NodoJugador next;
 
 public NodoJugador (Jugador Player){
     this.jugador = Player;
     this.next = null; //posiblemente sea sin el this
 }
 
 public Jugador getJugador(){
     return jugador;
 }
 
 public void setJugador (Jugador jugador) {
     this.jugador = jugador;
 }
 
 public void setSiguiente (NodoJugador next) {
     this.next = next;
 }
 
public NodoJugador getNext () {
    return next;

}
}
