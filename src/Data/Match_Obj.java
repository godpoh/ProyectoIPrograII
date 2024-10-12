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


    private Map<Tournament_Obj, Integer> Match_Id;      
    private Team_Obj Local_Team;
    private Team_Obj Visitant_Team;
    private int Local_Goals;
    private int Visitor_Goals;
    private Map<Player_Obj, Integer> Yellow_Cards;
    private Map<Player_Obj, Integer> Red_Cards;
    private Map<Player_Obj, String> Other_Sanctions;
    private Map<Player_Obj, Integer> Annotador;

    public Match_Obj(Map<Tournament_Obj, Integer> Match_Id, Team_Obj Local_Team, Team_Obj Visitant_Team, int Local_Goals, int Visitor_Goals, Map<Player_Obj, Integer> Yellow_Cards, Map<Player_Obj, Integer> Red_Cards, String Other_Sanctions, Map<Player_Obj, Integer> Annotador) {
        this.Match_Id = new HashMap<>();
        this.Local_Team = Local_Team;
        this.Visitant_Team = Visitant_Team;
        this.Local_Goals = Local_Goals;
        this.Visitor_Goals = Visitor_Goals;
        this.Yellow_Cards = new HashMap<>();
        this.Red_Cards = new HashMap<>();
        this.Other_Sanctions = new HashMap<>();
    }

    public Map<Tournament_Obj, Integer> getMatch_Id() {
        return Match_Id;
    }

    public Map<Player_Obj, Integer> getAnnotador() {
        return Annotador;
    }

    public void setAnnotador(Map<Player_Obj, Integer> Annotador) {
        this.Annotador = Annotador;
    }

    public void setMatch_Id(Map<Tournament_Obj, Integer> Match_Id) {
        this.Match_Id = Match_Id;
    }

    public Team_Obj getLocal_Team() {
        return Local_Team;
    }

    public void setLocal_Team(Team_Obj Local_Team) {
        this.Local_Team = Local_Team;
    }

    public Team_Obj getVisitant_Team() {
        return Visitant_Team;
    }

    public void setVisitant_Team(Team_Obj Visitant_Team) {
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

    public Map<Player_Obj, Integer> getYellow_Cards() {
        return Yellow_Cards;
    }

    public void setYellow_Cards(Map<Player_Obj, Integer> Yellow_Cards) {
        this.Yellow_Cards = Yellow_Cards;
    }

    public Map<Player_Obj, Integer> getRed_Cards() {
        return Red_Cards;
    }

    public void setRed_Cards(Map<Player_Obj, Integer> Red_Cards) {
        this.Red_Cards = Red_Cards;
    }

    public Map<Player_Obj, String> getOther_Sanctions() {
        return Other_Sanctions;
    }

    public void setOther_Sanctions(Map<Player_Obj, String>Other_Sanctions) {
        this.Other_Sanctions = Other_Sanctions;
    }

}
