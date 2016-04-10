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
public class ListaL_Categoria {
    
    
    public Categoria cabCat;
    
    
    public void crearLista()
    {
        this.cabCat =null;	
    }
    
    
    
    public boolean listaVacia()
    {
  	if(this.cabCat==null)
  	  return true;
  	else
  	  return false;  
  	
    }
    
    public void insertarFinal(Categoria x)
    {
        if (listaVacia())
        {
            this.cabCat = x;
            x.sig = null;
        }
        else
        {
            Categoria tem = this.cabCat;
            while (tem.sig != null)
            {
                tem = tem.sig;
            }
            tem.sig = x;
            x.sig = null;
            x = this.cabCat;
        }
    }
    
}
