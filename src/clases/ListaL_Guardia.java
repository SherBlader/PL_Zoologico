/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class ListaL_Guardia {
    
    public static Guardia aux;
    public Guardia cabGuar;
    
    
    
    
    public void crearLista()
    {
        this.cabGuar =null;	
    }
    
    
    public boolean listaVacia()
    {
  	if(this.cabGuar==null)
  	  return true;
  	else
  	  return false;  
  	
    }
    
    
    public void insertarFinal(Guardia x)
    {
        if (listaVacia())
        {
            this.cabGuar = x;
            x.sig = null;
        }
        else
        {
            Guardia tem = this.cabGuar;
            while (tem.sig != null)
            {
                tem = tem.sig;
            }
            tem.sig = x;
            x.sig = null;
            x = this.cabGuar;
        }
    }
    
    
    public void imprimir()
    {
        String cad = "";
        Guardia tem = this.cabGuar;
        
        if (listaVacia())
        {
            cad= "La lista esta vacia";
        }
        else
        {
            while (tem != null)
            {
                cad += tem.getCedula_guardia() + " " + tem.isEstado() + " " + tem.getNombre_guardia() + "\n";
            }
        }
  
    }
    
    
    public boolean buscar(String x)
    {
        boolean saber = false; //temporal!
        
        if (listaVacia())
        {
            JOptionPane.showMessageDialog(null, "La Lista Esta Vacia");
        }
        else
        {
            Guardia tem=this.cabGuar;
            while (tem != null)
            {
                if (tem.getCedula_guardia().equals(x))
                {
                    aux = tem;
                    saber = true;
                    break;
                }
                else
                {
                    tem =tem.sig;
                }
            }
        }   
        
        return saber;
        
    }
    

    
    
    
    public void soloNumeros(JTextField a) 
    {
        a.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if (Character.isLetter(c))
                {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "Solo Numeros en Este Campo");
                }
            }
        });
    }
    
    public void soloLetras(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) 
                {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "Solo Letras en Este Campo");
                }
            }
        });
    }
    
    
    //method modificar
    public void modificar(Guardia x)
    {
        buscar(x.getCedula_guardia());
        
        if (aux == null)
        {
            JOptionPane.showMessageDialog(null, "No se pueden hacer Modificaciones");
        }
        
        else
        {
            aux.setNombre_guardia(x.getNombre_guardia());
            aux.setTelefono(x.getTelefono());
            aux.setEmail(x.getEmail());
        }
             
    }//end method modificar
   
   
    
    
  
    
    
    
    
}//end class ListaL_Guardia
