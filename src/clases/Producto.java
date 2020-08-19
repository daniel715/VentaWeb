/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;


/**
 *
 * @author CARLOS
 */
public class Producto implements Serializable{
    private String descrip;
    private double precio[]=new double[6];
    private String tallas[]=new String[6];
    private int stock[]=new int[6];
    private String deport;
    private String foto;
    private double precioCompra[]=new double[6];

    public double getPrecioCompra(int p) {
        return precioCompra[p];
    }

    public void setPrecioCompra(double precioCompr,int po) {
        precioCompra[po]=precioCompr;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPrecio(int pos) {
        return precio[pos];
    }

    public void setPrecio(double pre,int u) {
        precio[u]=pre;
    }

    public String getTalla(int pos) {
        return tallas[pos];
    }

    public void setTalla(String dato,int pos) {
        tallas[pos]=dato;
    }

    public int getStock(int posi) {
        return stock[posi];
    }

    public void setStock(int stoc,int posi) {
        stock[posi]=stoc;
    }

    public String getDeport() {
        return deport;
    }

    public void setDeport(String deport) {
        this.deport = deport;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    public boolean comparacion(String dato){
        for (int i = 0; i < tallas.length; i++) {
            if(tallas[i].equals(dato)){
                return true;
            }
        }
        return false;
    }
    public int contarTallas(){
        int j=0;
        for (int i = 0; i < tallas.length; i++) {
            if(tallas[i]!=null){
                j=j+1;
            }
        }
        return j;
    }
    public int tallas(){
        return tallas.length;
    }
}
