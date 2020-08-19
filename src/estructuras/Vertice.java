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
public class Vertice implements Serializable{
    String nombre;
    Entrega entrega;
    int indice;

    public Vertice(Entrega entrega) {
        this.nombre= entrega.getDistrito();
        this.entrega = entrega;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
