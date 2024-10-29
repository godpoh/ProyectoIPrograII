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
        Pnl_Ingresar_Datos.setVisible(false);
        Pnl_Tarjetas.setVisible(false);
        Action_Listeners_Method();

    }

    private void Selected_Rd() {
        if (Rd_Informacion_Tarjetas.isSelected()) {
            Pnl_Ingresar_Datos.setVisible(false);
            Pnl_Tarjetas.setVisible(true);
        } else if (Rd_Ingresar_Datos.isSelected()) {
            Pnl_Ingresar_Datos.setVisible(true);
            Pnl_Tarjetas.setVisible(false);
        }
    }

    private void Action_Listeners_Method() {

        Rd_Informacion_Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected_Rd();
            }
        });

        Rd_Ingresar_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected_Rd();
            }
        });

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
        jPanel5 = new javax.swing.JPanel();
        Rd_Ingresar_Datos = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Rd_Informacion_Tarjetas = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
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
        jLabel84 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Jcb_Partidos = new javax.swing.JComboBox<>();
        Btn_Cargar_Local_Visitante = new javax.swing.JButton();
        Pnl_Tarjetas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lbl_img = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setOpaque(false);

        Rd.add(Rd_Ingresar_Datos);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Ingresar estadisticas del partido");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel74)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Rd_Ingresar_Datos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addGap(4, 4, 4)
                .addComponent(Rd_Ingresar_Datos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 190, -1));

        jPanel4.setOpaque(false);

        Rd.add(Rd_Informacion_Tarjetas);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ingresar estadisticas del jugador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rd_Informacion_Tarjetas)
                .addGap(76, 76, 76))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(Rd_Informacion_Tarjetas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        Pnl_Ingresar_Datos.setOpaque(false);
        Pnl_Ingresar_Datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Nombre del Torneo:");
        Pnl_Ingresar_Datos.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        Jcb_Nombre_Torneo.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Nombre_Torneo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Nombre_Torneo.setForeground(new java.awt.Color(51, 51, 51));
        Pnl_Ingresar_Datos.add(Jcb_Nombre_Torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 210, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Fase");
        Pnl_Ingresar_Datos.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        Jcb_Fase.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Fase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Fase.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Fase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una fase", "Cuartos-Final", "Semi-Final", "Final" }));
        Pnl_Ingresar_Datos.add(Jcb_Fase, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 210, -1));

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Partido");
        Pnl_Ingresar_Datos.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        Jcb_Equipo_Local.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Local.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Local.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Local.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido1" }));
        Jcb_Equipo_Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcb_Equipo_LocalActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 210, -1));

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("Equipo Local");
        Pnl_Ingresar_Datos.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        Jcb_Equipo_Visitante.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Visitante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Visitante.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Visitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido2" }));
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 210, -1));

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Goles");
        Pnl_Ingresar_Datos.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Equipo visitante");
        Pnl_Ingresar_Datos.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Goles");
        Pnl_Ingresar_Datos.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));
        Pnl_Ingresar_Datos.add(JS_Goles_Local, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
        Pnl_Ingresar_Datos.add(JS_Goles_Visitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        Jcb_Equipo_Ganador.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Equipo_Ganador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Equipo_Ganador.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Equipo_Ganador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un ganador" }));
        Jcb_Equipo_Ganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcb_Equipo_GanadorActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Jcb_Equipo_Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 210, -1));

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Equipo Ganador");
        Pnl_Ingresar_Datos.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        Btn_Guardar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 90, 40));

        Jcb_Partidos.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Partidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jcb_Partidos.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Partidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un partido" }));
        Pnl_Ingresar_Datos.add(Jcb_Partidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, -1));

        Btn_Cargar_Local_Visitante.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Cargar_Local_Visitante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Cargar_Local_Visitante.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Cargar_Local_Visitante.setText("Cargar Partidos");
        Btn_Cargar_Local_Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cargar_Local_VisitanteActionPerformed(evt);
            }
        });
        Pnl_Ingresar_Datos.add(Btn_Cargar_Local_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 40));

        add(Pnl_Ingresar_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 810, 510));

        Pnl_Tarjetas.setOpaque(false);
        Pnl_Tarjetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre del Torneo:");
        Pnl_Tarjetas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Tarjetas.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 210, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Sanciones del equipo");
        Pnl_Tarjetas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Tarjetas.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 210, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tarjetas amarillas");
        Pnl_Tarjetas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tarjetas rojas");
        Pnl_Tarjetas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Monto economico");
        Pnl_Tarjetas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 120, 20));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("jLabel15");
        Pnl_Tarjetas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("jLabel17");
        Pnl_Tarjetas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tarjetas de jugador");
        Pnl_Tarjetas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jComboBox5.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Tarjetas.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 210, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("jLabel21");
        Pnl_Tarjetas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Tarjetas amarillas totales del equipo");
        Pnl_Tarjetas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Tarjetas rojas totales del equipo");
        Pnl_Tarjetas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("jLabel24");
        Pnl_Tarjetas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("jLabel25");
        Pnl_Tarjetas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Monto ecomico total del equipo");
        Pnl_Tarjetas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("jLabel27");
        Pnl_Tarjetas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Otras Sanciones");
        Pnl_Tarjetas.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("jLabel56");
        Pnl_Tarjetas.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Otras sanciones");
        Pnl_Tarjetas.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("jLabel58");
        Pnl_Tarjetas.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Sanciones totales del equipo");
        Pnl_Tarjetas.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        add(Pnl_Tarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 510));

        lbl_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-textured-backgound.jpg"))); // NOI18N
        lbl_img.setText("jLabel1");
        add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 688));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        try {
            int Winner_Points = 3;
            int Loss_Points = 0;

            String Match_Name = (String) Jcb_Partidos.getSelectedItem();
            int Match_Id = Connection_SQL.get_Match_Id_By_Match_Name(Match_Name);
            int Local_Team_Id = Connection_SQL.get_Local_Team_By_Match_Id(Match_Id);
            int Visitant_Team_Id = Connection_SQL.get_Visitant_Team_By_Match_Id(Match_Id);
            String Local_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Local_Team_Id);
            String Visitant_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Visitant_Team_Id);

