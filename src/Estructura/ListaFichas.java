/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;
import ObjetosJuego.Ficha;
/**
 *
 * @author TOSHIBA P55
 */
public class ListaFichas { 
    NodoFicha cabeza;
    NodoFicha ultimo;
    public ListaFichas(){
           cabeza = null;
           ultimo = null;
    }
    
    //METER A COLAR
    public void Insertar(NodoFicha nuevo){
        if(isEmpty()){
            cabeza = nuevo;
            ultimo = nuevo;
        }
        else{
            ultimo.setSiguiente(nuevo);
            nuevo = ultimo;
        }
    }
    
    public Ficha  obtenerFicha(int index){
        Ficha retorno = null;
        int contador=1;
        if(!isEmpty() && index>1 && index<= Count()){
            NodoFicha aux1 = this.cabeza;
            NodoFicha aux2 = this.cabeza.getSiguiente();
            while(index!=contador){
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();
            }
            retorno = aux2.getFicha();
            aux1.getSiguiente().setSiguiente(aux1.getSiguiente().getSiguiente());
            aux2.setSiguiente(null);
        }
        else{
            if(!isEmpty() && index<=1){
                if(index == 0){
                    retorno = this.cabeza.getFicha();
                    this.cabeza = null;
                }
                if(index == 1){
                    retorno = this.cabeza.getSiguiente().getFicha();
                    this.cabeza.setSiguiente(this.cabeza.getSiguiente().getSiguiente());
                }
            }
        }
        return retorno;
    }
    //SI ESTA VACÍA
    public boolean isEmpty(){
        return cabeza ==null;
    }
    
    public int Count(){
        if(!isEmpty()){
            return 0;
        }
        else{
            int contador=0;
            NodoFicha aux = this.cabeza;
            while(aux!=null){
              aux = aux.getSiguiente();
              contador++;
            }
            return contador;
        }
    }
}
