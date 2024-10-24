/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

import Data.Connection_SQL;
import java.sql.SQLException;
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
    public Match_Registration() {
        initComponents();
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
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel76 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel90 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel96 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel97 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
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

        jComboBox10.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Ingresar_Datos.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 210, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Clasificacion");
        Pnl_Ingresar_Datos.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jComboBox11.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Ingresar_Datos.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 210, -1));

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Tarjetas amarillas");
        Pnl_Ingresar_Datos.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("Tarjetas rojas");
        Pnl_Ingresar_Datos.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        jLabel82.setBackground(new java.awt.Color(255, 255, 255));
        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Jugador obtuvo sanción");
        Pnl_Ingresar_Datos.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jComboBox12.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Ingresar_Datos.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 210, -1));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(0, 0, 0));
        jLabel90.setText("Otras Sanciones");
        Pnl_Ingresar_Datos.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));
        Pnl_Ingresar_Datos.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 190, -1));

        jLabel95.setBackground(new java.awt.Color(255, 255, 255));
        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Nombre del equipo");
        Pnl_Ingresar_Datos.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));
        Pnl_Ingresar_Datos.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel96.setBackground(new java.awt.Color(255, 255, 255));
        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("0");
        Pnl_Ingresar_Datos.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));
        Pnl_Ingresar_Datos.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 70, -1));

        jComboBox13.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Ingresar_Datos.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 210, -1));

        jLabel97.setBackground(new java.awt.Color(255, 255, 255));
        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 0, 0));
        jLabel97.setText("Goles anotados");
        Pnl_Ingresar_Datos.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jComboBox14.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pnl_Ingresar_Datos.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, -1));

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Los datos se reescribiran cada vez guarde datos ");
        Pnl_Ingresar_Datos.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("GUARDAR");
        Pnl_Ingresar_Datos.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));
        Pnl_Ingresar_Datos.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Jugador que anotó gol");
        Pnl_Ingresar_Datos.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("IMPORTANTE:");
        Pnl_Ingresar_Datos.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setText("GUARDAR");
        Pnl_Ingresar_Datos.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Ingresar_Datos;
    private javax.swing.JPanel Pnl_Tarjetas;
    private javax.swing.ButtonGroup Rd;
    private javax.swing.JRadioButton Rd_Informacion_Tarjetas;
    private javax.swing.JRadioButton Rd_Ingresar_Datos;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
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
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_img;
    // End of variables declaration//GEN-END:variables
}
