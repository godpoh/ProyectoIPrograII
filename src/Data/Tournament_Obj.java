/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Tournament_Obj {

    private int idTournament;
    private String Tournament_Name;
    private Date Start_Date;
    private Date End_Date;

    public Tournament_Obj(int idTournament, String Tournament_Name, Date Start_Date, Date End_Date) {
        this.idTournament = idTournament;
        this.Tournament_Name = Tournament_Name;
        this.Start_Date = Start_Date;
        this.End_Date = End_Date;
    }

    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
    }

    public String getTournament_Name() {
        return Tournament_Name;
    }

    public void setTournament_Name(String Tournament_Name) {
        this.Tournament_Name = Tournament_Name;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date Start_Date) {
        this.Start_Date = Start_Date;
    }

    public Date getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(Date End_Date) {
        this.End_Date = End_Date;
    }

    
}
