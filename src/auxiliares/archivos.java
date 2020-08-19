/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import clases.*;
import estructuras.*;
import java.io.*;

/**
 *
 * @author CARLOS
 */
public class archivos implements Serializable {
    FileOutputStream ostream;
    ObjectOutputStream obj;
    FileOutputStream ostream2;
    ObjectOutputStream obj2;
    FileOutputStream ostream3;
    ObjectOutputStream obj3;
    
    public void guardarProducto(listaSimple<Producto> nod){
        try{
            ostream = new FileOutputStream("Producto.txt");
            obj = new ObjectOutputStream(ostream);
            obj.writeObject(nod);
        }catch(FileNotFoundException ex){
            
        }catch (IOException ex) {
            ;
        }finally {
            try {
                if(ostream!=null) ostream.close();
                if(obj!=null) obj.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public listaSimple<Producto> cargarProducto() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream istream = new FileInputStream("Producto.txt");
	ObjectInputStream entrada = new ObjectInputStream(istream);
        listaSimple<Producto> al=(listaSimple<Producto>)entrada.readObject();
        return al;
    }
    public void guardarCliente(ListaDoble<clienteRegistrado> aux){
        try{
            ostream2 = new FileOutputStream("Registrado.txt");
            obj2 = new ObjectOutputStream(ostream2);
            obj2.writeObject(aux);
        }catch(FileNotFoundException ex){
            
        }catch (IOException ex) {
            ;
        }finally {
            try {
                if(ostream2!=null) ostream2.close();
                if(obj2!=null) obj2.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public ListaDoble<clienteRegistrado> cargarCliente() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream istream = new FileInputStream("Registrado.txt");
	ObjectInputStream entrada = new ObjectInputStream(istream);
        ListaDoble<clienteRegistrado> auxiliar=(ListaDoble<clienteRegistrado>)entrada.readObject();
        return auxiliar;
    }
    public void guardarCompra(Cola<Pedido> nod){
        try{
            ostream3 = new FileOutputStream("Compra.txt");
            obj3 = new ObjectOutputStream(ostream3);
            obj3.writeObject(nod);
        }catch(FileNotFoundException ex){
            
        }catch (IOException ex) {
            ;
        }finally {
            try {
                if(ostream3!=null) ostream3.close();
                if(obj3!=null) obj3.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public Cola<Pedido> cargarCompra() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream istream = new FileInputStream("Compra.txt");
	ObjectInputStream entrada = new ObjectInputStream(istream);
        Cola<Pedido> auxiliar=(Cola<Pedido>)entrada.readObject();
        return auxiliar;
    }
    
    public void guardarEntrega(Grafo aux) throws FileNotFoundException, IOException{
        FileOutputStream f1 = new FileOutputStream("Entregas.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(f1);
        o1.writeObject(aux);
        o1.close();
    }
    
    public Grafo cargarEntregas() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f1 = new FileInputStream("Entregas.txt");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        Grafo extraido = (Grafo)o1.readObject();
        o1.close();
        return extraido;
    } 
    
    public void guardarNR(ListaDoble<Cliente> aux) throws FileNotFoundException, IOException{
        FileOutputStream f1 = new FileOutputStream("NoRegistrados.txt");
        ObjectOutputStream o1 = new ObjectOutputStream(f1);
        o1.writeObject(aux);
        o1.close();
    }
    
    public ListaDoble<Cliente> cargarNR() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream f1 = new FileInputStream("NoRegistrados.txt");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        ListaDoble<Cliente> extraido = (ListaDoble<Cliente>)o1.readObject();
        o1.close();
        return extraido;
    } 
}