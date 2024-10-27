package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Connection_SQL {

    public static Connection getConnection() throws SQLException {
        String Connection_String = "jdbc:sqlserver://localhost:1433;"
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

    // Inicio de codigo registro de usuario
    public static boolean Verify_User(String username, String password) throws SQLException {
        boolean isValidUser = false;

        String qry = "SELECT * FROM RegisteredPerson WHERE Name = '" + username + "' AND Password = '" + password + "'";
        Statement sql = Connection_SQL.getConnection().createStatement();
        ResultSet rs = sql.executeQuery(qry);

        if (rs.next()) {
            isValidUser = true;
        }

        return isValidUser;
    }

    // Fin de codigo registro de usuario
    // Inicio codigo de equipos
    public static void Qry_Team(JComboBox<String> JCB) throws SQLException {
        try {
            Statement sql = Connection_SQL.getConnection().createStatement();
            String qry = "SELECT * FROM Team";

            ResultSet resultado = sql.executeQuery(qry);

            JCB.removeAllItems();
            JCB.addItem("Seleccione un equipo");

            while (resultado.next()) {
                JCB.addItem(resultado.getString("Team_Name"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    // Fin codigo de equipos
    // Inicio codigo de jugadores
    public static int get_Player_Id_By_Player_Name(String Player_Name) throws SQLException {
        int Id = -1;

        String qry = "SELECT ID FROM Player WHERE First_Name = '" + Player_Name + "'";
        Statement sql = Connection_SQL.getConnection().createStatement();
        ResultSet rs = sql.executeQuery(qry);

        if (rs.next()) {
            Id = rs.getInt("ID");
        }

        rs.close();
        return Id;
    }

    public static int get_Team_Id_By_Team_Name(String Team_Name) throws SQLException {
        int Team_Id = -1;

        String qry = "SELECT Team_ID FROM Team WHERE Team_Name = '" + Team_Name + "'";
        Statement sql = Connection_SQL.getConnection().createStatement();
        ResultSet rs = sql.executeQuery(qry);

        if (rs.next()) {
            Team_Id = rs.getInt("Team_ID");
        }

        rs.close();
        return Team_Id;
    }

    public static String get_Team_Name_By_Team_Id(int Team_Id) throws SQLException {
        String Team_Name = "";

        String qry = "SELECT Team_Name FROM Team WHERE Team_ID = " + Team_Id;
        Statement sql = Connection_SQL.getConnection().createStatement();
        ResultSet rs = sql.executeQuery(qry);

        if (rs.next()) {
            Team_Name = rs.getString("Team_Name");
        }

        rs.close();
        return Team_Name;
    }

    public static void get_Player_Name_By_Team_Id(JComboBox<String> JCB, int Team_Id) throws SQLException {
        Statement sql = Connection_SQL.getConnection().createStatement();

        String qry = "SELECT First_Name FROM Player WHERE Team_Id = " + Team_Id;
        ResultSet rs = sql.executeQuery(qry);

        JCB.removeAllItems();
        JCB.addItem("Seleccione un jugador");

        while (rs.next()) {
            JCB.addItem(rs.getString("First_Name"));
        }
    }

    // Fin codigo de jugadores
    // Inicio de codigo de torneo
    public static void Qry_Tournament(JComboBox<String> JCB) throws SQLException {
        try {
            Statement sql = Connection_SQL.getConnection().createStatement();
            String qry = "SELECT * FROM Tournament";

            ResultSet resultado = sql.executeQuery(qry);

            JCB.removeAllItems();
            JCB.addItem("Seleccione un torneo");

            while (resultado.next()) {
                JCB.addItem(resultado.getString("Tournament_Name"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public static int get_Tournament_Id_By_Tournament_Name(String Tournament_Name) throws SQLException {
        int Tournament_Id = -1;

        Statement sql = Connection_SQL.getConnection().createStatement();
        String qry = "SELECT Tournament_ID FROM Tournament WHERE Tournament_Name = '" + Tournament_Name + "'";
        ResultSet rs = sql.executeQuery(qry);

        if (rs.next()) {
            Tournament_Id = rs.getInt("Tournament_ID");
        }

        return Tournament_Id;
    }

    public static void Load_Teams_For_Tournament(int Tournament_Id, JComboBox<String> Jcb_Nombre_Equipo_Eliminar) throws SQLException {
        Jcb_Nombre_Equipo_Eliminar.removeAllItems();
        Jcb_Nombre_Equipo_Eliminar.addItem("Seleccione un equipo");

        //[ALIAS] T = Team, TT = Tournament_Team
        String qry = "SELECT T.Team_Name FROM Team T "
                + "JOIN Tournament_Teams TT ON T.Team_ID = TT.Team_ID "
                + "WHERE TT.Tournament_ID = " + Tournament_Id;

        try (Statement sql = Connection_SQL.getConnection().createStatement(); ResultSet rs = sql.executeQuery(qry)) {
            while (rs.next()) {
                String teamName = rs.getString("Team_Name");
                Jcb_Nombre_Equipo_Eliminar.addItem(teamName);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    // Fin de codigo de torneo
    // Inicio codigo registro de estadisticas de partidos
    public static int Counter_Teams_In_Tournament(int Tournament_Id) throws SQLException {
        Statement sql = Connection_SQL.getConnection().createStatement();
        String qry = "SELECT COUNT(*) AS Total_Teams FROM Tournament_Teams WHERE Tournament_ID = " + Tournament_Id;
        ResultSet rs = sql.executeQuery(qry);

        int Team_Count = 0;
        if (rs.next()) {
            Team_Count = rs.getInt("Total_Teams");
        }

        return Team_Count;
    }

    // Fin de codigo registro de estadisticas de partidos
    // Inicio de codigo consultas Tournament_Teams
    public static List<Integer> getTeams_In_Tournament(int Tournament_Id) throws SQLException {
        Statement sql = Connection_SQL.getConnection().createStatement();
        String qry = "SELECT Team_ID FROM Tournament_Teams WHERE Tournament_ID = " + Tournament_Id;

        ResultSet rs = sql.executeQuery(qry);

        List<Integer> Team_Ids = new ArrayList<>();
        while (rs.next()) {
            Team_Ids.add(rs.getInt("Team_ID"));
        }
        return Team_Ids;
    }

    public static List<Integer> getWinners_In_Tournament(int Tournament_Id, List<Integer> Teams_Ids, String phase) throws SQLException {
        Statement sql = Connection_SQL.getConnection().createStatement();
        List<Integer> Winners_Ids = new ArrayList<>();

        // Cambiamos la lógica para obtener los IDs de los ganadores directamente
        String qry = "SELECT Winner FROM Match WHERE Tournament_ID = " + Tournament_Id + " AND Phase = '" + phase + "'";
        ResultSet rs = sql.executeQuery(qry);

        while (rs.next()) {
            int winnerId = rs.getInt("Winner");
            // Evitar duplicados
            if (!Winners_Ids.contains(winnerId)) {
                Winners_Ids.add(winnerId);
            }
        }

        return Winners_Ids;
    }

    public static void Load_Match_Names_Into_JCB(int Tournament_Id, String Phase, JComboBox<String> JCB) throws SQLException {
        Statement sql = Connection_SQL.getConnection().createStatement();
        String qry = "SELECT Match_Name FROM Match WHERE Tournament_ID = " + Tournament_Id + " AND Phase = '" + Phase + "'";

        ResultSet rs = sql.executeQuery(qry);

        JCB.removeAllItems();
        JCB.addItem("Seleccione un partido");
        
        while (rs.next()) {
            JCB.addItem(rs.getString("Match_Name"));
        }
    }

    // Fin de codigo consultas Tournament_Teams
}
