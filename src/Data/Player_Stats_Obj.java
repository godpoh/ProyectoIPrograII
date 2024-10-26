/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Player_Stats_Obj {

    private int Match_Id;
    private int Player_Id;
    private int Sanction_Id;

    public Player_Stats_Obj(int Match_Id, int Player_Id, int Sanction_Id) {
        this.Match_Id = Match_Id;
        this.Player_Id = Player_Id;
        this.Sanction_Id = Sanction_Id;
    }

    public int getMatch_Id() {
        return Match_Id;
    }

    public void setMatch_Id(int Match_Id) {
        this.Match_Id = Match_Id;
    }

    public int getPlayer_Id() {
        return Player_Id;
    }

    public void setPlayer_Id(int Player_Id) {
        this.Player_Id = Player_Id;
    }

    public int getSanction_Id() {
        return Sanction_Id;
    }

    public void setSanction_Id(int Sanction_Id) {
        this.Sanction_Id = Sanction_Id;
    }

}
