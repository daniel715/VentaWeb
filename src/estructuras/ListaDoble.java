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
public class ListaDoble <T>implements Serializable{
    NodoDoble<T> finalf;
    NodoDoble<T> inicio;
    public ListaDoble(){
        finalf=null;
        inicio=null;
    }

    public NodoDoble<T> getFinalf() {
        return finalf;
    }

    public NodoDoble<T> getInicio() {
        return inicio;
    }
    
    public void insertarFinal(T tem){
        NodoDoble<T> aux1=new NodoDoble();
        aux1.dato=tem;
        if(inicio==null){
            inicio=aux1;
            finalf=aux1;
        }else{
            NodoDoble<T> aux2 = inicio;
            while(aux2.siguiente!=null){
                aux2=aux2.siguiente;
            }
            aux2.siguiente=aux1;
            aux1.anterior=aux2;
            finalf=aux1;
        }
    }
    public int Contar(){
        int i=0;
        for (NodoDoble<T> aux=inicio; aux!=null; aux=aux.getSiguiente()) {
            i++;
        }
        return i;
    }
    public void eliminar(T dat){
        NodoDoble<T> aux=new NodoDoble();
        int band=0;
        if(finalf==null && inicio==null){
            System.out.println("Lista vacia");
        }
        else{
            aux=inicio;
            while(aux.siguiente!=null && band!=1){
                if(aux.getDato().equals(dat)){
                    band=1;
                }
                aux=aux.siguiente;
            }
            if(band==0){
                System.out.println("Elemento no encontrado");
            }
            else{
                if(dat==inicio.dato){
                    inicio=inicio.siguiente;
                    inicio.anterior=null;
                }
                else{
                    if(dat==finalf.dato){
                        finalf=finalf.anterior;
                        finalf.siguiente=null;
                    }else{
                        NodoDoble<T> r=aux.anterior;
                        NodoDoble<T> y=aux.siguiente;
                        r.siguiente=y;
                        y.anterior=r; 
                    }                      
                }
            }
        }
    }
}
