/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Player extends Person {

    private int Team_Id;
    private String Position;
    private int Dorsal;

    public Player(int Team_Id, String Position, int Dorsal, int Id, String Name, String Adress, String Contact_Number) {
        super(Id, Name, Adress, Contact_Number);
        this.Team_Id = Team_Id;
        this.Position = Position;
        this.Dorsal = Dorsal;
    }

    public int getTeam_Id() {
        return Team_Id;
    }

    public void setTeam_Id(int Team_Id) {
        this.Team_Id = Team_Id;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }

}
