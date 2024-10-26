/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Match_Obj {


    private int Match_Id;  
    private String Match_Name;
    private String Tournament_Id;
    private int Local_Team;
    private int Visitant_Team;
    private int Local_Goals;
    private int Visitor_Goals;
    private String Winner;

    public Match_Obj(int Match_Id, String Match_Name, String Tournament_Id, int Local_Team, int Visitant_Team, int Local_Goals, int Visitor_Goals, String Winner) {
        this.Match_Id = Match_Id;
        this.Match_Name = Match_Name;
        this.Tournament_Id = Tournament_Id;
        this.Local_Team = Local_Team;
        this.Visitant_Team = Visitant_Team;
        this.Local_Goals = Local_Goals;
        this.Visitor_Goals = Visitor_Goals;
        this.Winner = Winner;
    }

    public int getMatch_Id() {
        return Match_Id;
    }

    public void setMatch_Id(int Match_Id) {
        this.Match_Id = Match_Id;
    }

    public String getMatch_Name() {
        return Match_Name;
    }

    public void setMatch_Name(String Match_Name) {
        this.Match_Name = Match_Name;
    }

    public String getTournament_Id() {
        return Tournament_Id;
    }

    public void setTournament_Id(String Tournament_Id) {
        this.Tournament_Id = Tournament_Id;
    }

    public int getLocal_Team() {
        return Local_Team;
    }

    public void setLocal_Team(int Local_Team) {
        this.Local_Team = Local_Team;
    }

    public int getVisitant_Team() {
        return Visitant_Team;
    }

    public void setVisitant_Team(int Visitant_Team) {
        this.Visitant_Team = Visitant_Team;
    }

    public int getLocal_Goals() {
        return Local_Goals;
    }

    public void setLocal_Goals(int Local_Goals) {
        this.Local_Goals = Local_Goals;
    }

    public int getVisitor_Goals() {
        return Visitor_Goals;
    }

    public void setVisitor_Goals(int Visitor_Goals) {
        this.Visitor_Goals = Visitor_Goals;
    }

    public String getWinner() {
        return Winner;
    }

    public void setWinner(String Winner) {
        this.Winner = Winner;
    }

   

}
