/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;
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
    Date Date;
    private int Local_Team;
    private int Visitant_Team;
    private int Home_Points;
    private int Away_Points;
    private int Winner;
    private String Phase;

    public Match_Obj(int Match_Id, String Match_Name, String Tournament_Id, Date Date, int Local_Team, int Visitant_Team, int Home_Points, int Away_Points, int Winner, String Phase) {
        this.Match_Id = Match_Id;
        this.Match_Name = Match_Name;
        this.Tournament_Id = Tournament_Id;
        this.Date = Date;
        this.Local_Team = Local_Team;
        this.Visitant_Team = Visitant_Team;
        this.Home_Points = Home_Points;
        this.Away_Points = Away_Points;
        this.Winner = Winner;
        this.Phase = Phase;
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

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
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

    public int getHome_Points() {
        return Home_Points;
    }

    public void setHome_Points(int Home_Points) {
        this.Home_Points = Home_Points;
    }

    public int getAway_Points() {
        return Away_Points;
    }

    public void setAway_Points(int Away_Points) {
        this.Away_Points = Away_Points;
    }

    public int getWinner() {
        return Winner;
    }

    public void setWinner(int Winner) {
        this.Winner = Winner;
    }

    public String getPhase() {
        return Phase;
    }

    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    
    
}
