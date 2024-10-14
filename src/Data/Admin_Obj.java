/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author user
 */
public class Admin_Obj extends Person_Obj {
    private String Password;

    public Admin_Obj(String Password, int Id, String Name, String Last_Name1, String Last_Name2) {
        super(Id, Name, Last_Name1, Last_Name2);
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
