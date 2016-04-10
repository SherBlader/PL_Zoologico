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
public class Traslado {
    
    
    
    public Traslado()
    {
        
    }

    
    
    public Traslado sig;

    public Traslado(String nombreAnimal, long idTraslado, long idJaulaFuente, long idJaulaDestino, long categoria, Date fechaTraslado) {
        this.nombreAnimal = nombreAnimal;
        this.idTraslado = idTraslado;
        this.idJaulaFuente = idJaulaFuente;
        this.idJaulaDestino = idJaulaDestino;
        this.categoria = categoria;
        this.fechaTraslado = fechaTraslado;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public long getIdTraslado() {
        return idTraslado;
    }

    public void setIdTraslado(long idTraslado) {
        this.idTraslado = idTraslado;
    }

    public long getIdJaulaFuente() {
        return idJaulaFuente;
    }

    public void setIdJaulaFuente(long idJaulaFuente) {
        this.idJaulaFuente = idJaulaFuente;
    }

    public long getIdJaulaDestino() {
        return idJaulaDestino;
    }

    public void setIdJaulaDestino(long idJaulaDestino) {
        this.idJaulaDestino = idJaulaDestino;
    }

    public long getCategoria() {
        return categoria;
    }

    public void setCategoria(long categoria) {
        this.categoria = categoria;
    }

    public Date getFechaTraslado() {
        return fechaTraslado;
    }

    public void setFechaTraslado(Date fechaTraslado) {
        this.fechaTraslado = fechaTraslado;
    }

    

    
    
    private String nombreAnimal;
    private long idTraslado;
    private long idJaulaFuente;
    private long idJaulaDestino;
    private long categoria;
    private Date fechaTraslado;
    
    
}
