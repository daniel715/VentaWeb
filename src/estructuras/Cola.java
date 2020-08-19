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
public class Cola<T> implements Serializable{
    Nodo<T> finalf;
    Nodo<T> frente;
    public Cola(){
        finalf=null;
        frente=null;
    }

    public Nodo<T> getFinalf() {
        return finalf;
    }

    public void setFinalf(Nodo<T> finalf) {
        this.finalf = finalf;
    }

    public Nodo<T> getFrente() {
        return frente;
    }

    public void setFrente(Nodo<T> frente) {
        this.frente = frente;
    }
    
    public void encolar(T tem){
        Nodo<T> aux = new Nodo();
        aux.setDato(tem);
        if(vacio()){
            frente=aux;
            finalf=aux;
        }
        else{
            finalf.setSiguiente(aux);
            finalf=finalf.getSiguiente();
        }
    }
    public Nodo<T> Decolar(){
        if(vacio()){
            return null;
        }
        else{
            Nodo<T> aux=frente;
            if(frente==finalf){
                frente=null;
                finalf=null;
            }
            else{
                frente=aux.getSiguiente();
            }
            return aux;
        }
    }
    public boolean vacio(){
        if(frente==null && finalf==null)
            return true;
        else
            return false;
    }
    
    public void vaciar()
    {
        frente=null;
        finalf=null;
    }
    public int Contar(){
        int i=0;
        for (Nodo<T>aux=frente; aux!=null; aux=aux.getSiguiente()) {
            i++;
        }
        return i;
    }
}