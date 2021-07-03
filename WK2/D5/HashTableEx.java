package WK2.D5;
import java.io.*;
import java.util.*;
public class HashTableEx {
    public static void main(String args[])
    {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable<Integer, String> ht2 = new Hashtable<>();
  
        
        ht1.put(1, "A");
        ht1.put(2, "B");
        ht1.put(3, "C");
  
        ht2.put(4, "E");
        ht2.put(5, "F");
        ht2.put(6, "G");
  
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}
