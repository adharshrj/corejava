package WK2.D6;

import java.util.*;


public class RmevenArList {
    public static void main (String a[]){
        
    ArrayList<String> al = new ArrayList<String>();
    
        al.add("A");
        al.add("Ba");
        al.add("Cb");
        al.add("Deefa");
        al.add("Efg");
        al.add("Fmns");
        System.out.println(al);
        
        for (int i = 0; i < al.size(); i++) {
                String s = al.get(i);
                if(s.length()%2 == 0) {
                    al.remove(i);
                    i--;
                }
        }System.out.println(al);
        
    }
    
}
