package WK2.D4;
import java.util.*;
class Employee{
    int eno;
    String name;
    String desn;
    Employee(int eno,String name,String desn){
        this.eno=eno;
        this.name=name;
        this.desn=desn;
    }
    public String toString(){
        return( "Employee Number = " + eno + " Name = " + name + " Designation = " + desn);
    }
}
public class TreeMapEmp {
    public static void main(String[] args) {
        TreeMap<Integer,Employee> tm =new TreeMap<Integer,Employee>();
        tm.put(1, new Employee(125,"Ram","Manager"));
        tm.put(2, new Employee(427,"Laxman","CEO"));
        tm.put(3,new Employee(552,"Sita","GM"));
        Set<Map.Entry<Integer,Employee>> s = tm.entrySet();
        for(Map.Entry<Integer,Employee> me:s)
        {
            System.out.println(me.getKey()+" "+me.getValue());
        }
        
    }
    
}
