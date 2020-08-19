/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estructuras.Cola;
import java.io.Serializable;

/**
 *
 * @author CARLOS
 */
public class Cliente implements Serializable,Comparable<Cliente>{
    private String nombre;
    private int edad;
    private int dni;
    private int nroCompras;
    private Cola carrito;

    public Cola getCarrito() {
        return carrito;
    }

    public void setCarrito(Cola carrito) {
        this.carrito = carrito;
    }

    public int getNroCompras() {
        return nroCompras;
    }

    public void setNroCompras(int nroCompras) {
        this.nroCompras = nroCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Cliente o) {
        return nombre.compareTo(o.getNombre());
    }

}
