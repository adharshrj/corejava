package WK2.D3;
import java.util.*;
public class hashmapls {
    public static void main(String a[])
    {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        int minValueInMap=(Collections.min(map.values()));  
        int maxKeyInMap=(Collections.max(map.keySet()));
        System.out.println(minValueInMap);
        System.out.println(maxKeyInMap);


        
    
    }
}