package WK2.D2.arrayelement;
import java.util.*;

public class arrayelement {
    public static void main(String[] args){
        ArrayList<String> arrlist = new ArrayList<String>();

        arrlist.add("Checking");
        arrlist.add("if element");
        arrlist.add("is present");
        arrlist.add("in");
        arrlist.add("Arraylist");

        System.out.println(arrlist.contains("Checking"));
        System.out.println(arrlist.contains("if element"));
        System.out.println(arrlist.contains("in"));
        System.out.println(arrlist.contains("Arraylist"));
    }
    
}
