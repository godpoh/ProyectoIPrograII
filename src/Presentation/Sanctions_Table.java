/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Presentation;

import Data.Connection_SQL;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Sanctions_Table extends javax.swing.JPanel {

    /**
     * Creates new form Sanctions_Table
     */
    public Sanctions_Table() {
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
        Jcb_Torneo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Info = new javax.swing.JTable();
        Btn_Consultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del torneo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        Jcb_Torneo.setBackground(new java.awt.Color(204, 204, 204));
        Jcb_Torneo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jcb_Torneo.setForeground(new java.awt.Color(51, 51, 51));
        Jcb_Torneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(Jcb_Torneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 188, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sanciones");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        Tbl_Info.setBackground(new java.awt.Color(204, 204, 204));
        Tbl_Info.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tbl_Info.setForeground(new java.awt.Color(51, 51, 51));
        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre jugador", "Sanciones", "Amarillas", "Rojas", "Otras", "Equipo"
            }
        ));
        Tbl_Info.setOpaque(false);
        jScrollPane1.setViewportView(Tbl_Info);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 800, -1));

        Btn_Consultar.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Consultar.setForeground(new java.awt.Color(51, 51, 51));
        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-textured-backgound.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 688));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarActionPerformed
        try {
            String Tournament_Name = (String) Jcb_Torneo.getSelectedItem();
            int Tournament_Id = Connection_SQL.get_Tournament_Id_By_Tournament_Name(Tournament_Name);
            ResultSet rs = Connection_SQL.getSanctions_By_Tournament(Tournament_Id);
            Tbl_Info.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_Btn_ConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JComboBox<String> Jcb_Torneo;
    private javax.swing.JTable Tbl_Info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
