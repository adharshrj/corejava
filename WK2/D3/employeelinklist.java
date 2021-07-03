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
        LinkedList<Employee>ls = new LinkedList<Employee>();
        ls.add(new Employee(125,"Ram","Manager"));
        ls.add(new Employee(427,"Laxman","CEO"));
        ls.add(new Employee(552,"Sita","GM"));
        System.out.println(ls);
        
    }
}
