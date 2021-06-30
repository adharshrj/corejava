package WK2.D2.listsum;

import java.util.*;
import java.io.*;

public class listsumforloop {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(); //create array list
        list.add(52);                            //list.add to add list elements
        list.add(61);
        list.add(77);
        list.add(10);
        list.add(91);
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);                //use list.get method to get list
  
        System.out.println("The sum is " + sum);
    }
    
}
