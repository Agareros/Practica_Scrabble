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
public class MatrizOrtogonal {
    
public Nodo nuevo;

    public Integer dimensiones;
    public Nodo cabeza = new Nodo("[0,0]");
    
    public boolean estaVaciaCabeza() {
        return cabeza == null;
    }

    public MatrizOrtogonal (int dimension) {
        this.dimensiones = dimension - 1;
    }

    public void crearMatriz() {
       
        Nodo punteroCol = cabeza;
        Nodo punteroFil = cabeza;
        for (int i = 1; i <= dimensiones; i++) {
            nuevo = new Nodo("[0," + String.valueOf(i) + "]");
            punteroCol.siguiente = nuevo;   
            nuevo.anterior = punteroCol;
            punteroCol = nuevo;

            nuevo = new Nodo("[" + String.valueOf(i) + ",0]");
            punteroFil.abajo = nuevo;
            nuevo.arriba = punteroFil;
            punteroFil = nuevo;
        }

        
        Nodo auxFila1 = cabeza;
        Nodo auxFila0 = cabeza;

        for (int i = 0; i < dimensiones; i++) {
            auxFila1 = cabeza;
            auxFila0 = cabeza;
            for (int j = 0; j <= i; j++) {
                auxFila1 = auxFila1.abajo;
                if (j < i) {
                    auxFila0 = auxFila0.abajo;
                }
            }
            auxFila0 = auxFila0.siguiente;
            for (int k = 0; k < dimensiones; k++) {
                nuevo = new Nodo("[" + String.valueOf(i + 1) + "," + String.valueOf(k + 1) + "]"); //se crea el nodo

                auxFila1.siguiente = nuevo;
                nuevo.anterior = auxFila1;

                auxFila0.abajo = nuevo;
                nuevo.arriba = auxFila0;

                auxFila1 = nuevo;//aquí avanzo
                auxFila0 = auxFila0.siguiente;
            }

        }
    }

    public void imprimir() {

        Nodo recorrer = cabeza;
        Nodo recorrido2 = cabeza;
        for (int i = 0; i <= dimensiones; i++) {
            recorrido2 = recorrer;
            System.out.println("");
            for (int j = 0; j <= dimensiones; j++) {
                System.out.print(recorrido2.posicion);
                recorrido2 = recorrido2.siguiente;
            }
            recorrer = recorrer.abajo;
        }
        System.out.println("");
    }


    public void devolverPosicionMatriz(int fila, int columna) {

        if (fila > dimensiones) {
            fila = dimensiones;
        }
        if (columna > dimensiones) {
            columna = dimensiones;
        }
        Nodo recorrer = cabeza;
        Nodo recorrido2 = cabeza;

        for (int i = 0; i < fila; i++) {
            recorrer = recorrer.abajo;
        }
        for (int j = 0; j < columna; j++) {
            recorrer = recorrer.siguiente;
        }
        
        System.out.println("Nodo->: " + recorrer.posicion);

    }
     public void insertarElementoEnPosicion(int fila, int columna, String elemento) {

        if (fila > dimensiones) {
            fila = dimensiones;
        }
        if (columna > dimensiones) {
            columna = dimensiones;
        }
        Nodo recorrer = cabeza;
        Nodo recorrido2 = cabeza;

        for (int i = 0; i < fila; i++) { 
            recorrer = recorrer.abajo;
        }
        for (int j = 0; j < columna; j++) {
            recorrer = recorrer.siguiente;
        }
        recorrer.setPosicion(elemento);

    }
}
