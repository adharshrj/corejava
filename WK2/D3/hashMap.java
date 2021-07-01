package WK2.D3;

import java.util.*;
public class hashMap {
    public static void main(String a[]) {
        
    
    HashMap<Integer, String> hMapNumbers = new HashMap<Integer, String>();
        hMapNumbers.put(1, "One");
        hMapNumbers.put(2, "Two");
        hMapNumbers.put(3, "Three");
        
        Collection<String> values = hMapNumbers.values();
        for(String value : values){
            System.out.println( values );
        }
    }
}
