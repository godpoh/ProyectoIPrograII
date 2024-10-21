/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Tournament_Teams_Obj {
    int    Tournament_Id;
    int Team_Id;

    public Tournament_Teams_Obj(int Tournament_Id, int Team_Id) {
        this.Tournament_Id = Tournament_Id;
        this.Team_Id = Team_Id;
    }

    public int getTournament_Id() {
        return Tournament_Id;
    }

    public void setTournament_Id(int Tournament_Id) {
        this.Tournament_Id = Tournament_Id;
    }

    public int getTeam_Id() {
        return Team_Id;
    }

    public void setTeam_Id(int Team_Id) {
        this.Team_Id = Team_Id;
    }
}