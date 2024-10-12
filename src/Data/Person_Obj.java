/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author Admin
 */
public class Person_Obj {
    private int Id;
    private String Name;
    private String Adress;
    private String Contact_Number;

    public Person_Obj(int Id, String Name, String Adress, String Contact_Number) {
        this.Id = Id;
        this.Name = Name;
        this.Adress = Adress;
        this.Contact_Number = Contact_Number;
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

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String Contact_Number) {
        this.Contact_Number = Contact_Number;
    }
    
}
