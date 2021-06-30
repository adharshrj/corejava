package WK2.D2.arraylistreplace;

import java.io.*;
import java.util.*;

public class arraylistreplace {
    public static void main(String[] args)
    {
        try {
            ArrayList<String> list = new ArrayList<>();
            // adding elements to the list
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            System.out.println(list);
            // 2 is the index of the element "B".
            //"B" will be replaced by "E"
            list.set(2, "E");
            System.out.println(list);
            list.set(6, "z");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
