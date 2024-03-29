/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGraficoYBaseDeDatos;

import javax.swing.JOptionPane;
import Imagen.Imagen;
import excepciones.Excepcion;

public class Panel extends javax.swing.JFrame {
    public static String usuario;
    String conectado="NO";
    SonidoFondo music = new SonidoFondo();
    String musica="NO";
    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        
        Imagen Imagen = new Imagen();
            jPanel2.add(Imagen);
            jPanel2.repaint();
            
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        Pregunta = new javax.swing.JLabel();
        Revisar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        BorrarBuild = new javax.swing.JButton();
        BorrarPartida = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JTextField();
        NombreUsuarioTexto = new javax.swing.JLabel();
        ConODescon = new javax.swing.JButton();
        CrearBuild = new javax.swing.JButton();
        ConsultarBuild = new javax.swing.JButton();
        ModificarBuild = new javax.swing.JButton();
        Mute = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Almacen");
        setResizable(false);

        Bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenido.setText("Desconectado");

        Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        Pregunta.setText("Que accion desea realizar?");

        Revisar.setText("Revisar partidas guardadas");
        Revisar.setEnabled(false);
        Revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar una partida");
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        BorrarBuild.setText("Borrar una build");
        BorrarBuild.setEnabled(false);
        BorrarBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBuildActionPerformed(evt);
            }
        });

        BorrarPartida.setText("Borrar una partida concreta");
        BorrarPartida.setEnabled(false);
        BorrarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarPartidaActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar los datos de una partida");
        Modificar.setEnabled(false);
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        NombreUsuarioTexto.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuarioTexto.setText("Nombre de usuario");

        ConODescon.setText("Conectar");
        ConODescon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConODesconActionPerformed(evt);
            }
        });

        CrearBuild.setText("Crear una build");
        CrearBuild.setEnabled(false);
        CrearBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBuildActionPerformed(evt);
            }
        });

        ConsultarBuild.setText("Revisar build");
        ConsultarBuild.setEnabled(false);
        ConsultarBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBuildActionPerformed(evt);
            }
        });

        ModificarBuild.setText("Modificar los datos de una build");
        ModificarBuild.setEnabled(false);
        ModificarBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBuildActionPerformed(evt);
            }
        });

        Mute.setText("Iniciar");
        Mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConODescon))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bienvenido)
                                    .addComponent(NombreUsuarioTexto)
                                    .addComponent(Pregunta))
                                .addGap(87, 87, 87)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mute))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Revisar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Guardar)
                                .addGap(117, 117, 117)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CrearBuild)
                                    .addComponent(ConsultarBuild)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modificar)
                                    .addComponent(BorrarPartida))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BorrarBuild)
                                    .addComponent(ModificarBuild))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreUsuarioTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConODescon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mute))
                .addGap(18, 18, 18)
                .addComponent(Bienvenido)
                .addGap(28, 28, 28)
                .addComponent(Pregunta)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Revisar)
                    .addComponent(ConsultarBuild))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(CrearBuild))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrarPartida)
                    .addComponent(BorrarBuild))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar)
                    .addComponent(ModificarBuild))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBuildActionPerformed
        CrearBuild obx=new CrearBuild();
        obx.setVisible(true);
    }//GEN-LAST:event_CrearBuildActionPerformed

    private void ConODesconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConODesconActionPerformed
        if(conectado=="NO"&&NombreUsuario.getText().isEmpty()){
            Excepcion obx=new Excepcion();
            obx.Excepcion("Introduzca un usuario");
        }else if(conectado=="SI"){
            NombreUsuario.setEditable(true);
            ConODescon.setText("Conectar");
            usuario="";
            Bienvenido.setText("Desconectado");
            Revisar.setEnabled(false);
            ConsultarBuild.setEnabled(false);
            Guardar.setEnabled(false);
            BorrarBuild.setEnabled(false);
            BorrarPartida.setEnabled(false);
            Modificar.setEnabled(false);
            ModificarBuild.setEnabled(false);
            CrearBuild.setEnabled(false);
            conectado="NO";
        }else if(conectado=="NO"){
            NombreUsuario.setEditable(false);
            ConODescon.setText("Desconectar");
            usuario=NombreUsuario.getText();
            Bienvenido.setText("Bienvenido "+usuario);
            Revisar.setEnabled(true);
            ConsultarBuild.setEnabled(true);
            Guardar.setEnabled(true);
            BorrarBuild.setEnabled(true);
            BorrarPartida.setEnabled(true);
            Modificar.setEnabled(true);
            ModificarBuild.setEnabled(true);
            CrearBuild.setEnabled(true);
            NombreUsuario.setText("");
            conectado="SI";
        }
    }//GEN-LAST:event_ConODesconActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        CrearGuardar obx=new CrearGuardar();
        obx.setVisible(true);

    }//GEN-LAST:event_GuardarActionPerformed

    private void RevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarActionPerformed
        RevisarPartidas obx=new RevisarPartidas();
        obx.setVisible(true);
    }//GEN-LAST:event_RevisarActionPerformed

    private void ConsultarBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBuildActionPerformed
        RevisarBuilds obx=new RevisarBuilds();
        obx.setVisible(true);
    }//GEN-LAST:event_ConsultarBuildActionPerformed

    private void BorrarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarPartidaActionPerformed
        BaseDeDatos.Borrar.borrar();
    }//GEN-LAST:event_BorrarPartidaActionPerformed

    private void BorrarBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBuildActionPerformed
        BaseDeDatos.Borrar.borrarB();
    }//GEN-LAST:event_BorrarBuildActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        ModificarPartida obx=new ModificarPartida();
        obx.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void ModificarBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBuildActionPerformed
        ModificarBuilds obx =new ModificarBuilds();
        obx.setVisible(true);
    }//GEN-LAST:event_ModificarBuildActionPerformed

    private void MuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuteActionPerformed
       
        if(musica=="SI"){
            music.Mute();
            musica="NO";
            Mute.setText("Iniciar");
           
        }else if(musica=="NO"){
            Mute.setText("Silenciar");
            music = new SonidoFondo();
            music.start();
            musica="SI";
            
        }
    }//GEN-LAST:event_MuteActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JButton BorrarBuild;
    private javax.swing.JButton BorrarPartida;
    private javax.swing.JButton ConODescon;
    private javax.swing.JButton ConsultarBuild;
    private javax.swing.JButton CrearBuild;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarBuild;
    private javax.swing.JButton Mute;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel NombreUsuarioTexto;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JButton Revisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
