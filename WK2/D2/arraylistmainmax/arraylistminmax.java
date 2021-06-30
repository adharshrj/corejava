package WK2.D2.arraylistmainmax;

import java.util.*;
public class arraylistminmax {
    public static void main(String args[])
    {
  
        // initializing the ArrayList elements
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(209);
        arr.add(844);
        arr.add(382);
        arr.add(921);
        arr.add(331);
  
        int min = arr.get(0);
        int max = arr.get(0);
  
        // store the length of the ArrayList in variable n
        int n = arr.size();
  
        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
  
        // loop to find maximum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
  
        // The result will be printed
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}