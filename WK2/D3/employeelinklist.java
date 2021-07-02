package WK2.D3;

import java.util.*;

class Employee{
    private int eno;
    private String name;
    private String desn;
    Employee(int eno,String name,String desn){
        this.eno=eno;
        this.name=name;
        this.desn=desn;
    }
    public String toString(){
        return( "Employee Number = " + eno + " Name = " + name + " Designation = " + desn);
    }
}
public class employeelinklist {
    public static void main(String[] args) {
        List<Integer,Employee>ls = new LinkedList<Integer,Employee>();
        ls.put(1, new Employee(125,"Ram","Manager"));
        ls.put(2, new Employee(427,"Laxman","CEO"));
        ls.put(3,new Employee(552,"Sita","GM"));
        Set<List<Integer,Employee>> s = ls.entrySet();
        for(List<Integer,Employee> le:s)
        {
            System.out.println(le.getKey()+" "+le.getValue());
        }
    }
}
