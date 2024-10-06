/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Presentation.Principal_Panel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Log_In_Logic {
    
    
    public void Default_Text_PSW(JPasswordField txtContrasena, JTextField txtUsuario) {
        if (String.valueOf(txtContrasena.getPassword()).equals("********")) {
            txtContrasena.setText("");
            txtContrasena.setForeground(Color.black);
        }
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.gray);
        }
    }
    
    public void Default_Text_User_Field(JTextField txtUsuario, JPasswordField txtContrasena) {
         if (txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContrasena.getPassword()).isEmpty()) {
            txtContrasena.setText("********");
            txtContrasena.setForeground(Color.gray);
        }
    }
    
        public void Open_Principal_Panel_Logic(JTextField txtUsuario, JPasswordField txtContrasena) {
        String getUser = txtUsuario.getText();
        String getPassword = String.valueOf(txtContrasena.getPassword());

        if (getUser.equals("popo") && getPassword.equals("123")) {
            Principal_Panel principal_panel = new Principal_Panel();
            principal_panel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta. Intentelo de nuevo", "Mensaje Importante!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
