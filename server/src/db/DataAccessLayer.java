/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import DTO.UsersDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.derby.jdbc.ClientDriver;

/**
 *
 * @author mosta
 */
public class DataAccessLayer {
     public static int Register(UsersDTO user) throws SQLException
    {
//        ArrayList<UsersDTO>arr= new ArrayList<UsersDTO>();
//        UsersDTO u = new UsersDTO();
//        arr.add(u)
                
        int ret=0;
        DriverManager.registerDriver(new ClientDriver());
        Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/tictactoe","root","root");
        PreparedStatement ps = con.prepareStatement("insert into users (username,email,userpass,score) values (?,?,?,0,offline)");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getUserPass());     
        ret=ps.executeUpdate();
        con.close();
        return ret;
    }
     public static ArrayList<UsersDTO> getAllOnline() throws SQLException{
        
        ArrayList<UsersDTO> arr = new ArrayList<UsersDTO>();
        
        UsersDTO user;
    
        DriverManager.registerDriver(new ClientDriver());
        
      
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/tictactoe" , "root", "root");
        
       
        PreparedStatement ps = con.prepareStatement("select * from users where status = ? || status = ? ");
       //we should remove the playing?????
        ps.setString(1, "playing");
        ps.setString(2, "online");

        //result will get only the first ???
        ResultSet result = ps.executeQuery();
        while(result.next()){
            user = new UsersDTO(result.getInt(1),result.getString(2) , result.getString(3) , result.getString(5) , result.getInt(4) , result.getString(6));
            arr.add(user);
        }
        
        con.close();
        return arr;
    }

}
