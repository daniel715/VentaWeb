/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.io.Serializable;

/**
 *
 * @author Jorge M
 */
public class Arista implements Serializable {
    private int peso;
    private int  vertInicio;
    private int  vertFin;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVertInicio() {
        return vertInicio;
    }

    public void setVertInicio(int inicio) {
        this.vertInicio = inicio;
    }

    public int getVertFin() {
        return vertFin;
    }

    public void setVertFin(int fin) {
        this.vertFin = fin;
    }
}
