package WK2.D6;

import java.util.*;

public class RmEvenIte {
    
    public static void main (String a[]){
        
    ArrayList<String> al = new ArrayList<String>();
    
        al.add("A");
        al.add("Ba");
        al.add("Cb");
        al.add("Deefa");
        al.add("Efg");
        al.add("Fmns");
        System.out.println(al);
        
        Iterator<String> ite = al.iterator();
        while(ite.hasNext()){
                if(ite.next().length()%2 == 0) {
                    ite.remove();
                }
        }System.out.println(al);
        
    }
    
}
                                                                   