/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author user
 */
public class Admin_Obj {

    private int Id;
    private String Name;
    private String Last_Name1;
    private String Last_Name2;
    private String Password;
    private String Category;

    public Admin_Obj(int Id, String Name, String Last_Name1, String Last_Name2, String Password, String Category) {
        this.Id = Id;
        this.Name = Name;
        this.Last_Name1 = Last_Name1;
        this.Last_Name2 = Last_Name2;
        this.Password = Password;
        this.Category = Category;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }


}
