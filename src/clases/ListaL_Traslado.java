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
public class ListaL_Traslado {
    
    public Traslado cabTras;
    
    public void crearLista()
    {
        this.cabTras =null;	
    }
    
    
    public boolean listaVacia()
    {
  	if(this.cabTras==null)
  	  return true;
  	else
  	  return false;  
  	
    }
    
    public void insertarFinal(Traslado x)
    {
        if (listaVacia())
        {
            this.cabTras = x;
            x.sig = null;
        }
        else
        {
            Traslado tem = this.cabTras;
            while (tem.sig != null)
            {
                tem = tem.sig;
            }
            tem.sig = x;
            x.sig = null;
            x = this.cabTras;
        }
    }
}
