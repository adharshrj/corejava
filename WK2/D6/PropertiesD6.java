package WK2.D6;
import java.util.*;
public class PropertiesD6 {
    public static void main (String a[]){
        Properties prop = new Properties();

        prop.put("A","1");
        prop.put("B","2");
        prop.put("C","3");
        prop.put("D","4");
        
        Set set1 = prop.keySet();
        for(Object newob : set1){
            System.out.println("KEY:" + newob + "\t VALUE:" + prop.getProperty((String)newob));
        }

    }
}
