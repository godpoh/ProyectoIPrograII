/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Logic.Log_In_Logic;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;

public class Log_In extends javax.swing.JFrame {

    public Log_In() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Principal = new javax.swing.JPanel();
        lblIniciarSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        lblImagenExit = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        lblIniciarSesion.setText("INICIAR SESION");
        Pnl_Principal.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, 40));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("USUARIO");
        Pnl_Principal.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        Pnl_Principal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 350, 40));

        lblContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContrasena.setForeground(new java.awt.Color(0, 0, 0));
        lblContrasena.setText("CONTRASEÑA");
        Pnl_Principal.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        Pnl_Principal.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        txtContrasena.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("********");
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });
        Pnl_Principal.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 350, 40));

        lblImagenExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnExit__1_-removebg-preview.png"))); // NOI18N
        lblImagenExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImagenExitMouseClicked(evt);
            }
        });
        Pnl_Principal.add(lblImagenExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        lblImagen.setForeground(new java.awt.Color(204, 204, 204));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pxfuel.jpg"))); // NOI18N
        Pnl_Principal.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 579, 419));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Pnl_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Log_In_Logic login = new Log_In_Logic();
        login.Open_Principal_Panel_Logic(txtUsuario, txtContrasena);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblImagenExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenExitMouseClicked
        Window window = SwingUtilities.getWindowAncestor(lblImagenExit);
        window.dispose();
    }//GEN-LAST:event_lblImagenExitMouseClicked

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Log_In_Logic login = new Log_In_Logic();
            login.Open_Principal_Panel_Logic(txtUsuario, txtContrasena);
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContrasena.requestFocus();

            Log_In_Logic login = new Log_In_Logic();
            login.Default_Text_PSW(txtContrasena, txtUsuario);
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed
        Log_In_Logic login = new Log_In_Logic();
        login.Default_Text_PSW(txtContrasena, txtUsuario);
    }//GEN-LAST:event_txtContrasenaMousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        Log_In_Logic login = new Log_In_Logic();
        login.Default_Text_User_Field(txtUsuario, txtContrasena);
    }//GEN-LAST:event_txtUsuarioMousePressed


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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagenExit;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
