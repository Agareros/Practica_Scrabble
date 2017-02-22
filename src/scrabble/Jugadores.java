/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;
import Estructura.ListaFichas;
/**
 *
 * @author TOSHIBA P55
 */
public class Jugadores {
    
    //Atributos JUGADOR
    private String N_Usuario;
    private ListaFichas fichasDeJugador;
    //FIN ATRIBUTOS
    
    //Constructor
    public Jugadores(String Nombre, ListaFichas fichasPl){
        this.N_Usuario = Nombre;
        this.fichasDeJugador = fichasPl;
    }
    
    //GETTER DEL NOMBRE DE USUARIO
    public void setUsuario(String user){
        this.N_Usuario = user;
    }
    //SETTER DEL NOMBRE DE USUARIO
    public String getUsuario(){
        return this.N_Usuario;
    }
}
