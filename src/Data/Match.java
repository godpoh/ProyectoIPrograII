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
public class Match {

    private String Match_Id;
    private Team Local_Team;
    private Team Visitant_Team;
    private int Local_Goals;
    private int Visitor_Goals;
    private Map<Player, Integer> Yellow_Cards;
    private Map<Player, Integer> Red_Cards;
    private String Other_Sanctions;

    public Match(String Match_Id, Team Local_Team, Team Visitant_Team, int Local_Goals, int Visitor_Goals, Map<Player, Integer> Yellow_Cards, Map<Player, Integer> Red_Cards, String Other_Sanctions) {
        this.Match_Id = Match_Id;
        this.Local_Team = Local_Team;
        this.Visitant_Team = Visitant_Team;
        this.Local_Goals = Local_Goals;
        this.Visitor_Goals = Visitor_Goals;
        this.Yellow_Cards = new HashMap<>();
        this.Red_Cards = new HashMap<>();
        this.Other_Sanctions = Other_Sanctions;
    }

    public String getMatch_Id() {
        return Match_Id;
    }

    public void setMatch_Id(String Match_Id) {
        this.Match_Id = Match_Id;
    }

    public Team getLocal_Team() {
        return Local_Team;
    }

    public void setLocal_Team(Team Local_Team) {
        this.Local_Team = Local_Team;
    }

    public Team getVisitant_Team() {
        return Visitant_Team;
    }

    public void setVisitant_Team(Team Visitant_Team) {
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

    public Map<Player, Integer> getYellow_Cards() {
        return Yellow_Cards;
    }

    public void setYellow_Cards(Map<Player, Integer> Yellow_Cards) {
        this.Yellow_Cards = Yellow_Cards;
    }

    public Map<Player, Integer> getRed_Cards() {
        return Red_Cards;
    }

    public void setRed_Cards(Map<Player, Integer> Red_Cards) {
        this.Red_Cards = Red_Cards;
    }

    public String getOther_Sanctions() {
        return Other_Sanctions;
    }

    public void setOther_Sanctions(String Other_Sanctions) {
        this.Other_Sanctions = Other_Sanctions;
    }

}
