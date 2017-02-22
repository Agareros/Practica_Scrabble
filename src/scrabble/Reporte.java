/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabble;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import Estructura.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author TOSHIBA P55
 */
public class Reporte {
        
    public Reporte(){
        //CONSTRUCTOR
    }
    
    public boolean generarReporteDiccionario(Palabras diccionario){
        boolean estado = true;
        try{
            crearDot("Diccionario",diccionario.textoParaDot());
        }
        catch(Exception e){
            estado = false;
        }
        return estado;   
    }
    
    public boolean generarReporteDeColaDeFichas(Estructura.Ficha fichas){
        boolean estado = true;
        try{
            crearDot("ColaFichas", fichas.textoDot());
        }   
        catch(Exception ex){
            estado = false;
        }
        return estado;
    }
    
    private void escribirHTML(String nombre){
        File f;
        FileWriter escribir;
        try{
            f = new File(nombre+".html");
            escribir = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribir);
            PrintWriter salida = new PrintWriter(bw);
            salida.write("<!DOCTYPE html>\n" +
    "<html lang='en'>\n" +
    "  <head>\n" +
    "    <meta charset='utf-8'>\n" +
    "    <meta http-equiv='X-UA-Compatible' content='IE=edge'>\n" +
    "    <meta name='viewport' content='width=device-width, initial-scale=1'>\n" +
    "    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n" +
    "    <title>DEFAULT VIEW</title>\n" +
    "\n" +
    "  </head>\n" +
    "  <body bgcolor='#D8D8D8'>\n" +
    "  <center><img src='"+nombre+".png'></center>\n" +
    "  </body>\n" +
    "</html>");
            salida.close();
            bw.close();
        }
        catch(Exception Ex){
            
        }
    }
    
    private void crearDot(String nombre, String texto){
        File f;
        FileWriter escribir;
        try{
            f = new File(nombre+".txt");
            escribir = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribir);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(texto);
            salida.close();
            bw.close();
            generarImagen(nombre);
            escribirHTML(nombre);
        }
        catch(Exception e){
            
        }
    }
    
    private void generarImagen(String nombre){
        File f = new File(".");
        
            String dotPath ="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
            String fileOut = f.getAbsolutePath()+"\\"+nombre+".png";
            String param = "-Tpng";
            String input = f.getAbsolutePath()+"\\"+nombre+".txt";
            String toP = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = param;
            cmd[2] = input;
            cmd[3] = toP;
            cmd[4] = fileOut;
            Runtime rt = Runtime.getRuntime();
            
        try {
            rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
