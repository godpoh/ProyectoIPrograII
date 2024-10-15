/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class Connection_SQL {

    public static Connection getConnection() throws SQLException {
        String Connection_String = "jdbc:sqlserver://localhost:1433;"
                + "database=TorneoFutbol;"
                + "user=sa;"
                + "password=popo;"
                + "encrypt=true;trustServerCertificate=true;";

        try {
            Connection con = DriverManager.getConnection(Connection_String);
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }

    }

    public static int InsertTeam(Team_Obj Team) throws SQLException {
        int rowsAffected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        // Construimos la consulta para insertar en la tabla Equipo
        String qry = "INSERT INTO Equipo (Id_Equipo, Nombre_Equipo) "
                + "VALUES ('" + Team.getTeam_Id() + "', '"
                + Team.getTeam_Name() + "');";

        // Ejecutamos la consulta 
        rowsAffected = sql.executeUpdate(qry);

        return rowsAffected;
    }

    public static void Qry_Team(JComboBox<String> JCB) throws SQLException {

        try {
            Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
            String qry = "Select * From Equipo";

            ResultSet resultado = sql.executeQuery(qry);

            JCB.removeAllItems();

            JCB.addItem("Seleccione un equipo");

            while (resultado.next()) {
                JCB.addItem(resultado.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }

    public static void Delete_Selected_Team(JComboBox<String> JCB) throws SQLException {
        String selectedTeam = (String) JCB.getSelectedItem(); // Obtiene el equipo seleccionado

        if (selectedTeam != null && !selectedTeam.equals("Seleccione un equipo")) {
            try {

                Statement sql = Connection_SQL.getConnection().createStatement();
                String Delete_Query = "DELETE FROM Equipo WHERE nombre_equipo = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el equipo " + selectedTeam + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Delete_Query);
                    JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente.");

                    // Vuelve a cargar el JComboBox despues de eliminar
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido.");
        }
    }

    public static void Update_Selected_Team(JComboBox<String> JCB, JTextField newNameField) throws SQLException {
        String selectedTeam = (String) JCB.getSelectedItem();
        String newTeamName = newNameField.getText();

        if (selectedTeam != null && !selectedTeam.equals("Seleccione un equipo") && !newTeamName.isEmpty()) {
            try {
                Statement sql = Connection_SQL.getConnection().createStatement();
                String Update_Query = "UPDATE Equipo SET nombre_equipo = '" + newTeamName + "' WHERE nombre_equipo = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar el equipo " + selectedTeam + " a " + newTeamName + "?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Update_Query);
                    JOptionPane.showMessageDialog(null, "Equipo actualizado exitosamente.");

                    // Vuelve a cargar el JComboBox despues de actualizar
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido y escribe un nuevo nombre.");
        }

    }

    public static int InsertPlayer(Player_Obj Player) throws SQLException {
        int Rows_Affected = 0;
        // Creacion de sentencia para manejo en SQL
        Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
        // String que contiene el script de la operacion sql
        String qry = "Insert Into Jugador (Cedula, Nombre, Apellido1, Apellido2, Numero_Contacto, "
                + "Direccion, Equipo_Id, Posicion, Dorsal)"
                + "Values(" + Player.getId() + ","
                + " '" + Player.getName() + "',"
                + " '" + Player.getLast_Name1() + "',"
                + " '" + Player.getLast_Name2() + "',"
                + " '" + Player.getContact_Number() + "',"
                + " '" + Player.getAdress() + "',"
                + Player.getTeam_Id() + ","
                + " '" + Player.getPosition() + "',"
                + Player.getDorsal() + ")";
        
        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

}
