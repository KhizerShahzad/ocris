/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.m.myaddregistrarimageapp;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;

/**
 *
 * @author Khizer Shahzad
 */
class FileWritter {
    void Registrarwriter()
    {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registrar","root", "");
            //conn.close();
            int id=4;
            String name ="fsfdsf";
            int sem = 12;
            String Name="Khizer";
            String Range="063";
            PreparedStatement ps= (PreparedStatement) conn.prepareStatement("insert into untitled values ('Khizer',1233,15)");
           
           ps.execute();
          /*  while(rs.next()){
            
                System.out.println("ID : "+rs.getInt(1));
                System.out.println("Name : "+rs.getString(2));
                System.out.println("Semester : "+rs.getInt(3));
            
            }*/
            conn.close();
        }catch(Exception e){
        
        e.printStackTrace();
        
        }
    }
    }
    

