/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

/**
 *
 * @author user
 */
public class Principal_Panel extends javax.swing.JFrame {

    public Principal_Panel() {
        initComponents();
        setLocationRelativeTo(null);
        Pnl_SubM.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Btn_Gestion_Equipos = new javax.swing.JButton();
        Btn_Gestion_de_Torneos = new javax.swing.JButton();
        Btn_Registro_Partidos = new javax.swing.JButton();
        Btn_Estadisticas = new javax.swing.JButton();
        Pnl_SubM = new javax.swing.JPanel();
        Btn_Registro_Goleadores = new javax.swing.JButton();
        Btn_Tabla_Posicion_Equipos = new javax.swing.JButton();
        Btn_Tabla_Sanciones = new javax.swing.JButton();
        Pnl_Titulo = new javax.swing.JPanel();
        Lbl_Titulo = new javax.swing.JLabel();
        Lbl_Cerrar = new javax.swing.JLabel();
        Pnl_Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Menu.setBackground(new java.awt.Color(52, 102, 255));
        Pnl_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/download__2_-removebg-preview.png"))); // NOI18N
        Pnl_Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 130));

        Btn_Gestion_Equipos.setBackground(new java.awt.Color(51, 102, 255));
        Btn_Gestion_Equipos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Gestion_Equipos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Gestion_Equipos.setText("Gestión de Equipos");
        Btn_Gestion_Equipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Gestion_Equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestion_EquiposActionPerformed(evt);
            }
        });
        Pnl_Menu.add(Btn_Gestion_Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 150, 50));

        Btn_Gestion_de_Torneos.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Gestion_de_Torneos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Gestion_de_Torneos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Gestion_de_Torneos.setText("Gestión de Torneos");
        Btn_Gestion_de_Torneos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Gestion_de_Torneos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Gestion_de_TorneosActionPerformed(evt);
            }
        });
        Pnl_Menu.add(Btn_Gestion_de_Torneos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 50));

        Btn_Registro_Partidos.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Registro_Partidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Registro_Partidos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registro_Partidos.setText("Registro de Partidos");
        Btn_Registro_Partidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Registro_Partidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registro_PartidosActionPerformed(evt);
            }
        });
        Pnl_Menu.add(Btn_Registro_Partidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 150, 50));

        Btn_Estadisticas.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Estadisticas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Estadisticas.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Estadisticas.setText("Estadísticas");
        Btn_Estadisticas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EstadisticasActionPerformed(evt);
            }
        });
        Pnl_Menu.add(Btn_Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 50));

        Pnl_SubM.setBackground(new java.awt.Color(52, 102, 255));
        Pnl_SubM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_Registro_Goleadores.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Registro_Goleadores.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Btn_Registro_Goleadores.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registro_Goleadores.setText(" Registro de goleadores  ");
        Btn_Registro_Goleadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Registro_Goleadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Registro_GoleadoresActionPerformed(evt);
            }
        });

        Btn_Tabla_Posicion_Equipos.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Tabla_Posicion_Equipos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Btn_Tabla_Posicion_Equipos.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tabla_Posicion_Equipos.setText("Tabla de posiciones de los equipos  ");
        Btn_Tabla_Posicion_Equipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Tabla_Posicion_Equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Tabla_Posicion_EquiposActionPerformed(evt);
            }
        });

        Btn_Tabla_Sanciones.setBackground(new java.awt.Color(52, 102, 255));
        Btn_Tabla_Sanciones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Btn_Tabla_Sanciones.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Tabla_Sanciones.setText("Tabla de sanciones");
        Btn_Tabla_Sanciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btn_Tabla_Sanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Tabla_SancionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pnl_SubMLayout = new javax.swing.GroupLayout(Pnl_SubM);
        Pnl_SubM.setLayout(Pnl_SubMLayout);
        Pnl_SubMLayout.setHorizontalGroup(
            Pnl_SubMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_SubMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_SubMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Tabla_Sanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Tabla_Posicion_Equipos, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(Btn_Registro_Goleadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Pnl_SubMLayout.setVerticalGroup(
            Pnl_SubMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_SubMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Registro_Goleadores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Tabla_Posicion_Equipos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Tabla_Sanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pnl_Menu.add(Pnl_SubM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, 180));

        getContentPane().add(Pnl_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 650));

        Pnl_Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Pnl_Titulo.setPreferredSize(new java.awt.Dimension(760, 50));

        Lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Lbl_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Lbl_Titulo.setText("Menú Principal");

        Lbl_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnExit__1_-removebg-preview.png"))); // NOI18N
        Lbl_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Pnl_TituloLayout = new javax.swing.GroupLayout(Pnl_Titulo);
        Pnl_Titulo.setLayout(Pnl_TituloLayout);
        Pnl_TituloLayout.setHorizontalGroup(
            Pnl_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_TituloLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Lbl_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                .addComponent(Lbl_Cerrar)
                .addContainerGap())
        );
        Pnl_TituloLayout.setVerticalGroup(
            Pnl_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lbl_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(Pnl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 610, -1));

        Pnl_Contenedor.setPreferredSize(new java.awt.Dimension(610, 600));

        javax.swing.GroupLayout Pnl_ContenedorLayout = new javax.swing.GroupLayout(Pnl_Contenedor);
        Pnl_Contenedor.setLayout(Pnl_ContenedorLayout);
        Pnl_ContenedorLayout.setHorizontalGroup(
            Pnl_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        Pnl_ContenedorLayout.setVerticalGroup(
            Pnl_ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(Pnl_Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 610, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void Btn_Gestion_EquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestion_EquiposActionPerformed
        // Instancia del panel de los productos
        Team_Managment Team = new Team_Managment();
        Team.setSize(610, 600);
        Team.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Team);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();
    }//GEN-LAST:event_Btn_Gestion_EquiposActionPerformed

    private void Btn_Gestion_de_TorneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Gestion_de_TorneosActionPerformed
        Tournament_Management Tournament_Window = new Tournament_Management();

        Tournament_Window.setSize(610, 600);
        Tournament_Window.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Tournament_Window);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();

    }//GEN-LAST:event_Btn_Gestion_de_TorneosActionPerformed

    private void Btn_Registro_PartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registro_PartidosActionPerformed
        Match_Registration Match_Window = new Match_Registration();

        Match_Window.setSize(610, 600);
        Match_Window.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Match_Window);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();
    }//GEN-LAST:event_Btn_Registro_PartidosActionPerformed

    private void Btn_EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EstadisticasActionPerformed
        Pnl_SubM.setVisible(true);
    }//GEN-LAST:event_Btn_EstadisticasActionPerformed

    private void Lbl_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Lbl_CerrarMouseClicked

    private void Btn_Registro_GoleadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Registro_GoleadoresActionPerformed
        Pnl_SubM.setVisible(false);

        Scorer_Record Scorer_Window = new Scorer_Record();

        Scorer_Window.setSize(610, 600);
        Scorer_Window.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Scorer_Window);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();

    }//GEN-LAST:event_Btn_Registro_GoleadoresActionPerformed

    private void Btn_Tabla_Posicion_EquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tabla_Posicion_EquiposActionPerformed
        Pnl_SubM.setVisible(false);

        Team_Position_Table Team_Position_Window = new Team_Position_Table();

        Team_Position_Window.setSize(610, 600);
        Team_Position_Window.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Team_Position_Window);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();

    }//GEN-LAST:event_Btn_Tabla_Posicion_EquiposActionPerformed

    private void Btn_Tabla_SancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tabla_SancionesActionPerformed
        Pnl_SubM.setVisible(false);

        Sanctions_Table Sanctions_Window = new Sanctions_Table();

        Sanctions_Window.setSize(610, 600);
        Sanctions_Window.setLocation(0, 0);

        Pnl_Contenedor.removeAll();
        Pnl_Contenedor.add(Sanctions_Window);

        Pnl_Contenedor.revalidate();
        Pnl_Contenedor.repaint();

    }//GEN-LAST:event_Btn_Tabla_SancionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Estadisticas;
    private javax.swing.JButton Btn_Gestion_Equipos;
    private javax.swing.JButton Btn_Gestion_de_Torneos;
    private javax.swing.JButton Btn_Registro_Goleadores;
    private javax.swing.JButton Btn_Registro_Partidos;
    private javax.swing.JButton Btn_Tabla_Posicion_Equipos;
    private javax.swing.JButton Btn_Tabla_Sanciones;
    private javax.swing.JLabel Lbl_Cerrar;
    private javax.swing.JLabel Lbl_Titulo;
    private javax.swing.JPanel Pnl_Contenedor;
    private javax.swing.JPanel Pnl_Menu;
    private javax.swing.JPanel Pnl_SubM;
    private javax.swing.JPanel Pnl_Titulo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
