/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.CUD_SQL;
import Data.Connection_SQL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Matchmaking_Logic {

    // Create_Matches_For_Tournament utiliza a getTeams_In_Tournament para obtener todos los ids por torneo
    // tambien utiliza Generate_Random_Pairs para hacer la logica de emparejamiento
    // y por ultimo utiliza Insert_Matches para insertar todos los emparejamientos
    //
    // Orden de utilizacion de metodos 
    // 1. getTeams_In_Tournament] 2. Generate_Random_Pairs] 3.Insert_Matches] 4.Create_Matches_For_Tournament]
    public static List<int[]> Generate_Random_Pairs(List<Integer> Teams_Ids) {

        // Revuelve todos los Team_Ids obtenidos de getTeams_In_Tournament
        Collections.shuffle(Teams_Ids);

        // Utilizo un arreglo de Int y genera los emparejamientos
        List<int[]> Pairs = new ArrayList<>();
        for (int i = 0; i < Teams_Ids.size(); i += 2) {
            // List  [1,2,3,4,5,6,7,8]
            // Indice[0,1,2,3,4,5,6,7]
            int[] Match = {Teams_Ids.get(i), Teams_Ids.get(i + 1)};
            Pairs.add(Match);
            // [1,2], [3,4], [5,6], [7,8]
            //   0,     1,      2,    3
        }

        return Pairs;
    }

    public static void Create_Matches_For_Tournament(int Tournament_Id) throws SQLException {
        // Guardo todos los teams_ids obtenidos por el tournament_id en una lista
        List<Integer> Teams_Ids = Connection_SQL.getTeams_In_Tournament(Tournament_Id);

        // Emparejo todos los ids almacenados en la lista
        List<int[]> Pairs = Generate_Random_Pairs(Teams_Ids);

        // Inserto los ids ya emparejados y revueltos
        CUD_SQL.Insert_Matches(Tournament_Id, Pairs, "Cuartos-Final");
    }

    public static void Create_Matches_For_Winners_Semi_Final(int Tournament_Id) throws SQLException {

        // Obtengo todos los equipos que se encuentran en el torneo
        List<Integer> Teams_Ids = Connection_SQL.getTeams_In_Tournament(Tournament_Id);

        // Saco todos los ganadores del torneo(Semi-Final)
        List<Integer> Winners = Connection_SQL.getWinners_In_Tournament(Tournament_Id, Teams_Ids, "Cuartos-Final");

        // Saco los pares de los ganadores
        if (Winners.size() == 4) {
            List<int[]> Pairs = Generate_Random_Pairs(Winners);
            CUD_SQL.Insert_Matches(Tournament_Id, Pairs, "Semi-Final");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficientes ganadores para emparejar las semifinales", "Mensaje Importante", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void Create_Matches_For_Winners_Final(int Tournament_Id) throws SQLException {

        // Obtengo todos los equipos que se encuentran en el torneo
        List<Integer> Teams_Ids = Connection_SQL.getTeams_In_Tournament(Tournament_Id);

        // Saco todos los ganadores del torneo(Final)
        List<Integer> Winners = Connection_SQL.getWinners_In_Tournament(Tournament_Id, Teams_Ids, "Semi-Final");

        // Saco los pares de los ganadores
        if (Winners.size() == 2) {
            List<int[]> Pairs = Generate_Random_Pairs(Winners);
            CUD_SQL.Insert_Matches(Tournament_Id, Pairs, "Final");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficientes ganadores para emparejar las semifinales", "Mensaje Importante", JOptionPane.ERROR_MESSAGE);
        }

    }
    
        public static void Create_Matches_For_Winners_Champion(int Tournament_Id) throws SQLException {

        // Obtengo todos los equipos que se encuentran en el torneo
        List<Integer> Teams_Ids = Connection_SQL.getTeams_In_Tournament(Tournament_Id);

        // Saco todos los ganadores del torneo(Final)
        List<Integer> Winners = Connection_SQL.getWinners_In_Tournament(Tournament_Id, Teams_Ids, "Final");

        // Saco los pares de los ganadores
        if (Winners.size() == 1) {
            List<int[]> Pairs = Generate_Random_Pairs(Winners);
            CUD_SQL.Insert_Matches(Tournament_Id, Pairs, "Campeon");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficientes ganadores para emparejar las semifinales", "Mensaje Importante", JOptionPane.ERROR_MESSAGE);
        }

    }

}
