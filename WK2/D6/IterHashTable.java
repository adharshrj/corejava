package WK2.D6;
import java.util.*;
public class IterHashTable {
    public static void main(String[] args) {
 
        String str;
   
        Hashtable<String, String> ht = new Hashtable<String, String>();
     
  
        ht.put("A", "Ferrari");
        ht.put("B", "Aston Martin");
        ht.put("C", "Lamborghini");
        ht.put("D", "Lotus");
        ht.put("E", "Land Rover");
     
        System.out.println("Cars in Hashtable:");

        Set<String> s = ht.keySet();
     
        Iterator<String> itr = s.iterator();
     
        while (itr.hasNext()) { 
      
           str = itr.next();
 
           System.out.println("Key: "+str+" & Value: "+ht.get(str));
        } 
     }
    
}