//            String Local_Team = (String) Jcb_Equipo_Local.getSelectedItem();
//            String Visitant_Team = (String) Jcb_Equipo_Visitante.getSelectedItem();
//            int Local_Id = get_Team_Id_By_Team_Name(Local_Team);
//            int Visitant_Id = get_Team_Id_By_Team_Name(Visitant_Team);
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
                Winning_Points = Winner_Points + Local_Goals;
                Losing_Points = Loss_Points + Visitant_Goals;
            } else if (Local_Goals < Visitant_Goals) {
                // El equipo visitante gana
                Winning_Id = Visitant_Team_Id;
                Losing_Id = Local_Team_Id;
                Winning_Points = Winner_Points + Visitant_Goals;
                Losing_Points = Loss_Points + Local_Goals;
            }

            String Phase = (String) Jcb_Fase.getSelectedItem();
            String Converted_Phase = " ";
 

            CUD_SQL.Update_Match(Match_Id, Winning_Points, Losing_Points, Winning_Id, Phase);

        } catch (SQLException ex) {
            Logger.getLogger(Match_Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Jcb_Equipo_GanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcb_Equipo_GanadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcb_Equipo_GanadorActionPerformed

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

    private void Jcb_Equipo_LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcb_Equipo_LocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcb_Equipo_LocalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cargar_Local_Visitante;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JSpinner JS_Goles_Local;
    private javax.swing.JSpinner JS_Goles_Visitantes;
    private javax.swing.JComboBox<String> Jcb_Equipo_Ganador;
    private javax.swing.JComboBox<String> Jcb_Equipo_Local;
    private javax.swing.JComboBox<String> Jcb_Equipo_Visitante;
    private javax.swing.JComboBox<String> Jcb_Fase;
    private javax.swing.JComboBox<String> Jcb_Nombre_Torneo;
    private javax.swing.JComboBox<String> Jcb_Partidos;
    private javax.swing.JPanel Pnl_Ingresar_Datos;
    private javax.swing.JPanel Pnl_Tarjetas;
    private javax.swing.ButtonGroup Rd;
    private javax.swing.JRadioButton Rd_Informacion_Tarjetas;
    private javax.swing.JRadioButton Rd_Ingresar_Datos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_img;
    // End of variables declaration//GEN-END:variables
}
