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
public class Team_Obj {

    private int Team_Id;
    private String Team_Name;

    public Team_Obj(int Team_Id, String Team_Name) {
        this.Team_Id = Team_Id;
        this.Team_Name = Team_Name;
    }

    public int getTeam_Id() {
        return Team_Id;
    }

    public void setTeam_Id(int Team_Id) {
        this.Team_Id = Team_Id;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String Team_Name) {
        this.Team_Name = Team_Name;
    }

}
