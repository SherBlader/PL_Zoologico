/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author Omar
 */
public class Animal {
    
    
    public Animal sig;

    public Animal(long idAnimal, String nombreAnimal, Date fechaEntrada, String categoria, String nombreCategoria) {
        this.idAnimal = idAnimal;
        this.nombreAnimal = nombreAnimal;
        this.fechaEntrada = fechaEntrada;
        this.categoria = categoria;
        this.nombreCategoria = nombreCategoria;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    private long idAnimal;
    private String nombreAnimal;
    private Date fechaEntrada;
    private String categoria;
    private String nombreCategoria;
    
    public Animal()
    {
        
    }

    
    
    
    
}
