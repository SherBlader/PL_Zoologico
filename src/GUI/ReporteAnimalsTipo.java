/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import clases.Animal;
import clases.Archivo;
import clases.Jaula;
import javax.swing.JOptionPane;
import static GUI.FPrincipal.*;

/**
 *
 * @author Dickson
 */
public class ReporteAnimalsTipo extends javax.swing.JFrame {
    private DefaultTableModel model;

    /**
     * Creates new form ListadoGuardias
     */
    public ReporteAnimalsTipo() {
        this.setTitle("Animales por Tipo");
        
        URL url = getClass().getResource("/Img/4.png");
        ImageIcon img =new ImageIcon(url);
        setIconImage(img.getImage());
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        String data[][] = {};
        String col[] = {"Nombre","Id","Id Categoria","Tipo"};
        model = new DefaultTableModel(data,col);
        salida.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrol = new javax.swing.JScrollPane();
        salida = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tipoCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(151, 193, 225));

        jPanel1.setBackground(new java.awt.Color(151, 193, 225));

        scrol.setBackground(new java.awt.Color(151, 193, 225));
        scrol.setForeground(new java.awt.Color(151, 193, 225));

        salida.setForeground(new java.awt.Color(151, 193, 225));
        salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        salida.setGridColor(new java.awt.Color(151, 193, 225));
        salida.setSelectionBackground(new java.awt.Color(151, 193, 225));
        scrol.setViewportView(salida);
        if (salida.getColumnModel().getColumnCount() > 0) {
            salida.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            salida.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            salida.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            salida.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo:");

        tipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Archivo Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Reporte Por Tipo de Animal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrol, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(scrol, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboActionPerformed

        
        limpiarJTable();
        String seleccionCategoria = (String)tipoCombo.getSelectedItem();
        java.util.StringTokenizer st = new java.util.StringTokenizer(seleccionCategoria, "-");
        String cat = st.nextToken();
        long categoria= Long.parseLong(cat);//Categoria id
        
        
        
        Jaula p = ListaJaula.cabJau;
        
        
        int i = 0;
        while (p != null)
        {
            
            for (int h=0; h<p.listaA.size(); h++)//Busca dentro de cada jaula todos los animales y compara con la categoria
            {
                Animal a=null;
                a= (Animal)p.listaA.get(h);
                
                if (Long.parseLong(a.getCategoria()) == categoria )
                {
                    model.insertRow(i,new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                    model.setValueAt(a.getNombreAnimal(), i, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO                 
                    model.setValueAt(a.getIdAnimal(), i, 1);                 
                    model.setValueAt(a.getCategoria(), i, 2); 
                    model.setValueAt(a.getNombreCategoria(), i, 3);
                    i++;
                }

            }
            
            p = p.sig;
        }
        
        
        
        
    }//GEN-LAST:event_tipoComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        String seleccionCategoria = (String)tipoCombo.getSelectedItem();
        java.util.StringTokenizer st = new java.util.StringTokenizer(seleccionCategoria, "-");
        String cat = st.nextToken();
//        long categoria= Long.parseLong(cat);//Categoria id
        
        String cadena="Nombre \t Id \t IdCategoria \t Tipo \n";
        
        Jaula p = ListaJaula.cabJau;
        
        while (p != null)
        {
            for (int h=0; h<p.listaA.size(); h++)
            {
                Animal a=null;
                a= (Animal)p.listaA.get(h);
                if (a.getCategoria().equals(cat))
                { 
                    cadena += a.getNombreAnimal()+ "\t" + a.getIdAnimal()+"\t"+a.getCategoria()+
                            "\t"+a.getNombreCategoria()+"\n";
                }            
            }
            p = p.sig;
        }

        Archivo.crear_archivo("Listado Animales Por Tipo.xls", cadena);
        JOptionPane.showMessageDialog(null, "Archivo Creado");
    }//GEN-LAST:event_jButton1ActionPerformed

    void limpiarJTable()
    {
        int a =model.getRowCount()-1;  //Índices van de 0 a n-1
       
        for(int i=a;i>=0;i--)
            model.removeRow(i);
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimalsTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimalsTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimalsTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimalsTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteAnimalsTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable salida;
    private javax.swing.JScrollPane scrol;
    public static javax.swing.JComboBox tipoCombo;
    // End of variables declaration//GEN-END:variables
}