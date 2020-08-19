/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import interfaz.loginAdministrador;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARLOS
 */
public class administradorWeb implements Serializable{
    private String usuario;
    private String contraseña;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
 
    public void leerDatos(){
        String lectura;
        FileReader f = null;
        Boolean admi = false;
        try {
            f = new FileReader("Administrador.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(loginAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader b = new BufferedReader(f);
        try{
            while((lectura=b.readLine())!=null){
                if(lectura.equals("ADMINISTRADOR:")){
                    admi=true;
                }else{
                    if(admi.equals(true)){
                        usuario=lectura;
                        lectura=b.readLine();
                        contraseña=lectura;
                    }
                }
            }
            b.close();
        } catch (IOException ex) {
            Logger.getLogger(loginAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}