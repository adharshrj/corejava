package WK2.D5;
import java.util.*;
public class VectorAdd {
    public static void main(String args[])
    {
    Vector<String> va = new Vector<String>();

    va.add("A");
    va.add("B");
    va.add("C");
    va.add("D");

    System.out.println("Vector.." + va);

    va.add("E");
    va.add("F");
    va.add("G");

    System.out.println("New Vector.." + va);
    }
}
