/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import auxiliares.clienteRegistrado;
import clases.Cliente;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paosds
 */
public class Vector implements Serializable{
    
    ArrayList clientes = new ArrayList();

    public ArrayList getClientes() {
        return clientes;
    }
    
    
    public void insertarcliente( clienteRegistrado cliente )
    {
        clientes.add(cliente); 
    }
    
    public Cliente buscar( String nombre )
    {
        if(!clientes.isEmpty()){
        clienteRegistrado aux;
        int i=0;
        while( i < clientes.size())
        {
            aux=(clienteRegistrado)clientes.get(i);
            if( nombre == aux.getNombre())
            {
                return aux;
            }
        i++;
        }
        return null;
    }
        else
            JOptionPane.showMessageDialog(null, " No hay clientes", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
            return null;
    }
    
    public Boolean estavacio()
    {
        return clientes.isEmpty();
    }
    
    
}
