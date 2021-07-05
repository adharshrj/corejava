package WK2.D6;
import java.util.*;
public class EnumHashTable {
    public static void main(String[] args)
    {
 
        Hashtable<Integer, String> ht = new Hashtable<>();
 
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");
 
 
        Enumeration<Integer> e = ht.keys();
 
  
        while (e.hasMoreElements()) {
 
            int key = e.nextElement();

            System.out.println("Rank : " + key
                               + "\t Name : "
                               + ht.get(key));
        }
    }
    
}
