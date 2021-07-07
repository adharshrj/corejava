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
        HashSet<MyOwnClass> hs = new HashSet<>();
        hs.add(new MyOwnClass("Ram", 25));
        hs.add(new MyOwnClass("Laxman", 23));
        hs.add(new MyOwnClass("Sita", 24));
        hs.add(new MyOwnClass("Shyam", 20));
    
        //Set<Integer> s = hs.keySet();
     
        Iterator<MyOwnClass> itr = hs.iterator();
     
        while (itr.hasNext()) { 
           itr.next();
           System.out.println(hs);
        } 

    }
}