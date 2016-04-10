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
import static GUI.FPrincipal.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Dickson
 */
public class ReporteAnimals extends javax.swing.JFrame {
    private DefaultTableModel model;

    /**
     * Creates new form ListadoGuardias
     */
    public ReporteAnimals() {
        this.setTitle("Todos Los Animales");
        
        URL url = getClass().getResource("/Img/4.png");
        ImageIcon img =new ImageIcon(url);
        setIconImage(img.getImage());
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        String data[][] = {};
        String col[] = {"Nombre","Id","Jaula","Categoria"};
        model = new DefaultTableModel(data,col);
        salida.setModel(model);
        
        


        Jaula p = ListaJaula.cabJau;
        Animal a=null;
        
        int i = 0;//Para imprimir las jaulas en orden
        while (p != null)
        {
            
            for (int h=0; h<p.listaA.size(); h++)
            {
                //Muestro todos los animales en la tabla
                a= (Animal)p.listaA.get(h);
                model.insertRow(i,new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                model.setValueAt(a.getNombreAnimal(), i, 0);  // ACTUALIZA LA CELDA CON EL VALOR DE CAMPO OBTENIDO                 
                model.setValueAt(a.getIdAnimal(), i, 1);                 
                model.setValueAt(p.getIdJaula(), i, 2); 
                model.setValueAt(a.getNombreCategoria(), i, 3);
                i++;
            }
            p = p.sig;       
        }        
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

        jButton1.setText("Generar Archivo Excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Reporte Animales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrol, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(161, 161, 161)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(scrol, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String cadena="Nombre \t Id \t Id Jaula \t Tipo \n";
        
        Jaula z = ListaJaula.cabJau;
        
        
        while (z != null)
        {
            for (int h=0; h<z.listaA.size(); h++)
            {
                Animal a = null;
                a= (Animal)z.listaA.get(h);
                cadena+= a.getNombreAnimal()+ "\t" + a.getIdAnimal()+"\t"+z.getIdJaula()+
                        "\t"+a.getNombreCategoria()+"\n";
            }
            z = z.sig;
        }

        Archivo.crear_archivo("Listado Total Animales.xls", cadena);
        JOptionPane.showMessageDialog(null, "Archivo Creado");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReporteAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteAnimals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteAnimals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable salida;
    private javax.swing.JScrollPane scrol;
    // End of variables declaration//GEN-END:variables
}
