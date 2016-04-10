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
public class ListaL_Animal {
    
    
    public Animal cabAnim;
    
    
     
    public void crearLista()
    {
        this.cabAnim =null;	
    }
    
    
    public boolean listaVacia()
    {
  	if(this.cabAnim==null)
  	  return true;
  	else
  	  return false;  
  	
    }
    
    
    public void insertarFinal(Animal x)
    {
        if (listaVacia())
        {
            this.cabAnim = x;
            x.sig = null;
        }
        else
        {
            Animal tem = this.cabAnim;
            while (tem.sig != null)
            {
                tem = tem.sig;
            }
            tem.sig = x;
            x.sig = null;
            x = this.cabAnim;
        }
    }
    
    
}
