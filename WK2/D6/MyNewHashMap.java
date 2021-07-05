package WK2.D6;
import java.util.*;
class MyOwnClass{
    
    private String name;
    private int age;
    MyOwnClass(String name,int age){
        
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return( "Name = " + name + " Age = " + age);
    }
}
public class MyNewHashMap {
    public static void main(String args[])
    {
        Hashtable<Integer,MyOwnClass> ht = new Hashtable<>();
        ht.put(1, new MyOwnClass("Ram", 25));
        ht.put(2, new MyOwnClass("Laxman", 23));
        ht.put(3, new MyOwnClass("Sita", 24));
        ht.put(4, new MyOwnClass("Shyam", 20));
    
        Set<Integer> s = ht.keySet();
     
        Iterator<Integer> itr = s.iterator();
     
        while (itr.hasNext()) { 
           System.out.println(ht);
        } 

    }
}