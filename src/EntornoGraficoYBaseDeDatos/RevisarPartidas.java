/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGraficoYBaseDeDatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RevisarPartidas extends javax.swing.JFrame {

    /**
     * Creates new form RevisarPartidas
     */
    public RevisarPartidas() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        PorResultado = new javax.swing.JButton();
        PorNombre = new javax.swing.JButton();
        PorRango = new javax.swing.JButton();
        Todas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatosParti = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Seleccione por que desea buscar la/las partida/partidas");

        PorResultado.setText("Por Resultado");
        PorResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorResultadoActionPerformed(evt);
            }
        });

        PorNombre.setText("Por Nombre");
        PorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorNombreActionPerformed(evt);
            }
        });

        PorRango.setText("Por Rango");
        PorRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorRangoActionPerformed(evt);
            }
        });

        Todas.setText("Todas");
        Todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodasActionPerformed(evt);
            }
        });

        TablaDatosParti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Partida", "Resultado", "Farmeo", "Kills", "Muertes", "Asistencias", "Vision", "Rango", "Elo"
            }
        ));
        jScrollPane2.setViewportView(TablaDatosParti);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PorResultado)
                        .addGap(18, 18, 18)
                        .addComponent(PorNombre)
                        .addGap(18, 18, 18)
                        .addComponent(PorRango)
                        .addGap(18, 18, 18)
                        .addComponent(Todas))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PorResultado)
                    .addComponent(PorNombre)
                    .addComponent(PorRango)
                    .addComponent(Todas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PorResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorResultadoActionPerformed
        Panel obx=new Panel();
        ArrayList<Object[]> base=new ArrayList<>();
        String use=obx.usuario;
        String result=JOptionPane.showInputDialog(null,"Introduce el resultado a buscar");
        base=BaseDeDatos.Select.selectResultado(use,result);
        DefaultTableModel modelo =(DefaultTableModel) TablaDatosParti.getModel();
        modelo=BaseDeDatos.Select.blanco();
        for(Object[] ele:base){
            modelo.addRow(ele);
        }
        TablaDatosParti.setModel(modelo);
    }//GEN-LAST:event_PorResultadoActionPerformed

    private void PorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorNombreActionPerformed
        Panel obx=new Panel();
        ArrayList<Object[]> base=new ArrayList<>();
        String use=obx.usuario;
        String result=JOptionPane.showInputDialog(null,"Introduce el nombre a buscar");
        base=BaseDeDatos.Select.selectNombre(use,result);
        DefaultTableModel modelo =(DefaultTableModel) TablaDatosParti.getModel();
        modelo=BaseDeDatos.Select.blanco();
        for(Object[] ele:base){
            modelo.addRow(ele);
        }
        TablaDatosParti.setModel(modelo);
    }//GEN-LAST:event_PorNombreActionPerformed

    private void PorRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorRangoActionPerformed
        Panel obx=new Panel();
        ArrayList<Object[]> base=new ArrayList<>();
        String use=obx.usuario;
        String result=JOptionPane.showInputDialog(null,"Introduce el rango a buscar");
        base=BaseDeDatos.Select.selectRango(use,result);
        DefaultTableModel modelo =(DefaultTableModel) TablaDatosParti.getModel();
        modelo=BaseDeDatos.Select.blanco();
        for(Object[] ele:base){
            modelo.addRow(ele);
        }
        TablaDatosParti.setModel(modelo);
    }//GEN-LAST:event_PorRangoActionPerformed

    private void TodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodasActionPerformed
        Panel obx=new Panel();
        ArrayList<Object[]> base=new ArrayList<>();
        String use=obx.usuario;
        base=BaseDeDatos.Select.selectAll(use);
        DefaultTableModel modelo =(DefaultTableModel) TablaDatosParti.getModel();
        modelo=BaseDeDatos.Select.blanco();
        for(Object[] ele:base){
            modelo.addRow(ele);
        }
        TablaDatosParti.setModel(modelo);
    }//GEN-LAST:event_TodasActionPerformed

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
            java.util.logging.Logger.getLogger(RevisarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RevisarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RevisarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RevisarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RevisarPartidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PorNombre;
    private javax.swing.JButton PorRango;
    private javax.swing.JButton PorResultado;
    public javax.swing.JTable TablaDatosParti;
    private javax.swing.JButton Todas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
