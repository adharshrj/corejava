package WK2.D3;

import java.util.*;
  
public class ListIterator1 {
    public static void main(String[] args)
    {
          // create a list of names
        List<String> names = new LinkedList<>();
        names.add("Hi");
        names.add("This is");
        names.add("Adharsh");
  
        // Getting ListIterator
        ListIterator<String> namesIterator
            = names.listIterator();
  
        // Traversing elements
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
  
        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }
}