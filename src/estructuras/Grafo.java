/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import clases.Entrega;
import java.io.Serializable;

/**
 *
 * @author Jorge M
 */
public class Grafo implements Serializable{
    public Vertice vertices[] = new Vertice[10];
    public Arista aristas[][] = new Arista[10][10];
    public Vertice inicioV;
    public int numVertices=0;
    public int numAristas=0;
    public Arista aristasBase[][]= new Arista[10][10];
    public Vertice verticesBase[] = new Vertice[10];
    public int pesos[][] = {{0,12,10,7,8,18,12,13},{12,0,4,8,7,10,11,16},{10,4,0,10,5,7,10,11},{7,8,10,0,3,10,5,6}
                           ,{8,7,5,3,0,9,5,4},{18,10,7,10,9,0,10,13},{12,11,10,5,5,10,0,3},{13,16,11,6,4,13,3,0}};
    public Entrega empresa;
    
    public void vertices_Base(){
        Entrega aux1 = new Entrega();
        aux1.setDistrito("CALLAO");
        Entrega aux2 = new Entrega();
        aux2.setDistrito("RIMAC");
        Entrega aux3 = new Entrega();
        aux3.setDistrito("EL AGUSTINO");
        Entrega aux4 = new Entrega();
        aux4.setDistrito("SAN MIGUEL");
        Entrega aux5 = new Entrega();
        aux5.setDistrito("JESUS MARIA");
        Entrega aux6 = new Entrega();
        aux6.setDistrito("SANTA ANITA");
        Entrega aux7 = new Entrega();
        aux7.setDistrito("SAN BORJA");
        Entrega aux8 = new Entrega();
        aux8.setDistrito("MIRAFLORES");
        verticesBase[0] = new Vertice(aux1);
        verticesBase[1] = new Vertice(aux2);
        verticesBase[2] = new Vertice(aux3);
        verticesBase[3] = new Vertice(aux4);
        verticesBase[4] = new Vertice(aux5);
        verticesBase[5] = new Vertice(aux6);
        verticesBase[6] = new Vertice(aux7);
        verticesBase[7] = new Vertice(aux8);
        inicioV = vertices[4];
        empresa = aux5;
        insertarVertice(aux5);
    }
    
    public void aristas_Base(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                aristasBase[i][j] = new Arista();
                aristasBase[i][j].setPeso(pesos[i][j]);
            }
        }
    }
    
    public void insertarVertice(Entrega nuevo){
        Vertice aux = new Vertice(nuevo);
        aux.setIndice(numVertices);
        vertices[numVertices]= aux;
        numVertices = numVertices + 1;    
    }
    
    public void insertarArista(Entrega distrito1, Entrega distrito2){
        Vertice inicio = buscarVertice(distrito1.getDistrito());
        Vertice fin = buscarVertice(distrito2.getDistrito());
        if(inicio !=null && fin!=null){
            Arista nuevo = new Arista();
            nuevo.setPeso(extraerPeso(inicio, fin));
            nuevo.setVertFin(fin.getIndice());
            nuevo.setVertInicio(inicio.getIndice());
            aristas[inicio.getIndice()][fin.getIndice()] = nuevo;
            numAristas = numAristas + 1 ;
        }
        else
            System.out.println("Vertices no existentes");
    }
    public Vertice buscarVertice(String distritoAux){
        for (int i = 0; i < vertices.length; i++) {
            if(vertices[i].getNombre().equals(distritoAux)){
                return vertices[i];
            }
        }
        return null;
    }
    
    public int extraerPeso(Vertice inicioAux, Vertice finAux){
        int fila = -1;
        int columna = -1;
        for (int i = 0; i < verticesBase.length; i++) {
            if(verticesBase[i].getNombre().equals(inicioAux.getNombre())){
                fila = i;
                break;
            }
        }
        for (int j = 0; j < verticesBase.length; j++) {
            if(verticesBase[j].getNombre().equals(finAux.getNombre())){
                columna = j;
                break;
            }
        }
        Arista busc = aristasBase[fila][columna];
        return busc.getPeso();
    }
}
