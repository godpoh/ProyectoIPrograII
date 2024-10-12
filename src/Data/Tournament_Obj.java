/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Tournament_Obj {
    private int idTournament;
    private String Tournament_Name;
    private List<Match_Obj> Matches;

    public Tournament_Obj(int idTournament, String Tournament_Name, List<Match_Obj> Matches) {
        this.idTournament = idTournament;
        this.Tournament_Name = Tournament_Name;
        this.Matches = Matches;
    }

    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
    }

    public String getTournament_Name() {
        return Tournament_Name;
    }

    public void setTournament_Name(String Tournament_Name) {
        this.Tournament_Name = Tournament_Name;
    }

    public List<Match_Obj> getMatches() {
        return Matches;
    }

    public void setMatches(List<Match_Obj> Matches) {
        this.Matches = Matches;
    }

}
