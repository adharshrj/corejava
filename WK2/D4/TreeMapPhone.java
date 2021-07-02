package WK2.D4;
import java.util.*;
class Phone{
    String name;
    String pno;
    Phone(String name, String pno){
        this.name=name;
        this.pno=pno;
    }
    public String toString(){
        return( " Name = " + name + ", Phone Number = " + pno);
    }
}
public class TreeMapPhone {
    public static void main(String[] args) {
        TreeMap<Integer,Phone> tm =new TreeMap<Integer,Phone>();
        tm.put(1, new Phone("Ram", "9883410567"));
        tm.put(2, new Phone("Laxman", "8144248923"));
        tm.put(3,new Phone("Sita", "9176369430"));
        Set<Map.Entry<Integer,Phone>> s = tm.entrySet();
        for(Map.Entry<Integer,Phone> me:s)
        {
            System.out.println(me.getKey()+" "+me.getValue());
        }
        

        
    }
    
}
