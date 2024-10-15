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
        String Connection_String = "jdbc:sqlserver://192.168.0.20:1433;"
                + "database=SoccerTournament;"
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

    public static int Insert_Team(Team_Obj Team) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO Team (Team_Id, Team_Name) "
                + "VALUES ('" + Team.getTeam_Id() + "', '"
                + Team.getTeam_Name() + "');";

        // Ejecucion consulta
        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static void Qry_Team(JComboBox<String> JCB) throws SQLException {

        try {
            Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
            String qry = "Select * From Team";

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
                String Delete_Query = "DELETE FROM Team WHERE Team_Name = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el equipo " + selectedTeam + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Delete_Query);
                    JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente.");

                    // Vuelve a cargar el combobox despues de eliminar
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
                String Update_Query = "UPDATE Team SET Team_Name = '" + newTeamName + "' WHERE Team_Name = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar el equipo " + selectedTeam + " a " + newTeamName + "?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Update_Query);
                    JOptionPane.showMessageDialog(null, "Equipo actualizado exitosamente.");

                    // Vuelve a cargar el combobox despues de actualizar
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido y escribe un nuevo nombre.");
        }

    }

    public static int Insert_Player(Player_Obj Player) throws SQLException {
        int Rows_Affected = 0;

        Statement sql = (Statement) Connection_SQL.getConnection().createStatement();

        String qry = "Insert Into Player (Id, First_Name, Last_Name1, Last_Name2, Contact_Number, "
                + "Address_Player, Team_Id, Position, Jersey_Number)"
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

    public static int get_Team_Id_By_Name(String teamName) throws SQLException {
        int Team_Id = -1; 

        String qry = "SELECT Team_Id FROM Team WHERE Team_Name = '" + teamName + "'";
        
        Statement sql = Connection_SQL.getConnection().createStatement();
        ResultSet rs = sql.executeQuery(qry);
//        ResultSet permite iterar linea x linea como  si fuese un .next, permite utilizar getInt, getString y getDouble
        if (rs.next()) {
            Team_Id = rs.getInt("Team_Id");
        }

        rs.close();
        return Team_Id;
    }

    public static int Insert_Tournament(Tournament_Obj Tournament) throws SQLException {
        int rowsAffected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO Tournament (Tournament_Id, Tournament_Name) "
                + "VALUES ('" + Tournament.getIdTournament()+ "', '"
                + Tournament.getTournament_Name() + "');";

        rowsAffected = sql.executeUpdate(qry);

        return rowsAffected;
    }

    public static void Qry_Tournament(JComboBox<String> JCB) throws SQLException {

        try {
            Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
            String qry = "Select * From Tournament";

            ResultSet resultado = sql.executeQuery(qry);

            JCB.removeAllItems();

            JCB.addItem("Seleccione un Torneo");

            while (resultado.next()) {
                JCB.addItem(resultado.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }

    public static void Delete_Selected_Tournament(JComboBox<String> JCB) throws SQLException {
        String selectedTeam = (String) JCB.getSelectedItem(); // Obtiene el equipo seleccionado

        if (selectedTeam != null && !selectedTeam.equals("Seleccione un equipo")) {
            try {

                Statement sql = Connection_SQL.getConnection().createStatement();
                String Delete_Query = "DELETE FROM Equipo WHERE nombre_equipo = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el equipo " + selectedTeam + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Delete_Query);
                    JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente.");

                    // Vuelve a cargar el combobox despues de eliminar
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido.");
        }
    }

    public static void Update_Selected_Tournament(JComboBox<String> JCB, JTextField newNameField) throws SQLException {
        String selectedTeam = (String) JCB.getSelectedItem();
        String newTeamName = newNameField.getText();

        if (selectedTeam != null && !selectedTeam.equals("Seleccione un torneo") && !newTeamName.isEmpty()) {
            try {
                Statement sql = Connection_SQL.getConnection().createStatement();
                String Update_Query = "UPDATE Equipo SET nombre_equipo = '" + newTeamName + "' WHERE nombre_equipo = '" + selectedTeam + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar el equipo " + selectedTeam + " a " + newTeamName + "?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Update_Query);
                    JOptionPane.showMessageDialog(null, "Equipo actualizado exitosamente.");

                    // Vuelve a cargar el combobox despues de actualizar
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido y escribe un nuevo nombre.");
        }

    }

    
}
