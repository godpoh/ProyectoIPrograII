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

    public static int InsertPlayer(Player_Obj Player) throws SQLException {
        int Rows_Affected = 0;
        // Creacion de sentencia para manejo en SQL
        Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
        // String que contiene el script de la operacion sql
        String qry = "Insert Into Cliente ()"
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

    public static int InsertTeam(Team_Obj Team) throws SQLException {
        int rowsAffected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        // Construimos la consulta para insertar en la tabla Equipo
        String qry = "INSERT INTO Equipo (Id_Equipo, Nombre_Equipo) "
                + "VALUES ('" + Team.getTeam_Id() + "', '"
                + Team.getTeam_Name() + "');";

        // Ejecutamos la consulta de inserción
        rowsAffected = sql.executeUpdate(qry);

        return rowsAffected;
    }

    public static void Consult_Team(JComboBox<String> combobox) throws SQLException {

        try {
            Statement sql = (Statement) Connection_SQL.getConnection().createStatement();
            String Consulta = "Select * From Equipo";

            ResultSet resultado = sql.executeQuery(Consulta);
            
            combobox.removeAllItems();
            
            combobox.addItem("Seleccione un equipo");

            while (resultado.next()) {
                combobox.addItem(resultado.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }

}
