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
public class Casillas { 
    NodoCasilla cabeza;
    NodoCasilla ultimo;
    
    public Casillas(){
        this.cabeza = null;
        this.ultimo = null;
    }    
    
    public void addToList(NodoCasilla nuevo){
        if(isEmpty()){
            this.cabeza = nuevo;
            this.ultimo = nuevo;
            this.cabeza.setSiguiente(ultimo);
        }
        else{
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    public String showList(){
         String retorno = "";
        if(!isEmpty()){
            NodoCasilla aux = this.cabeza;
            while(aux!=null){
                retorno = retorno+"|Casilla: Tipo: "+aux.getCasilla().getTipo()+" X:"+aux.getCasilla().getCoorX()+" Y: "+aux.getCasilla().getCoorY()+"|--->";
                aux = aux.getSiguiente();
            }
        }
        else{
            retorno = "Lista Vacía";
        }
        return retorno;
    }
    
    public boolean isEmpty(){
        return this.cabeza == null;
    }
}
