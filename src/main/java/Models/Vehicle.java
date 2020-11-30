/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import DatabaseConnection.ConnectTable;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author INDUWARA
 */
public class Vehicle {
    String VID;
    String VType;
    String VIssue;
    String Email;

    public Vehicle(String VID, String VType, String VIssue, String Email) {
        this.VID = VID;
        this.VType = VType;
        this.VIssue = VIssue;
        this.Email = Email;
    }

    public String getVID() {
        return VID;
    }

    public String getVType() {
        return VType;
    }

    public String getVIssue() {
        return VIssue;
    }

    public String getEmail() {
        return Email;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public void setVType(String VType) {
        this.VType = VType;
    }

    public void setVIssue(String VIssue) {
        this.VIssue = VIssue;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
