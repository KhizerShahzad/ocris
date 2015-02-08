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


public class CourseManager extends subject {
 protected  Boolean createnewcourse(String name,int limit,String course_code,String section) throws FileNotFoundException
    {
        
        Boolean a=false;
        File o=new File("C:\\Users\\Khizer Shahzad\\Documents\\NetBeansProjects\\person\\files\\subjectmanegment\\subjectlist.txt");
     try  {
        FileWriter q = new FileWriter(o,true);
       
        q.append(' ');
        
        q.write(name);
        
        q.append(',');
        q.write(section);
         q.append(',');
         q.write(course_code);
         q.write(',');
         q.close();
       
     }
     catch(FileNotFoundException q)
     {
         
     }
     catch(IOException q)
     {
         
     }
        
        
        return a;
        
        
        
        
        
   
        
        
    }
    
    
}
