/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import static Data.Connection_SQL.Qry_Team;
import static Data.Connection_SQL.Qry_Tournament;
import Data.Connection_SQL;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class CUD_SQL {

    // Inicio de INSERTS
    public static int Insert_User(Admin_Obj User) throws SQLException {
        int Rows_Affected = 0;

        Statement sql = (Statement) Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO RegisteredPerson (ID_RegisteredPerson, Name, Last_Name1, Last_Name2, Password, Role) "
                + "VALUES (" + User.getId() + ","
                + " '" + User.getName() + "',"
                + " '" + User.getLast_Name1() + "',"
                + " '" + User.getLast_Name2() + "',"
                + " '" + User.getPassword() + "',"
                + " '" + User.getCategory() + "')";

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static int Insert_Team(Team_Obj Team) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO Team (Team_Id, Team_Name) "
                + "VALUES (" + Team.getTeam_Id() + ", '"
                + Team.getTeam_Name() + "');";

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static int Insert_Player(Player_Obj Player) throws SQLException {
        int Rows_Affected = 0;

        Statement sql = (Statement) Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO Player (Id, First_Name, Last_Name1, Last_Name2, Contact_Number, "
                + "Address_Player, Team_Id, Position, Jersey_Number)"
                + "VALUES(" + Player.getId() + ", '"
                + Player.getName() + "', '"
                + Player.getLast_Name1() + "', '"
                + Player.getLast_Name2() + "', '"
                + Player.getContact_Number() + "', '"
                + Player.getAdress() + "', "
                + Player.getTeam_Id() + ", '"
                + Player.getPosition() + "', "
                + Player.getDorsal() + ")";

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static int Insert_Tournament(Tournament_Obj Tournament) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String Formatted_Start_Date = SDF.format(Tournament.getStart_Date());
        String Formatted_End_Date = SDF.format(Tournament.getEnd_Date());

        String qry = "INSERT INTO Tournament (Tournament_ID, Tournament_Name, Start_Date, End_Date) "
                + "VALUES ("
                + Tournament.getIdTournament() + ", '"
                + Tournament.getTournament_Name() + "', '"
                + Formatted_Start_Date + "', '"
                + Formatted_End_Date + "')";

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static int Insert_Team_To_Tournament(Tournament_Teams_Obj Tournament_Team) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "INSERT INTO Tournament_Teams (Tournament_ID, Team_ID) "
                + "VALUES (" + Tournament_Team.getTournament_Id() + ", "
                + Tournament_Team.getTeam_Id() + ")";

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }

    public static int Insert_Matches(int Tournament_Id, List<int[]> Pairs, String Phase) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");
        String Default_Date = SDF.format(new Date(0));

        for (int i = 0; i < Pairs.size(); i++) {
            int[] Pair = Pairs.get(i);

            String Home_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Pair[0]);
            String Away_Team_Name = Connection_SQL.get_Team_Name_By_Team_Id(Pair[1]);

            String Match_Name = Home_Team_Name + " VS " + Away_Team_Name;

            String qry = "INSERT INTO Match (Match_Name, Tournament_ID, Match_Date, Home_Team_Id, Away_Team_Id, Home_Points, Away_Points, Winner, Phase) "
                    + "VALUES ('" + Match_Name + "', "
                    + Tournament_Id + ", '"
                    + Default_Date + "', "
                    + Pair[0] + ", "
                    + Pair[1] + ", "
                    + "0, 0, 0, '" + Phase + "')";

            Rows_Affected += sql.executeUpdate(qry);
        }

        return Rows_Affected;
    }

    // Final de INSERTS
    // Inicio de UPDATES
    public static void Update_Match(int Match_Id, int Winning_Points, int Losing_Points, int Winning_Id, String Converted_Phase) throws SQLException {

        int Local_Team_Id = Connection_SQL.get_Local_Team_By_Match_Id(Match_Id);
        int visitantTeamId = Connection_SQL.get_Visitant_Team_By_Match_Id(Match_Id);

        int Home_Points = 0;
        int Away_Points = 0;

        if (Winning_Id == Local_Team_Id) {
            Home_Points = Winning_Points;
            Away_Points = Losing_Points;
        } else {
            Home_Points = Losing_Points;
            Away_Points = Winning_Points;
        }

        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "UPDATE Match SET Home_Points = " + Home_Points
                + ", Away_Points = " + Away_Points
                + ", Winner = " + Winning_Id
                + ", Phase = '" + Converted_Phase + "' "
                + "WHERE Match_ID = " + Match_Id;

        int rowsUpdated = sql.executeUpdate(qry);
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Partido actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el partido para actualizar.");
        }
    }

    public static void Update_Selected_Team(JComboBox<String> JCB, JTextField New_Name_Field) throws SQLException {
        String Selected_Team = (String) JCB.getSelectedItem();
        String New_Team_Name = New_Name_Field.getText();

        if (Selected_Team != null && !Selected_Team.equals("Seleccione un equipo") && !New_Team_Name.isEmpty()) {
            try {
                Statement sql = Connection_SQL.getConnection().createStatement();
                String Update_Query = "UPDATE Team SET Team_Name = '" + New_Team_Name + "' WHERE Team_Name = '" + Selected_Team + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar el equipo " + Selected_Team + " a " + New_Team_Name + "?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Update_Query);
                    JOptionPane.showMessageDialog(null, "Equipo actualizado exitosamente.");
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido y escribe un nuevo nombre.");
        }
    }

    public static int Update_Player_Information(int Player_Id, String Address, String Contact_Number, int Jersey_Number, String Position, int Team_Id) throws SQLException {
        int RowsAffected = 0;

        try {
            Statement sql = Connection_SQL.getConnection().createStatement();
            String qry = "UPDATE Player SET "
                    + "Address_Player = '" + Address + "', "
                    + "Contact_Number = '" + Contact_Number + "', "
                    + "Jersey_Number = " + Jersey_Number + ", "
                    + "Position = '" + Position + "', "
                    + "Team_Id = " + Team_Id + " "
                    + "WHERE Id = " + Player_Id;

            int Confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar al jugador?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

            if (Confirm == JOptionPane.YES_OPTION) {
                RowsAffected = sql.executeUpdate(qry);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return RowsAffected;
    }

    public static void Update_Tournament(JComboBox<String> JCB, JTextField New_Name_Field) throws SQLException {
        String Selected_Tournament = (String) JCB.getSelectedItem();
        String New_Tournament_Name = New_Name_Field.getText();

        if (Selected_Tournament != null && !Selected_Tournament.equals("Seleccione un torneo") && !New_Tournament_Name.isEmpty()) {
            try {
                Statement sql = Connection_SQL.getConnection().createStatement();
                String Update_Query = "UPDATE Tournament SET Tournament_Name = '" + New_Tournament_Name + "' WHERE Tournament_Name = '" + Selected_Tournament + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas actualizar el torneo " + Selected_Tournament + " a " + New_Tournament_Name + "?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Update_Query);
                    JOptionPane.showMessageDialog(null, "Torneo actualizado exitosamente.");
                    Qry_Tournament(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un torneo válido y escribe un nuevo nombre.");
        }
    }

    // Inicio de DELETES
    public static void Delete_Selected_Team(JComboBox<String> JCB) throws SQLException {
        String Selected_Team = (String) JCB.getSelectedItem();

        if (Selected_Team != null && !Selected_Team.equals("Seleccione un equipo")) {
            try {
                Statement sql = Connection_SQL.getConnection().createStatement();
                String Delete_Query = "DELETE FROM Team WHERE Team_Name = '" + Selected_Team + "'";

                int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el equipo " + Selected_Team + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    sql.executeUpdate(Delete_Query);
                    JOptionPane.showMessageDialog(null, "Equipo eliminado exitosamente.");
                    Qry_Team(JCB);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo válido.");
        }
    }

    public static int Delete_Player(int Id) throws SQLException {
        int Affected_Rows = 0;

        try {
            Statement sql = Connection_SQL.getConnection().createStatement();
            String qry = "DELETE FROM Player WHERE ID = " + Id;

            int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar al jugador?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                Affected_Rows = sql.executeUpdate(qry);
                JOptionPane.showMessageDialog(null, "Jugador eliminado correctamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return Affected_Rows;
    }

    public static int Delete_Tournament(String Tournament_Name) throws SQLException {
        int Affected_Rows = 0;

        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "DELETE FROM Tournament WHERE Tournament_Name = '" + Tournament_Name + "'";

        int confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar el torneo?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            Affected_Rows = sql.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Torneo eliminado correctamente.");
        }

        return Affected_Rows;
    }

    public static int Delete_Team_From_Tournament(int Tournament_ID, int Team_ID) throws SQLException {
        int Rows_Affected = 0;
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "DELETE FROM Tournament_Teams WHERE Tournament_ID = " + Tournament_ID + " AND Team_ID = " + Team_ID;

        Rows_Affected = sql.executeUpdate(qry);

        return Rows_Affected;
    }
    // Fin de DELETES
}
