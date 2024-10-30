/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

import Data.CUD_SQL;
import Data.Connection_SQL;
import static Data.Connection_SQL.get_Team_Id_By_Team_Name;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Match_Registration extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Match_Registration() throws SQLException {
        initComponents();
        Connection_SQL.Qry_Tournament(Jcb_Nombre_Torneo);
        Action_Listeners_Method();
    }



    private void Action_Listeners_Method() {

        Jcb_Partidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String Selected_Tournament = (String) Jcb_Nombre_Torneo.getSelectedItem();
                try {
                    int Tournament_Id = Connection_SQL.get_Tournament_Id_By_Tournament_Name(Selected_Tournament);
                    String Phase = (String) Jcb_Fase.getSelectedItem();
                    Connection_SQL.Load_Match_Names_Into_JCB(Tournament_Id, Phase, Jcb_Partidos);

                } catch (SQLException ex) {
                    Logger.getLogger(Tournament_Management.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rd = new javax.swing.ButtonGroup();
        Pnl_Tarjetas = new javax.swing.JPanel();
        Jcb_Nombre_Equipo = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        Jcb_Equipo_Ganador2 = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        Jcb_Equipo_Ganador3 = new javax.swing.JComboBox<>();
        Btn_Guardar1 = new javax.swing.JButton();
        Spinner_Tiempo = new javax.swing.JSpinner();
        jLabel90 = new javax.swing.JLabel();
        Pnl_Ingresar_Datos = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        Jcb_Nombre_Torneo = new javax.swing.JComboBox<>();
        jLabel76 = new javax.swing.JLabel();
        Jcb_Fase = new javax.swing.JComboBox<>();
        jLabel95 = new javax.swing.JLabel();
        Jcb_Equipo_Local = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        Jcb_Equipo_Visitante = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        JS_Goles_Local = new javax.swing.JSpinner();
        JS_Goles_Visitantes = new javax.swing.JSpinner();
        Jcb_Equipo_Ganador = new javax.swing.JComboBox<>();
        Btn_Guardar = new javax.swing.JButton();
        Jcb_Partidos = new javax.swing.JComboBox<>();
        Btn_Cargar_Local_Visitante = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_img = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Tarjetas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pnl_Tarjetas.setOpaque(false);
        Pnl_Tarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jcb_Nombre_Equipo.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Nombre_Equipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Nombre_Equipo.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Nombre_Equipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un equipo" }));
        Jcb_Nombre_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcb_Nombre_EquipoActionPerformed(evt);
            }
        });
        Pnl_Tarjetas.add(Jcb_Nombre_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, -1));

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Nombre del equipo");
        Pnl_Tarjetas.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        Jcb_Equipo_Ganador2.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Ganador2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Ganador2.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Ganador2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un jugador" }));
        Pnl_Tarjetas.add(Jcb_Equipo_Ganador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Importante: Debe seleccionar un partido");
        Pnl_Tarjetas.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setText("Nombre del jugador");
        Pnl_Tarjetas.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 0));
        jLabel89.setText("Minuto del Gol");
        Pnl_Tarjetas.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        Jcb_Equipo_Ganador3.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Ganador3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Ganador3.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Ganador3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una sancion" }));
        Pnl_Tarjetas.add(Jcb_Equipo_Ganador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 210, -1));

        Btn_Guardar1.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Guardar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Guardar1.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Guardar1.setText("+");
        Btn_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar1ActionPerformed(evt);
            }
        });
        Pnl_Tarjetas.add(Btn_Guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 40, -1));
        Pnl_Tarjetas.add(Spinner_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 70, -1));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("Sancion");
        Pnl_Tarjetas.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        add(Pnl_Tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 810, 120));

        Pnl_Ingresar_Datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pnl_Ingresar_Datos.setOpaque(false);
        Pnl_Ingresar_Datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Nombre del Torneo:");
        Pnl_Ingresar_Datos.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Jcb_Nombre_Torneo.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Nombre_Torneo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Nombre_Torneo.setForeground(new java.awt.Color(51, 51, 51));
        Pnl_Ingresar_Datos.add(Jcb_Nombre_Torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Fase");
        Pnl_Ingresar_Datos.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        Jcb_Fase.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Fase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Fase.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Fase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una fase", "Regular", "Semi-Final", "Final" }));
        Pnl_Ingresar_Datos.add(Jcb_Fase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Partido");
        Pnl_Ingresar_Datos.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        Jcb_Equipo_Local.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Local.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Local.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido" }));
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 210, -1));

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Equipo Local");
        Pnl_Ingresar_Datos.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Jcb_Equipo_Visitante.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Visitante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Visitante.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Visitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido" }));
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 210, -1));

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Goles");
        Pnl_Ingresar_Datos.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Equipo visitante");
        Pnl_Ingresar_Datos.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Goles");
        Pnl_Ingresar_Datos.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));
        Pnl_Ingresar_Datos.add(JS_Goles_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        Pnl_Ingresar_Datos.add(JS_Goles_Visitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        Jcb_Equipo_Ganador.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Ganador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Ganador.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Ganador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un ganador", " " }));
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 210, -1));

        Btn_Guardar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 90, 40));

        Jcb_Partidos.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Partidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Partidos.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Partidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido" }));
        Pnl_Ingresar_Datos.add(Jcb_Partidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, -1));

        Btn_Cargar_Local_Visitante.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Cargar_Local_Visitante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Cargar_Local_Visitante.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Cargar_Local_Visitante.setText("Cargar Partidos");
        Btn_Cargar_Local_Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cargar_Local_VisitanteActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Btn_Cargar_Local_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 40));

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Importante: Debe de seleccionar \"Seleccione un partido para que carguen los partidos\"");
        Pnl_Ingresar_Datos.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setText("Equipo Ganador");
        Pnl_Ingresar_Datos.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        add(Pnl_Ingresar_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 210));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 800, 330));

        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-textured-backgound.jpg"))); // NOI18N
        lbl_img.setText("jLabel1");
        add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 688));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        try {
            int Winner_Points = 3;
            int Loss_Points = 0;

            String Match_Name = (String) Jcb_Partidos.getSelectedItem();
            int Match_Id = Connection_SQL.get_Match_Id_By_Match_Name(Match_Name);
            int Local_Team_Id = Connection_SQL.get_Local_Team_By_Match_Id(Match_Id);
            int Visitant_Team_Id = Connection_SQL.get_Visitant_Team_By_Match_Id(Match_Id);
            
            int Local_Goals = (int) JS_Goles_Local.getValue();
            int Visitant_Goals = (int) JS_Goles_Visitantes.getValue();

            String Winner_Team = (String) Jcb_Equipo_Ganador.getSelectedItem();
            int Winner_Id = get_Team_Id_By_Team_Name(Winner_Team);

            int Winning_Id = 0;
            int Losing_Id = 0;
            int Winning_Points = 0;
            int Losing_Points = 0;

            if (Local_Goals > Visitant_Goals) {
                // El equipo local gana
                Winning_Id = Local_Team_Id;
                Losing_Id = Visitant_Team_Id;
                Winning_Points = Winner_Points;
                Losing_Points = Loss_Points;
            } else if (Local_Goals < Visitant_Goals) {
                // El equipo visitante gana
                Winning_Id = Visitant_Team_Id;
                Losing_Id = Local_Team_Id;
                Winning_Points = Winner_Points;
                Losing_Points = Loss_Points;
            }

            String Phase = (String) Jcb_Fase.getSelectedItem();

            CUD_SQL.Update_Match(Match_Id, Winning_Points, Losing_Points, Winning_Id, Phase);

        } catch (SQLException ex) {
            Logger.getLogger(Match_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_Cargar_Local_VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cargar_Local_VisitanteActionPerformed

        try {
            String Match_Name = (String) Jcb_Partidos.getSelectedItem();
            int Match_Id = Connection_SQL.get_Match_Id_By_Match_Name(Match_Name);
            int Local_Team_Id = Connection_SQL.get_Local_Team_By_Match_Id(Match_Id);
            int Visitant_Team_Id = Connection_SQL.get_Visitant_Team_By_Match_Id(Match_Id);
            String Local_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Local_Team_Id);
            String Visitant_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Visitant_Team_Id);

            if (Local_Team_Name != null && Visitant_Team_Name != null) {

                Jcb_Equipo_Local.removeAllItems();
                Jcb_Equipo_Visitante.removeAllItems();
                Jcb_Equipo_Local.addItem(Local_Team_Name);
                Jcb_Equipo_Visitante.addItem(Visitant_Team_Name);

                Jcb_Equipo_Ganador.removeAllItems();
                Jcb_Equipo_Ganador.addItem("Seleccione un ganador");
                Jcb_Equipo_Ganador.addItem("Empate");
                Jcb_Equipo_Ganador.addItem(Local_Team_Name);
                Jcb_Equipo_Ganador.addItem(Visitant_Team_Name);

                Jcb_Equipo_Local.repaint();
                Jcb_Equipo_Visitante.repaint();
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener los nombres de los equipos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Match_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Btn_Cargar_Local_VisitanteActionPerformed

    private void Btn_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Guardar1ActionPerformed

    private void Jcb_Nombre_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcb_Nombre_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcb_Nombre_EquipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cargar_Local_Visitante;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Guardar1;
    private javax.swing.JSpinner JS_Goles_Local;
    private javax.swing.JSpinner JS_Goles_Visitantes;
    private javax.swing.JComboBox<String> Jcb_Equipo_Ganador;
    private javax.swing.JComboBox<String> Jcb_Equipo_Ganador2;
    private javax.swing.JComboBox<String> Jcb_Equipo_Ganador3;
    private javax.swing.JComboBox<String> Jcb_Equipo_Local;
    private javax.swing.JComboBox<String> Jcb_Equipo_Visitante;
    private javax.swing.JComboBox<String> Jcb_Fase;
    private javax.swing.JComboBox<String> Jcb_Nombre_Equipo;
    private javax.swing.JComboBox<String> Jcb_Nombre_Torneo;
    private javax.swing.JComboBox<String> Jcb_Partidos;
    private javax.swing.JPanel Pnl_Ingresar_Datos;
    private javax.swing.JPanel Pnl_Tarjetas;
    private javax.swing.ButtonGroup Rd;
    private javax.swing.JSpinner Spinner_Tiempo;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_img;
    // End of variables declaration//GEN-END:variables
}
