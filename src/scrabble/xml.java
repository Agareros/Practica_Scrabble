
package scrabble;
import java.io.File;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

import javax.swing.JOptionPane;
import Estructura.*;
/**
 *
 * @author TOSHIBA P55
 */
public class xml {
    
    //Atributos
    Palabras listaP = new Palabras();
   Estructura.Casillas listaCasillas = new Estructura.Casillas();
    Integer dimensionJuego;
    
    //CONSTRUCTOR
    
     public xml(){
         
     }
     
     //METODO PRINCIPAL
     public boolean leemeElXML(String ruta){
         boolean estadoLectura = true;
         try{
            File xml = new File(ruta);
            DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbn = db.newDocumentBuilder();
            org.w3c.dom.Document doc = dbn.parse(xml);
            doc.getDocumentElement().normalize();
            //LECTURA DE PALABRAS EN XML
            NodeList nList = doc.getElementsByTagName("palabra");
            for(int i = 0; i<nList.getLength(); i++){
                Node node = nList.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    this.listaP.insertarEnLista(new NodoPalabra(new Palabra(node.getTextContent())));
                }
            }
            NodeList nList1 = doc.getElementsByTagName("dimension");
            for(int i =0; i<nList1.getLength(); i++){
                Node node = nList1.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    dimensionJuego = Integer.parseInt(node.getTextContent());
                }
            }
            //LECTURA DE DOBLES
            NodeList nList2 = doc.getElementsByTagName("dobles");
            for(int x = 0; x<nList2.getLength(); x++){
                NodeList casillas = nList2.item(x).getChildNodes();
                for(int y = 0; y<casillas.getLength();y++){
                    Node casilla = casillas.item(y);
                    if(casilla.getNodeType()==Node.ELEMENT_NODE){
                        int corx = 0;
                        int cory = 0;
                        String tipo = "doble";
                        org.w3c.dom.Element elementoCasilla = (org.w3c.dom.Element) casilla;
                        NodeList coordenadas = elementoCasilla.getChildNodes();
                        for(int g = 0; g<coordenadas.getLength();g++){
                            Node el = coordenadas.item(g);
                            if(el.getNodeType()==Node.ELEMENT_NODE){
                                org.w3c.dom.Element ele = (org.w3c.dom.Element) el;
                                switch(ele.getTagName()){
                                    case "x":
                                        System.out.println("X: "+ele.getTextContent());
                                        corx = Integer.parseInt(ele.getTextContent());
                                        break;
                                    case "y":
                                        System.out.println("Y: "+ele.getTextContent());
                                        cory = Integer.parseInt(ele.getTextContent());
                                        break;
                                }
                            }
                        }
                    listaCasillas.addToList(new NodoCasilla(new Casilla(corx,cory,tipo)));
                    System.out.println("---FIN CASILLA---");
                    }
                    
                }
            }
            //LECTURA DE TRIPLES
            NodeList nList3 = doc.getElementsByTagName("triples");
            for(int x = 0; x<nList2.getLength(); x++){
                NodeList casillas = nList3.item(x).getChildNodes();
                for(int y = 0; y<casillas.getLength();y++){
                    Node casilla = casillas.item(y);
                    if(casilla.getNodeType()==Node.ELEMENT_NODE){
                        int corx = 0;
                        int cory = 0;
                        String tipo = "triple";
                        org.w3c.dom.Element elementoCasilla = (org.w3c.dom.Element) casilla;
                        NodeList coordenadas = elementoCasilla.getChildNodes();
                        for(int g = 0; g<coordenadas.getLength();g++){
                            Node el = coordenadas.item(g);
                            if(el.getNodeType()==Node.ELEMENT_NODE){
                                org.w3c.dom.Element ele = (org.w3c.dom.Element) el;
                                switch(ele.getTagName()){
                                    case "x":
                                        System.out.println("X: "+ele.getTextContent());
                                        corx = Integer.parseInt(ele.getTextContent());
                                        break;
                                    case "y":
                                        System.out.println("Y: "+ele.getTextContent());
                                        cory = Integer.parseInt(ele.getTextContent());
                                        break;
                                }
                            }
                        }
                    listaCasillas.addToList(new NodoCasilla(new Casilla(corx,cory,tipo)));
                    System.out.println("---FIN CASILLA---");
                    }
                    
                }
            }
            
            //FIN DE LECTURA DE PALABRAS XML
         }
         catch(Exception e){
             estadoLectura = false;
         }
         return estadoLectura;
     }
     
     //GETTERS Y SETTERS
     public Palabras getListaP() {
        return listaP;
    }

    public void setListaP(Palabras listaP) {
        this.listaP = listaP;
    }

    public Casillas getListaCasillas() {
        return listaCasillas;
    }

    public void setListaCasillas(Casillas listaCasillas) {
        this.listaCasillas = listaCasillas;
    }

    public Integer getDimensionJuego() {
        return dimensionJuego;
    }

    public void setDimensionJuego(Integer dimensionJuego) {
        this.dimensionJuego = dimensionJuego;
    }

}
