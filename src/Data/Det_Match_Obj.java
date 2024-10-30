/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Det_Match_Obj {
    Integer Match_Id;
    int Sanction_Id;
    int Player_Id;
    int Time;

    public Det_Match_Obj(Integer Match_Id, int Sanction_Id, int Player_Id, int Time) {
        this.Match_Id = Match_Id;
        this.Sanction_Id = Sanction_Id;
        this.Player_Id = Player_Id;
        this.Time = Time;
    }

      
    public Integer getMatch_Id() {
        return Match_Id;
    }

    public void setMatch_Id(Integer Match_Id) {
        this.Match_Id = Match_Id;
    }

    public int getSanction_Id() {
        return Sanction_Id;
    }

    public void setSanction_Id(int Sanction_Id) {
        this.Sanction_Id = Sanction_Id;
    }

    public int getPlayer_Id() {
        return Player_Id;
    }

    public void setPlayer_Id(int Player_Id) {
        this.Player_Id = Player_Id;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }
    
}
