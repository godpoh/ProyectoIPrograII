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

    private String Position;
    private int Dorsal;

    public Player(String Position, int Dorsal, int Id, String Name, String Adress, String Contact_Number) {
        super(Id, Name, Adress, Contact_Number);
        this.Position = Position;
        this.Dorsal = Dorsal;
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
