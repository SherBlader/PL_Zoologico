/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Jaula {

    public Jaula(long idJaula, String cedulaGuardia, long capacidad) {
        this.idJaula = idJaula;
        this.cedulaGuardia = cedulaGuardia;
        this.capacidad = capacidad;
    }

    public long getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(long idJaula) {
        this.idJaula = idJaula;
    }

    public String getCedulaGuardia() {
        return cedulaGuardia;
    }

    public void setCedulaGuardia(String cedulaGuardia) {
        this.cedulaGuardia = cedulaGuardia;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }
    
    public Jaula(long tras) {
        this.tras = tras;
    }

    public long getTras() {
        return tras;
    }

    public void setTras(long tras) {
        this.tras = tras;
    }
    
    public Jaula()
    {
        
    }
    
    
    public Jaula sig;
    
    private long idJaula;
    private String cedulaGuardia;
    private long capacidad;
    
    private long tras;
    
    public ArrayList listaA = new ArrayList();  //Lista de animales

    //Hacen falta traspasos
    
}
