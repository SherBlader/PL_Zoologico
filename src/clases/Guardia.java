/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Omar
 */
public class Guardia {

    
    

    public Guardia(String cedula_guardia, String nombre_guardia, String telefono, String email, boolean estado) 
    {
        this.cedula_guardia = cedula_guardia;
        this.nombre_guardia = nombre_guardia;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
    
    
    public String getCedula_guardia() {
        return cedula_guardia;
    }

    public void setCedula_guardia(String cedula_guardia) {
        this.cedula_guardia = cedula_guardia;
    }

    public String getNombre_guardia() {
        return nombre_guardia;
    }

    public void setNombre_guardia(String nombre_guardia) {
        this.nombre_guardia = nombre_guardia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    public Guardia sig;
    
    private String cedula_guardia;
    private String nombre_guardia;
    private String telefono;
    private String email;
    private boolean estado;
    
    
    
    //Constructor Vacio
    public Guardia()
    {
        
    }
    
    
}//end class Guardia
