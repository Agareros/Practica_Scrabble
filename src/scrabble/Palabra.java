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
public class Palabra {
    
    //ATRIBUTOS PALABRAS
    private String valor;
    
    public Palabra(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return this.valor;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
}
