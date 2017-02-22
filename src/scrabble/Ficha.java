/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

/**
 *
 * @author TOSHIBA P55
 */
public class Ficha {
    
    private String letra;
    private int puntaje;
    
   //CONSTRUCTOR
    public Ficha(String letter, int points){
        this.letra = letter;
        this.puntaje = points;
    }
    
    //GETTERS Y SETTERS
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
