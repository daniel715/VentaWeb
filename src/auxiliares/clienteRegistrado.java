/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import clases.Cliente;

/**
 *
 * @author CARLOS
 */
public class clienteRegistrado extends Cliente{
    private String correo;
    private String contra;
    private String repetición;
    private String foto;
    private String fnacimiento;

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getRepetición() {
        return repetición;
    }

    public void setRepetición(String repetición) {
        this.repetición = repetición;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
}