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
public class listaSimple<T> implements Serializable {
    private Nodo<T> cab;

    public listaSimple() {
        cab=null;
    }

    public Nodo getCab() {
        return cab;
    }

    public void setCab(Nodo<T> cab) {
        this.cab = cab;
    }
    
    public void insertarFinal(T tem){
        Nodo<T> aux1=new Nodo();
        aux1.setDato(tem);
        if(cab==null){
            cab=aux1;
        }else{
            Nodo<T> aux2 = cab;
            while(aux2.siguiente!=null){
                aux2=aux2.siguiente;
            }
            aux2.siguiente=aux1;
        }
    }
    public int Contar(){
        int i=0;
        for (Nodo<T>aux=cab; aux!=null; aux=aux.getSiguiente()) {
            i++;
        }
        return i;
    }
    public Nodo<T> buscar(int pop){
        int p=0;
        if(pop==0){
            return cab;
        }
        else{
            Nodo<T> aux2 = cab;
            for (int i = 0; i < pop; i++) {
                aux2=aux2.siguiente;
            }
            return aux2;
        }
    }
}
