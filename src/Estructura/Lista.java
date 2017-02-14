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
public class Lista {
    private Nodo cabeza;
    private int longitud = 0;
private class Nodo {
    public Diccionario palabra;
    public Nodo siguiente;
    
    public Nodo(Diccionario palabra) {
        this.palabra = palabra;
    }
}   
public void insertarPrincipio(Diccionario palabra) {
    Nodo nodo = new Nodo(palabra);
    nodo.siguiente = cabeza;
    cabeza = nodo;
    longitud++;
}
public void insertarFinal(Diccionario palabra){
    Nodo nodo = new Nodo(palabra);
    if (cabeza == null) {
        cabeza = nodo;       
    }
    else {
    Nodo puntero = cabeza;
    while(puntero.siguiente != null) {
    puntero = puntero.siguiente;   
}
    puntero.siguiente = nodo;
}
    longitud++;
}

public void insertarDespues(int n, Diccionario palabra){
Nodo nodo = new Nodo(palabra);
if (cabeza == null) {
cabeza = nodo;
}
else {
Nodo puntero = cabeza;
int contador = 0;
    while(contador < n && puntero.siguiente != null) {
    puntero = puntero.siguiente;   
contador++;
}
nodo.siguiente = puntero.siguiente;
puntero.siguiente = nodo;
}
longitud++;
}

public Diccionario obtener(int n) {
if (cabeza == null) {
return null;
} else {
Nodo puntero = cabeza;
int contador = 0;
while (contador < n && puntero.siguiente != null) {
    puntero = puntero.siguiente;
    contador++;
}
if (contador != n){
    return null;
    
}
else
{
    return puntero.palabra;
}
}
}
public int contar() {
    return longitud;
}

public boolean estaVacio(){
    return cabeza ==null;
}
public void eliminarPrincipio(){
    if (cabeza != null) {
      
    
    Nodo primero = cabeza;
    cabeza = cabeza.siguiente;
    primero.siguiente = null;
    longitud--;
}
}


public void  eliminarUltimo() {
if (cabeza != null) {
if (cabeza.siguiente == null) {
cabeza = null;
}
else {

Nodo puntero = cabeza;
while (puntero.siguiente.siguiente != null) {
puntero = puntero.siguiente;
}

puntero.siguiente = null;
}
}
}
public void eliminarPalabra(int n) {
    if (cabeza != null) {
        if (n== 0){
            Nodo primero = cabeza;
            cabeza = cabeza.siguiente;
            primero.siguiente = null;
            longitud --;
        }
        else {
        
        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < (n-1)) {
            puntero = puntero.siguiente;
            contador ++;
        }
        Nodo temp = puntero.siguiente;
        puntero.siguiente = temp.siguiente;
        temp.siguiente = null;
        longitud--;
    }
}
}
}   


