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
public class Diccionario {
     private String palabra;
     
     public Diccionario(String palabra){
         this.palabra = palabra;
     }
     
     public String getPalabra() { return palabra; }
     public void setPalabra (String palabra) {this.palabra=palabra;
}
}
