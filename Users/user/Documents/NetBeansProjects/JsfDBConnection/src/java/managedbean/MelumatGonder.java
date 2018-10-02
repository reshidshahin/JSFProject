/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Shahin_Rashidbayli
 */
@ManagedBean
@SessionScoped
public class MelumatGonder implements Serializable {

    String ad, soyad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String Dbgonder() throws SQLException {

        Connection myConn = null;
        
        int i = 0;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinama", "root", "AA12345aa!");
            String sql = "insert into user(ad,soyad) values(?,?)";
            PreparedStatement pst = myConn.prepareStatement(sql);
            pst.setString(1, ad);
            pst.setString(2, soyad);
            
            pst.execute();
            myConn.close();
        } 
        catch (Exception e) 
        {
            System.err.println(e);
        }
        if (i > 0) 
        {
            System.out.println("Success");
            return "suces?faces-redirect=true";
        } 
        else{
            System.out.println("Fail");
            return "fail?faces-redirect=true";
        }
    }
}
