/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

/**
 *
 * @author user
 */
public class Team_Managment extends javax.swing.JPanel {

    public Team_Managment() {
        initComponents();
        Pnl_Registro_Equipo.setVisible(false);
        Pnl_Registro_Jugadores.setVisible(false);
        Action_Listeners_Method();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnG_Equipo_Jugador = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Rd_Equipo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Rd_Jugador = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Pnl_Principal = new javax.swing.JPanel();
        Pnl_Registro_Equipo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Equipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pnl_Registro_Jugadores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        BtnG_Equipo_Jugador.add(Rd_Equipo);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registro del Equipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Rd_Equipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(Rd_Equipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, 50));

        jPanel2.setOpaque(false);

        BtnG_Equipo_Jugador.add(Rd_Jugador);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro de Jugador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rd_Jugador)
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(Rd_Jugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, 50));

        Pnl_Principal.setOpaque(false);
        Pnl_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Registro_Equipo.setOpaque(false);
        Pnl_Registro_Equipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el nombre del equipo");
        Pnl_Registro_Equipo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 270, -1));

        txt_Equipo.setBackground(new java.awt.Color(102, 102, 102));
        txt_Equipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_Equipo.setForeground(new java.awt.Color(204, 204, 204));
        txt_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EquipoActionPerformed(evt);
            }
        });
        Pnl_Registro_Equipo.add(txt_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("IMPORTANTE:");
        Pnl_Registro_Equipo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Al crear un equipo, tendrá un ID unicó. Se le definira el ID cuando cree el equipo.");
        Pnl_Registro_Equipo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CREAR");
        Pnl_Registro_Equipo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        Pnl_Principal.add(Pnl_Registro_Equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 570, 140));

        Pnl_Registro_Jugadores.setOpaque(false);
        Pnl_Registro_Jugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ingrese el nombre del jugador");
        Pnl_Registro_Jugadores.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Pnl_Registro_Jugadores.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Identificación(Cedúla)");
        Pnl_Registro_Jugadores.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        Pnl_Registro_Jugadores.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección");
        Pnl_Registro_Jugadores.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        Pnl_Registro_Jugadores.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Número de contacto");
        Pnl_Registro_Jugadores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        Pnl_Registro_Jugadores.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 180, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Posición en juego");
        Pnl_Registro_Jugadores.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portero", "Lateral Derecho", "Lateral Izquierdo", "Defensa Central", "Líbero", "Pivote", "Mediocentro", "Mediocentro Defensivo", "Mediocentro Ofensivo", "Interior Derecho", "Interior Izquierdo", "Extremo Derecho", "Extremo Izquierdo", "Delantero Centro", "Segundo Delantero", "Mediapunta", "Carrilero Derecho", "Carrilero Izquierdo" }));
        Pnl_Registro_Jugadores.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Dorsal");
        Pnl_Registro_Jugadores.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        Pnl_Registro_Jugadores.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Equipo");
        Pnl_Registro_Jugadores.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(204, 204, 204));
        Pnl_Registro_Jugadores.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 210, -1));

        Pnl_Principal.add(Pnl_Registro_Jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 570, 510));

        add(Pnl_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 590, 530));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plain-grey-background-h9vimscs4l3cl53t.jpg"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void Selected_Rd() {
        if (Rd_Equipo.isSelected()) {
            Pnl_Registro_Equipo.setVisible(true);
            Pnl_Registro_Jugadores.setVisible(false);
        } else if (Rd_Jugador.isSelected()) {
            Pnl_Registro_Equipo.setVisible(false);
            Pnl_Registro_Jugadores.setVisible(true);
        }
    }

    private void Action_Listeners_Method() {
        Rd_Equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected_Rd();
            }
        });

        Rd_Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selected_Rd();
            }
        });

    }

    private void txt_EquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EquipoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnG_Equipo_Jugador;
    private javax.swing.JPanel Pnl_Principal;
    private javax.swing.JPanel Pnl_Registro_Equipo;
    private javax.swing.JPanel Pnl_Registro_Jugadores;
    private javax.swing.JRadioButton Rd_Equipo;
    private javax.swing.JRadioButton Rd_Jugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_Equipo;
    // End of variables declaration//GEN-END:variables
}
