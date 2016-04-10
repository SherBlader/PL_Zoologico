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
public class ListaL_Jaula {
    
    
    public Jaula cabJau;
    
    
    
    public void crearLista()
    {
        this.cabJau =null;	
    }
    
    
    public boolean listaVacia()
    {
  	if(this.cabJau==null)
  	  return true;
  	else
  	  return false;  
  	
    }
    
    public void insertarFinal(Jaula x)
    {
        if (listaVacia())
        {
            this.cabJau = x;
            x.sig = null;
        }
        else
        {
            Jaula tem = this.cabJau;
            while (tem.sig != null)
            {
                tem = tem.sig;
            }
            tem.sig = x;
            x.sig = null;
            x = this.cabJau;
        }
    }
    
    
    public void imprimir()
    {
        String cad = "";
        Jaula tem = this.cabJau;
        
        if (listaVacia())
        {
            cad= "La lista esta vacia";
        }
        else
        {
            while (tem != null)
            {
                cad += tem.getIdJaula()+ " " + tem.getCedulaGuardia()+ " " + tem.getCapacidad()+ "\n";
            }
        }
  
    }
    
    
    
    public boolean buscar(long x)
    {
        boolean saber = false; //temporal!
        
        if (listaVacia())
        {
            javax.swing.JOptionPane.showMessageDialog(null, "La Lista Esta Vacia");
        }
        else
        {
            Jaula tem=this.cabJau;
            while (tem !=null)
            {
                if (tem.getIdJaula() == x)
                {
                    saber = true;
                    break;
                }
                else
                {
                    tem = tem.sig;
                }
            }
        }   
        
        return saber;
        
    }

    
    
}
