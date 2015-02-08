/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khizer Shahzad
 */
import java.io.*;
import java.util.Scanner;
public class student_manager extends student{
    void print_student_info(String id)
    {
        String Name;
        id=id+".txt";
        String path="C:\\Users\\Khizer Shahzad\\Documents\\NetBeansProjects\\person\\files\\students\\";
        path=path+id;
        System.out.println(path);
        File stu=new File(path);
        try
        {
            String info;
        FileReader g=new FileReader(stu);
        Scanner scan=new Scanner(stu);
        
       info=scan.nextLine();
       System.out.println(info);
       int length;
   ///   length=info.length();
       
        
        
        }
        catch(FileNotFoundException a)
        {
            System.out.println("File not found");
        }
        
        
    }
    
}
