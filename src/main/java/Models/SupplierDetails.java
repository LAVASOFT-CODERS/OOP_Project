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
public class SupplierDetails {
    String SupID;
    String SName;
    String SAddress;
    String STelephone;
    String SEmail;

    public SupplierDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void PrintSupply() throws SQLException
    {
        ConnectTable rsmt=new ConnectTable();
         ResultSet rs=rsmt.executeQuery("select * from Supplier");
             while(rs.next())
                 System.out.println(rs.getString(1)+ "   "+rs.getString(2)+ " "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));

            
    }

    public SupplierDetails(String SupID, String SName, String SAddress, String STelephone, String SEmail) {
        this.SupID = SupID;
        this.SName = SName;
        this.SAddress = SAddress;
        this.STelephone = STelephone;
        this.SEmail = SEmail;
    }

    public String getSupID() {
        return SupID;
    }

    public String getSName() {
        return SName;
    }

    public String getSAddress() {
        return SAddress;
    }

    public String getSTelephone() {
        return STelephone;
    }

    public String getSEmail() {
        return SEmail;
    }

    public void setSupID(String SupID) {
        this.SupID = SupID;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }

    public void setSTelephone(String STelephone) {
        this.STelephone = STelephone;
    }

    public void setSEmail(String SEmail) {
        this.SEmail = SEmail;
    }

             
    
    
}
