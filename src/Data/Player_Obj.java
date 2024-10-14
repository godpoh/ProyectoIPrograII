/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Player_Obj {

    private int Id;
    private String Name;
    private String Last_Name1;
    private String Last_Name2;
    private String Contact_Number;
    private String Adress;
    private int Team_Id;
    private String Position;
    private int Dorsal;

    public Player_Obj(int Id, String Name, String Last_Name1, String Last_Name2, String Contact_Number, String Adress, int Team_Id, String Position, int Dorsal) {
        this.Id = Id;
        this.Name = Name;
        this.Last_Name1 = Last_Name1;
        this.Last_Name2 = Last_Name2;
        this.Contact_Number = Contact_Number;
        this.Adress = Adress;
        this.Team_Id = Team_Id;
        this.Position = Position;
        this.Dorsal = Dorsal;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLast_Name1() {
        return Last_Name1;
    }

    public void setLast_Name1(String Last_Name1) {
        this.Last_Name1 = Last_Name1;
    }

    public String getLast_Name2() {
        return Last_Name2;
    }

    public void setLast_Name2(String Last_Name2) {
        this.Last_Name2 = Last_Name2;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String Contact_Number) {
        this.Contact_Number = Contact_Number;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
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
