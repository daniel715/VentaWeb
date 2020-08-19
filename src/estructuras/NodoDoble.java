/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.io.Serializable;

/**
 *
 * @author CARLOS
 */
public class NodoDoble<T>implements Serializable{
    NodoDoble<T> siguiente;
    NodoDoble<T> anterior;
    T dato;
    public NodoDoble(){
        siguiente=null;
        anterior=null;
    }

    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }
    
}
