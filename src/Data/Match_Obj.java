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
    private Team_Obj Local_Team;
    private Team_Obj Visitant_Team;
    private int Local_Goals;
    private int Visitor_Goals;
    private int Yellow_Cards;
    private int Red_Cards;
    private String Other_Sanctions;
    private String Annotador;

    public Match_Obj(int Match_Id, Team_Obj Local_Team, Team_Obj Visitant_Team, int Local_Goals, int Visitor_Goals, int Yellow_Cards, int Red_Cards, String Other_Sanctions, String Annotador) {
        this.Match_Id = Match_Id;
        this.Local_Team = Local_Team;
        this.Visitant_Team = Visitant_Team;
        this.Local_Goals = Local_Goals;
        this.Visitor_Goals = Visitor_Goals;
        this.Yellow_Cards = Yellow_Cards;
        this.Red_Cards = Red_Cards;
        this.Other_Sanctions = Other_Sanctions;
    }

    public int getMatch_Id() {
        return Match_Id;
    }

    public String getAnnotador() {
        return Annotador;
    }

    public void setAnnotador(String Annotador) {
        this.Annotador = Annotador;
    }

    public void setMatch_Id(int Match_Id) {
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

    public int getYellow_Cards() {
        return Yellow_Cards;
    }

    public void setYellow_Cards(int Yellow_Cards) {
        this.Yellow_Cards = Yellow_Cards;
    }

    public int getRed_Cards() {
        return Red_Cards;
    }

    public void setRed_Cards(int Red_Cards) {
        this.Red_Cards = Red_Cards;
    }

    public String getOther_Sanctions() {
        return Other_Sanctions;
    }

    public void setOther_Sanctions(String Other_Sanctions) {
        this.Other_Sanctions = Other_Sanctions;
    }

}
