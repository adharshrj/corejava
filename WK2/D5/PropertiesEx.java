package WK2.D5;
import java.util.*;
import java.io.*;
public class PropertiesEx {
    public static void main(String[] args) throws Exception
    {
        FileReader reader = new FileReader("WK2/D5/prop.properties");
        
        Properties p = new Properties();
        p.load(reader);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        
        Properties q = new Properties();
        q.setProperty("name", "adharsh");
        q.setProperty("city", "chennai");
        q.store(new FileWriter("name.properties"),"properties");
        System.out.println("Properties are stored");

       
    }
}
    
